package com.example.homework_18_05_23;

import java.io.Serializable;

public class TelephoneModel implements Serializable {
    int image;
    String name;
    String title;
    String year;
    String memory;
    String sum;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public TelephoneModel(int image, String name, String title, String year, String memory, String sum) {
        this.image = image;
        this.name = name;
        this.title = title;
        this.year = year;
        this.memory = memory;
        this.sum = sum;
    }
}
