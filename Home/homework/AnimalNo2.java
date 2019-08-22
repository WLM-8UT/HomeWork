package homework;

public  abstract class AnimalNo2 {
    private  String name="";
    private String cry="";
    public AnimalNo2(String name,String cry){
        this.name=name;
        this.cry=cry;
        System.out.println("我叫"+this.name+",是一只"+this.cry+"!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCry() {
        return cry;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }
    public abstract void like() ;
    public abstract void eat();
}
class Chicken extends AnimalNo2{
    private String food="小虫子";
    private String speciality="打鸣";
    public Chicken(String name,String cry){
        super(name,cry);
    }
    public void like(){
        System.out.println("我喜欢吃"+this.food+"!");
    }
    public void eat(){
        System.out.println("我会"+this.speciality+"!");
    }
}
class Duk extends AnimalNo2 {
    public Duk(String name, String cry) {
        super(name, cry);
    }

    private String food = "小鱼虾";
    private String speciality = "游泳";

    public void like() {
        System.out.println("我喜欢吃" + this.food + "!");
    }

    public void eat() {
        System.out.println("我会" + this.speciality + "!");
    }
}
class TestNO2{
    public static void main(String[] args) {
        Chicken chicken=new Chicken("喔喔","芦花鸡");
        chicken.eat();
        chicken.like();
        Duk duk=new Duk("嘎嘎","斑嘴鸭");
        duk.eat();
        duk.like();
    }
}
