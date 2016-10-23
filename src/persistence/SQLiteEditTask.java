/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaslang.control.Try;
import model.Task;

/**
 *
 * @author Zabai Armas
 */
public class SQLiteEditTask {
    public static ArrayList<Task> editTask(int id, String name, String descripcion, int duracion, long fechaInicio, long fechaFin, int priority, int idProyecto) {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> editTaskInDB(statement, id, name, descripcion, duracion, fechaInicio, fechaFin, priority, idProyecto))
                .get();
    }

    private static ArrayList<Task> editTaskInDB(Statement statement, int id, String name, String descripcion, int duracion, long fechaInicio, long fechaFin, int priority, int idProyecto) throws SQLException {
        statement.executeUpdate("UPDATE Tarea SET Nombre = '" + name + "', DuracionEstimada = " + duracion + ", Descripcion = '" + descripcion
                + "', FechaInicio = " + fechaInicio + ", FechaFin = " + fechaFin + ", Prioridad = " + priority + " WHERE ID = " + id + ";");
        return SQLiteTasksLoader.getTasks(idProyecto);
    }
}
