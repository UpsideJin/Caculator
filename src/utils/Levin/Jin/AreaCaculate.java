package utils.Levin.Jin;

import java.util.Scanner;

public abstract class AreaCaculate {
    protected String type = "Area";
    protected final static Scanner input = new Scanner(System.in);
    protected double area = 0.0D;

    protected void getType(){
        System.out.println(type);
    }

    protected abstract boolean checkInfo();
    protected abstract void caculateArea();
}




