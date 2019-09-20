package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unit5_1 {
        public void  Age(int age) throws Exception{
            try {
                if (age > 0 && age < 100) {
                    System.out.println("程序结束！");
                }
                else{
                    throw new Exception();
                }
            }
            catch (InputMismatchException e){
                System.out.println("输入的必须是整数");
                e.printStackTrace();
            }
            catch (Exception e) {
                System.out.println("年龄必须在1～100之间！");
                e.printStackTrace();
            }
            finally {
                System.out.println("退出程序！");
            }
        }
    }
    class Person{
        public static void main(String[] args) {
            Unit5_1 code=new Unit5_1();
            try {
                Scanner input=new Scanner(System.in);
                System.out.print("请输入你的年龄:");
                int age = input.nextInt();
                code.Age(age);
            }

            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

