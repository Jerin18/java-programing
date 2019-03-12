interface parent1{
    default void car(){
        System.out.println("Audi car");
        
    }
    }
    interface parent2{
        default void car(){
         System.out.println("BMW car");
        
        }
    }
    public class MultipleInheritance implements parent1,parent2{
    public void car() {
        parent1.super.car();

    } 
    public static void main(String[] args) {
    MultipleInheritance d=new MultipleInheritance();
    d.car(); 
    
}
}