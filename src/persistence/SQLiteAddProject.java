package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javaslang.control.Try;
import model.Project;

public class SQLiteAddProject {

    public static ArrayList<Project> addProject(String name, String description) {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> addProjectToDB(statement, name, description))
                .get();
    }

    private static ArrayList<Project> addProjectToDB(Statement statement, String name, String description) throws SQLException {
        statement.executeUpdate("INSERT INTO Proyecto (Nombre,Descripcion)"
                + "VALUES ('" + name + "','" + description + "')");
        return SQLiteProjectsLoader.getProjects();
    }
}
