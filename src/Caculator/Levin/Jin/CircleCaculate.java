package Caculator.Levin.Jin;

import utils.Levin.Jin.AreaCaculate;
import utils.Levin.Jin.Caculate;

public class CircleCaculate extends AreaCaculate implements Caculate {
    double radius, pi = 3.14159;

    public void setParameter() {
        System.out.println("请输入你的圆半径：");
        radius = input.nextDouble();
    }

    public void showInfo() {
        System.out.println("该圆的半径为" + radius);
    }

    public void getArea() {
        System.out.println("该圆的面积约为" + area);
    }

    public boolean checkInfo(){
       if(radius <= 0 ){
           System.out.println("参数错误，请重试");
           return false;
       }
      return true;
    }

    public void caculateArea() {
        area = radius * radius * pi;
    }


}
