package homework;

public abstract class Animal {
    private String target="锁定目标";

        public abstract void say();

    public String getTarget() {
        return target;
    }
}
class Lion extends Animal{
     public void hunting(){
         System.out.println(super.getTarget()+"、狮子用牙齿和利爪抓获");
     }
     public void say(){
         System.out.println("噢呜");
     }
}
class Frog extends Animal{
    public void huting(){
        System.out.println(super.getTarget()+"、青蛙用舌头抓获");
    }
    public void say(){
        System.out.println("呱呱");
    }
}
class Test{
    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.hunting();
        lion.say();
        Frog frog=new Frog();
        frog.huting();
        frog.say();
    }
}

