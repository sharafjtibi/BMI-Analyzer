package com.example.bmi_analyzer.adapter;

public class FoodModel {

    String name;
    String calories;
    String foodType;
    String photo;

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

    public FoodModel(String name, String calories, String foodType, String photo) {
        this.name = name;
        this.calories = calories;
        this.foodType = foodType;
        this.photo = photo;
    }
}



