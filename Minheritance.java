class A{
    public void car(){
        System.out.println("audi car");
    }
}
class B extends A{
    public void bike(){
        System.out.println("duke bike");

    }
}
class C extends B{
    public void cycle(){
    System.out.println("hercules cycle");
}
}
public class Minheritance{
        public static void main(String[] args){
            C ob=new C();
            ob.car();
            ob.bike();
            ob.cycle();
        }
    }