package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Student> list = new ArrayList<>();
    static double average=0;
    static double min= 9999999;
    static double max= -9999999;
    static double sum=0;
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++)
        {
            Student student = new Student();
            student.setName("曾鹏");
            student.setAge(20);
            student.setSex("男");
            student.setStuNum("2018");
            student.setGrade("大一");
            student.setScore(i*10);
            list.add(student);
        }

        for (int i = 0; i <list.size() ; i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+student.getScore()+student.getStuNum()+student.getGrade()+student.getSex());
        }
        System.out.println(getMaxScore(list) + "\n" + getMinScore(list) + "\n" + getAverageScore(list));
    }


    public static double getMaxScore(List<Student> list)  //最高成绩
    {
        for(int i=0;i<list.size();i++)
        {
            if (max < list.get(i).getScore())
            {
               max = list.get(i).getScore();
            }
        }
        return max;

    }

    public static double getMinScore(List<Student> list)  //最低成绩
    {
        for(int i=0;i<list.size();i++)
        {
            if (min > list.get(i).getScore())
            {
                min = list.get(i).getScore();
            }
        }
        return min;
    }

    public static double getAverageScore(List<Student> list)//平均值
    {
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i).getScore();
            average = sum / list.size();
        }
        return average;
    }
}



