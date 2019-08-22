package homework;

public abstract class AnimalNo1 {
    private int age=0;
    public AnimalNo1(){

    }
    public abstract void info();

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
class Bird extends AnimalNo1 {
    private String color = "";

    public Bird(int age, String color) {
        super.setAge(age);
        this.color=color;
    }
    public void info() {
        System.out.println("我是一只"+this.color+"的鸟！");
        System.out.println("今年"+super.getAge()+"岁了！");
    }
}
class Fish extends AnimalNo1{
    private int weight=0;
    public Fish(int age, int weight){
        super.setAge(age);
        this.weight=weight;
    }
    public void info(){
        System.out.println("我是一只"+this.weight+"斤重的鱼！");
        System.out.println("今年"+super.getAge()+"岁了！");
    }
}
class TestNo1{
    public static void main(String[] args) {
        Bird bird=new Bird(4,"红色");
        bird.info();
        Fish fish=new Fish(2,5);
        fish.info();
    }
}