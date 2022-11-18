/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 *
 */
public class User {
    private int userId = ' ';
    private String userName;
    private String userEmail;
    private String userGender;
    private String userPassword;
    private int userCategoryId;
    private int userFollowers;
    
    
    public User(){
        
    }
    
    public User(int userId, String userName, String userEmail, String userGender, String userPassword, int userCategoryId, int userFollowers){
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.userPassword = userPassword;
        this.userCategoryId = userCategoryId;
        this.userFollowers = userFollowers;
    }
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }
    
    public void setUserGender(String userGender){
        this.userGender = userGender;
    }
    
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
    
    public void setUserCategoryId(int userCategoryId){
        this.userCategoryId = userCategoryId;
    }
    
    public void setUserFollowers(int userFollowers){
        this.userFollowers = userFollowers;
    }
    
    public int getUserId(){
        return this.userId;
    }
    
    public String getUserName(){
        return this.userName;
    }
    
    public String getUserEmail(){
        return this.userEmail;
    }
    
    public String getUserGender(){
        return this.userGender;
    }
    
    public String getUserPassword(){
        return this.userPassword;
    }
    
    public int getUserCategoryId(){
        return this.userCategoryId;
    }
    
    public int getUserFollowers(){
        return this.userFollowers;
    }
    
    @Override
    public String toString() {
        return "User{" + "idUser=" + this.userId + ", userName=" + this.userName + ", email=" + this.userEmail + ", gender=" + this.userGender + ", password=" + this.userPassword + ", userCategoryID: " + this.userCategoryId + ", userFollowers:" + this.userFollowers+'}';
    }
}
