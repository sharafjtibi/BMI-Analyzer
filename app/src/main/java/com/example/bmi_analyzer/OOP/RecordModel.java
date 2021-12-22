package com.example.bmi_analyzer.OOP;

public class RecordModel {

    String status;
    String date;
    double length;
    double weight;


    public String getStatus() {
        return status;
    }
    public String getDate() {
        return date;
    }
    public double getLength() {
        return length;
    }
    public double getWeight() {
        return weight;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }



    public RecordModel(String status, String date, double length, double weight) {
        this.status = status;
        this.date = date;
        this.length = length;
        this.weight = weight;
    }

    public void setId(String key) {
    }
}



