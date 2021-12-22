package com.example.bmi_analyzer.OOP;

public class FoodModel {

    String name;
    String calories;
    String foodType;
    String photo;
    String id;

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public String getCalories() {
        return calories;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getPhoto() {
        return photo;
    }


    public String getId() { return id; }

    public FoodModel(String name, String calories, String foodType, String photo, String id) {
        this.name = name;
        this.calories = calories;
        this.foodType = foodType;
        this.photo = photo;
        this.id = id;
    }



}



