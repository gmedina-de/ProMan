package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaslang.control.Try;
import model.Task;

public class SQLiteAddTask {

    public static ArrayList<Task> addTask(String name, int duracionEstimada, int priority, int idProyecto) {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> addTaskToDB(statement, name, duracionEstimada, priority, idProyecto))
                .get();
    }

    private static ArrayList<Task> addTaskToDB(Statement statement, String name, int duracionEstimada, int priority, int idProyecto) throws SQLException {
        statement.executeUpdate("INSERT INTO Tarea (Nombre,DuracionEstimada,Prioridad,Proyecto)"
                + "VALUES ('" + name + "','" + duracionEstimada + "','" + priority + "','" + idProyecto + "')");
        return SQLiteTasksLoader.getTasks(idProyecto);
    }
}
