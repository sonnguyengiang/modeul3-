package dao;

import models.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectAccount {
    static String select = "select * from account";

    public static List<Account> seclect() throws SQLException, ClassNotFoundException {
        ArrayList<Account> list = new ArrayList<>();
        // tạo connect đến CSDL
        Connection connection = ConnectMySql.getConnect();
        // tạo ra Statement bằng connection.
        Statement statement = connection.createStatement();
        // thực câu truy vấn bằng statement.executeQuery và kết quả trả về là ResultSet;
        ResultSet resultSet = statement.executeQuery(select);

        while (resultSet.next()) {
            int id = Integer.parseInt(resultSet.getString("id"));
            String username = resultSet.getString("username");
            String password =resultSet.getString("password");
            String gmail =resultSet.getString("gmail");

            list.add(new Account(id,username,password,gmail));
        }
        return list;
    }
}