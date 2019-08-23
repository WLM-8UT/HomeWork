package homework;

import java.util.Scanner;

 class Unit3_1 {
}

 abstract class PetExercise{
    protected String name="无名氏";
    protected int health=100;
    protected int love=0;

    public int getLove() {
        return love;
    }

    public PetExercise(String name){
        this.name=name;
    }
    public void print(){
        System.out.println("宠物的自白：\n我的名字叫"+ this.name +",健康值是"+ this.health +", 和主人的亲密是"+ this.getLove() +"。");
    }
    // 负责给宠物吃饭的功能
    public abstract void eat();
}
/**
 *狗狗类，宠物的子类
 */
class DogExercise extends PetExercise{
    private  String strain;  //品种
    public DogExercise(String name ,String strain){
        super(name);
        this.strain=strain;
    }
    //重写父类的print（）方法
    public void print(){
        super.print(); //调用父类的print()方法
        System.out.println("我是一只"+this.strain+"。");
    }
    //重写父类的eat（）方法
    public void  eat(){
        super.health=super.health+3;
        super.love=super.love+5;
        System.out.println("狗狗"+super.name+"吃饱啦！健康值增加3");
    }
    public void catchingFlydisc(){
        System.out.println("狗狗"+super.name+"正在接飞盘！");
        super.health=super.health-10;

    }
}
/**
 *企鹅类
 */
class PenguinEexercise extends PetExercise{
    private  String  sex;
    public PenguinEexercise(String name,String sex){
        super(name);
        this.sex=sex;
    }
    public void print(){
        super.print();
        System.out.println("我的性别是"+this.sex+"。");
    }
    public void eat(){
        super.health=super.health+5;
        super.love=super.love+5;
        System.out.println("企鹅"+super.name+"吃饱啦！健康值增加5");
    }
    public void swimming(){
        System.out.println("企鹅"+super.name+"正在游戏！");
        super.health=super.health-10;
    }
}
/**
 *主人类
 */
class Master{
    private String name="";   //主人名字
    private int money=0;      //金钱数
    public Master(String name,int money){
        this.name=name;
        this.money=money;
    }
    //主人给宠物喂食
    public void feed(PetExercise petexercise){ //使用父类作为方法的形参
        petexercise.eat();
    }
    //主人给DogExercise喂食
    public void feed(DogExercise dogexercise){
        dogexercise.eat();
    }
    //主人给PenguinEexercise喂食
    public void feed(PenguinEexercise penguinexercise){
        penguinexercise.eat();
    }
    public PetExercise getPet(int typeId){
        PetExercise petexercise=null;
        if (typeId==1){
            petexercise = new DogExercise("果果","哈士奇");
        }else if (typeId==2){
            petexercise = new PenguinEexercise("娜娜","白雪公主");
        }
        return petexercise;
    }
}


/**
 *测试类，领养宠物并喂食
 */

 class PolymarphismTest {
    public static void main(String[] args) {
//       DogExercise dogexercise=new DogExercise("欧欧","雪纳瑞");
//       PenguinEexercise penguinecise=new PenguinEexercise("楠楠","Q妹");
        Master master=new Master("王先生",100);
        PetExercise petexercise=new DogExercise("欧欧","雪纳瑞");
        PetExercise petexerciseNo1=new PenguinEexercise("楠楠","Q妹"); //将一个父类的引用指向一个子类的对象（向上转型）
        petexercise.eat(); //它这里调用的是子类的重写父类的方法
        master.feed(petexercise);
        if (petexercise instanceof DogExercise) {
            DogExercise dogexercise = (DogExercise)petexercise;  //将一个指向子类对象的父类的引用赋给一个子类的引用 (向下转型)
            dogexercise.catchingFlydisc();
        } if(petexerciseNo1 instanceof PenguinEexercise){
            PenguinEexercise penguinexercise=(PenguinEexercise)petexerciseNo1;
            penguinexercise.swimming();
        }
        Scanner input=new Scanner(System.in);
        System.out.println("请选择你要领养的宠物（1、狗狗 2、企鹅):");
        int typeId=input.nextInt();
        PetExercise pet = master.getPet(typeId);
        if (pet!=null){
            System.out.println("领养成功");
            master.feed(pet);
            pet.print();
        }else{
            System.out.println("对不起，没有类型的宠物!");
        }
    }

}
