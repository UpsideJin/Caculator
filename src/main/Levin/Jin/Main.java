package main.Levin.Jin;


import Caculator.Levin.Jin.CircleCaculate;
import Caculator.Levin.Jin.TriangleCaculate;

import java.util.Scanner;


public class Main {
    public static void main (String[]args){

        CircleCaculate Circle = new CircleCaculate();
        TriangleCaculate Triangle = new TriangleCaculate();

        System.out.println("--------------------------面积计算器-------------------------------");
        System.out.println("-------请选择要计算的面积类型（请在下面输入1或2）：1.三角形 2.圆形-------");
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        switch(n){
            case 1:
                Circle.setParameter();
                Circle.checkInfo();
                if(!Circle.checkInfo()){
                    System.out.println("参数错误，请重试");
                    System.out.println("重要的事情说三遍");
                    return;
                }
                Circle.showInfo();
                Circle.caculateArea();
                Circle.getArea();
                System.out.println("----------------------------------------------------------");
                break;
            case 2:
                Triangle.setParameter();
                Triangle.checkInfo();
                if(!Triangle.checkInfo()){
                    System.out.println("参数错误，请重试");
                    System.out.println("重要的事情说三遍");
                    return;
                }
                Triangle.showInfo();
                Triangle.caculateArea();
                Triangle.getArea();
                System.out.println("----------------------------------------------------------");
                break;
        }





    }

    }


