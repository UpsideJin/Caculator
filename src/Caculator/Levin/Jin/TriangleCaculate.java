package Caculator.Levin.Jin;

import utils.Levin.Jin.AreaCaculate;
import utils.Levin.Jin.Caculate;

public class TriangleCaculate extends AreaCaculate implements Caculate {
    double x,h;
    public void setParameter() {
        System.out.println("请输入三角形的底：");
        x = input.nextDouble();
        System.out.println("请输入三角形的高：");
        h = input.nextDouble();
    }

    public void showInfo() {
        System.out.println("该三角形的底和高分别为" + x+" , "+h);
    }

    public void getArea() {
        System.out.println("该三角形的面积约为" + area);
    }

    public boolean checkInfo(){
        if(x<= 0||h<=0 ){
            System.out.println("参数错误，请重试");
            return false;
        }
        return true;
    }

    public void caculateArea() {
        area = (x * h) /2;
    }
}
