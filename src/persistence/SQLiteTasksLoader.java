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

    public static ArrayList<Task> getTasks(int idProyecto) {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> getTasksFromDB(statement, idProyecto))
                .get();
    }

    private static ArrayList<Task> getTasksFromDB(Statement statement, int idProyecto) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Tarea WHERE Proyecto='" + idProyecto + "'");
        ArrayList<Task> tasks = new ArrayList<>();
        while (resultSet.next()) {
            tasks.add(new Task(resultSet.getInt("ID"), resultSet.getString("Nombre"),resultSet.getString("Descripcion"), resultSet.getInt("DuracionEstimada"),
                    resultSet.getLong("FechaInicio"), resultSet.getLong("FechaFin"), resultSet.getInt("Prioridad"), resultSet.getInt("Estado"), resultSet.getInt("Padre"), resultSet.getInt("Proyecto")));
        }

        return tasks;
    }
}
