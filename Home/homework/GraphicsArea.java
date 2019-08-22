package homework;

import javax.swing.tree.FixedHeightLayoutCache;
import java.util.Scanner;

public abstract class GraphicsArea {
    private double length=0;
    private double broad=0;
    private double height=0;
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public double getBroad() {
        return broad;
    }
    public void setBroad(double broad) {
        this.broad = broad;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public abstract void area();
}
class Triangle extends GraphicsArea{
     public void area(){
         double totalArea =(super.getLength()*super.getHeight())/2;
         System.out.println("圆形面积为："+totalArea);
     }
}
class Roundness extends GraphicsArea{
      private double r=0;
      private final double π=3.1415926;
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public  void area(){
       double roundnessArea = this.getR()*this.getR()*this.π;
        System.out.println("圆形面积为："+roundnessArea);
    }
}
class Trapezoid extends GraphicsArea{
     private double upperBase=0;
     private double theBottom=0;
    public double getUpperBase() {
        return upperBase;
    }
    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }
    public double getTheBottom() {
        return theBottom;
    }
    public void setTheBottom(double theBottom) {
        this.theBottom = theBottom;
    }
     public void area(){
         double sArea=(this.getUpperBase()+this.getTheBottom())*super.getHeight();
         System.out.println("梯形面积为："+sArea);
     }
}
class ToTest{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请选择你要计算图形的面积：1、三角形  2、圆形  3、梯形");
        int importNo1= input.nextInt();
        switch (importNo1){
            case 1:
                System.out.println("请输入三角形的底边长度:");
                double bottem=input.nextInt();
                System.out.println("请输入三角形的高度:");
                double heigth=input.nextInt();
                Triangle  triangle=new Triangle();
                triangle.setLength(bottem);
                triangle.setHeight(heigth);
                triangle.area();
                break;
            case 2:
                System.out.println("请输入圆形的半径:");
                double R=input.nextInt();
                Roundness  roundness=new Roundness();
                roundness.setR(R);
                roundness.area();
                break;
            case 3:
                System.out.println("请输入梯形的上底边的长度；");
                double UpperBase=input.nextInt();
                System.out.println("请输入梯形的下底边的长度；");
                double TheBottom=input.nextInt();
                System.out.println("请输入梯形的高度：");
                double Heigth=input.nextInt();
                Trapezoid trapezoid=new Trapezoid();
                trapezoid.setUpperBase(UpperBase);
                trapezoid.setTheBottom(TheBottom);
                trapezoid.setHeight(Heigth);
                trapezoid.area();
                break;
        }
    }
}