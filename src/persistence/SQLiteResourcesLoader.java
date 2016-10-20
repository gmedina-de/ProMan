package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaslang.control.Try;
import model.Resource;

public class SQLiteResourcesLoader {

    public static ArrayList<Resource> getResources(int projectId) {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> getResourcesFromDB(statement, projectId))
                .get();
    }

    private static ArrayList<Resource> getResourcesFromDB(Statement statement, int projectId) throws SQLException {
        ArrayList<Resource> resources = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM RECURSO WHERE Proyecto='" + projectId + "'");

        while (resultSet.next()) {
            resources.add(new Resource(resultSet.getInt("ID"), resultSet.getString("Nombre"), resultSet.getFloat("Valor"), resultSet.getInt("Proyecto")));
        }

        return resources;
    }
}
