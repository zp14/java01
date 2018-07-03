package com.company;

public class Student extends Person{

   private String stuNum;
   private String grade;
   private double score;

    public Student(String name, int age, String sex, String stuNum, String grade, double score) {
        super(name, age, sex);
        this.stuNum = stuNum;
        this.grade = grade;
        this.score = score;
    }

    public Student() {
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
