package com.example.bmi_analyzer.OOP;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;

import java.util.ArrayList;

public class User {
    public static User user;
    private FirebaseAuth mAuth;
    private ArrayList<RecordModel> records = new ArrayList<RecordModel>();
    private ArrayList<FoodModel> foods = new ArrayList<FoodModel>();
    private String name, email, password, bd;
    private boolean male;

    public User(String name, String email, String password, String re_password, AppCompatActivity context, User context1){
        this.name = name;
        this.email = email;
        this.password = password;
//        FireBaseConnection.registration(this.context);
    }

    public FirebaseAuth getmAuth() {
        return mAuth;
    }

    public void setmAuth(FirebaseAuth mAuth) {
        this.mAuth = mAuth;
    }


    public User(User context, String email, String password) {

        this.email = email;
        this.password = password;
    }

    public User(User context, FirebaseAuth mAuth) {

        this.mAuth = mAuth;
    }
    public  boolean isMale() {return male;}

    public static User getUser() {
        return user;
    }

    public ArrayList<RecordModel> getRecords() {
        return records;
    }

    public ArrayList<FoodModel> getFoods() {
        return foods;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getBd() {
        return bd;
    }

    public static void setUser(User user) {
        User.user = user;
    }

    public void setRecords(ArrayList<RecordModel> records) {
        this.records = records;
    }

    public void setFoods(ArrayList<FoodModel> foods) {
        this.foods = foods;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isNewUser(User user) {
        return true;
    }
    public static void updateLists(DataSnapshot dataSnapshot, AppCompatActivity actv){}
}


