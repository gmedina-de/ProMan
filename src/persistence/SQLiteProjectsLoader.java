package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaslang.control.Try;
import model.Project;

public class SQLiteProjectsLoader {

    public static ArrayList<Project> getProjects() {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> getProjectsFromDB(statement))
                .get();
    }

    private static ArrayList<Project> getProjectsFromDB(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Proyecto");
        ArrayList<Project> projects = new ArrayList<>();
        while (resultSet.next()) 
            projects.add(new Project(resultSet.getInt("ID"), resultSet.getString("Nombre"), resultSet.getString("Descripcion")));
        
        return projects;
    }
}
