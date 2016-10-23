package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaslang.control.Try;
import model.Person;

public class SQLitePersonLoader {

    public static Person getUser(String name, String password) {
        return Try.of(() -> DriverManager.getConnection("jdbc:sqlite:database.db"))
                .mapTry((Connection connection) -> connection.createStatement())
                .mapTry((Statement statement) -> getUserFromDB(statement, name, password))
                .get();
    }

    private static Person getUserFromDB(Statement statement, String name, String password) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM PERSONAL WHERE Nombre='" + name + "' AND Contraseña='" + password + "'");
        Person persona = null;
        if (resultSet.next()) {
            persona = new Person(resultSet.getInt("ID"), resultSet.getString("Nombre"), resultSet.getString("Contraseña"));
        }

        return persona;
    }
}
