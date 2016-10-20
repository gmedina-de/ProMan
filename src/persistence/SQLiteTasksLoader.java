package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaslang.control.Try;
import model.Task;

/**
 *
 * @author alour
 */
public class SQLiteTasksLoader {

    public static ArrayList<Task> getTasks() {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> getTasksFromDB(statement))
                .get();
    }

    private static ArrayList<Task> getTasksFromDB(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Tarea");
        ArrayList<Task> tasks = new ArrayList<>();
        while (resultSet.next()) {
            tasks.add(new Task(resultSet.getInt("ID"), resultSet.getString("Nombre"), resultSet.getInt("DuracionEstimada"),
                    resultSet.getInt("FechaInicio"), resultSet.getInt("FechaFin"), resultSet.getInt("Prioridad")));
        }

        return tasks;
    }
}
