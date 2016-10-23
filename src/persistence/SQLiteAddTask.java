package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaslang.control.Try;
import model.Task;

public class SQLiteAddTask {

    public static ArrayList<Task> addTask(String name, String description, int duracionEstimada, long fechaInicio, long fechaFin, int priority, int idProyecto) {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> addTaskToDB(statement, name, description, duracionEstimada, fechaInicio, fechaFin, priority, idProyecto))
                .get();
    }

    private static ArrayList<Task> addTaskToDB(Statement statement, String name, String description, int duracionEstimada, long fechaInicio, long fechaFin, int priority, int idProyecto) throws SQLException {
        statement.executeUpdate("INSERT INTO Tarea (Nombre,Descripcion,DuracionEstimada,FechaInicio,FechaFin,Prioridad,Proyecto)"
                + "VALUES ('" + name + "','" + description + "','" + duracionEstimada + "','" + fechaInicio + "','" + fechaFin + "','" + priority + "','" + idProyecto + "')");
        return SQLiteTasksLoader.getTasks(idProyecto);
    }
}
