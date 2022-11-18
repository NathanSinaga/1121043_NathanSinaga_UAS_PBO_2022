/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import View.MenuUtama;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * 
 */
public class Controller {    
    static DatabaseHandler conn = new DatabaseHandler();
    
    //Singleton
    User newUser =  new User();
    
    public Controller(){
        ArrayList<User> pencarian= getUserByCategoryId(1);
        for(int i = 0; i < pencarian.size(); i++){
            System.out.println(pencarian.get(i).toString());
        }
        
        //MenuUtama newMenuUtama = new MenuUtama();
        
    }

    // Data semua category
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM user";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("userId"));
                user.setUserName(rs.getString("userName"));
                user.setUserEmail(rs.getString("userEmail"));
                user.setUserGender(rs.getString("userGender"));
                user.setUserCategoryId(rs.getInt("userCategory"));
                user.setUserFollowers(rs.getInt("userFollowers"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }

    // Data category pilihan
    public static ArrayList<User> getUserByCategoryId(int categoryId) {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM user WHERE userCategory='" + categoryId + "'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("userId"));
                user.setUserName(rs.getString("userName"));
                user.setUserEmail(rs.getString("userEmail"));
                user.setUserGender(rs.getString("userGender"));
                user.setUserCategoryId(rs.getInt("userCategory"));
                user.setUserFollowers(rs.getInt("userFollowers"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }
    
    // INSERT user baru
    public static boolean insertNewUser(User user) {
        conn.connect();
        String query = "INSERT INTO user VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, ' ');
            stmt.setString(2, user.getUserName());
            stmt.setString(3, user.getUserEmail());
            stmt.setString(4, user.getUserPassword());
            stmt.setString(5, user.getUserGender());
            stmt.setInt(6, user.getUserCategoryId());
            stmt.setInt(7, user.getUserFollowers());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // UPDATE user
    public static boolean updateUser(User user) {
        conn.connect();
        String query = "UPDATE user SET userName='" + user.getUserName() + "', "
                + "userEmail='" + user.getUserEmail() + "', "
                + "userPassword='" + user.getUserPassword() + "', "
                + "userGender='" + user.getUserGender() + "', "
                + "userCategory='" + user.getUserCategoryId() + "', "
                + "userFollowers='" + user.getUserFollowers() + "' "
                + "WHERE userId='" + user.getUserId() + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // DELETE user
    public static boolean deleteUser(String userId) {
        conn.connect();

        String query = "DELETE FROM user WHERE userId='" + userId + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
