package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaslang.control.Try;
import model.Task;

public class SQLiteRemoveTask {

    public static ArrayList<Task> removeTask(int idTarea, int idProyecto) {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> removeTaskInDB(statement, idTarea, idProyecto))
                .get();
    }

    private static ArrayList<Task> removeTaskInDB(Statement statement, int idTarea, int idProyecto) throws SQLException {
        statement.executeUpdate("DELETE FROM Tarea WHERE ID='" + idTarea + "'");
        return SQLiteTasksLoader.getTasks(idProyecto);
    }
}
