package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    private String hairColor;
    private char gender;
    private String eyeColor;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }
    public String getHairColor(){
        return hairColor;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public String getEyeColor(){
        return eyeColor;
    }
}
