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
import model.Project;

/**
 *
 * @author Zabai Armas
 */
public class SQLiteRemoveProject {
    public static ArrayList<Project> deleteProject(int id) {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> deleteProjectDB(statement, id))
                .get();
    }

    private static ArrayList<Project> deleteProjectDB(Statement statement, int id) throws SQLException {
        statement.executeUpdate("DELETE FROM Proyecto "
                + "WHERE ID = " + id + ";");
        return SQLiteProjectsLoader.getProjects();
    }
}
