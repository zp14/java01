package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Student> list = new ArrayList<>();

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            Student student = new Student("zhanshan" + i, true, i);
//            list.add(student);
//        }
//        list.remove(4);
//        int average = 0;
//        int min = 9999;
//        int max = -1;
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (min > list.get(i).getAge()) {
//                min = list.get(i).getAge();
//            }
//            if (max < list.get(i).getAge()) {
//                max = list.get(i).getAge();
//            }
//
//            sum += list.get(i).getAge();
//            System.out.println(list.get(i).getName());
//            System.out.println(list.get(i).isSex());
//            System.out.println(list.get(i).getAge());
//        }
//        average = sum / list.size();
//        System.out.println(average);
//        System.out.println(min);
//        System.out.println(max);
        //ctrl + alt + F

        Student student = new Student();
        student.setName("曾鹏");
        student.setAge(20);
        student.setSex("男");
        student.setStuNum("2018");
        student.setGrade("大一");
        student.setScore(80.5);
        System.out.println(student.getName() + "\n" + student.getAge() + "\n" + student.getSex()
                + "\n" + student.getStuNum() + "\n" + student.getGrade() + "\n" + student.getScore());
    }

    public double getMaxScore(List list)  //最高成绩
    {
        for(int i=0;i<list.size;i++)
        {
            if (max < list.get(i).getScore())
            {
               max = list.get(i).getScore();
               System.out.println(i);
            }
        }
            return 0;

    }

    public double getMinScore(List list)  //最低成绩
    {
        for(int i=0;i<list.size;i++)
        {
            if (min < list.get(i).getScore())
            {
                min = list.get(i).getScore();
                System.out.println(i);
            }
        }
        return 0;
    }

    public double getAverageScore(List list)//平均值
    {
        sum+=list.get(i).getScore();
        average = sum / list.size();
        System.out.println(i);
        return 0;
    }
}



