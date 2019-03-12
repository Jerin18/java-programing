
import java.util.Scanner;
public class reverse{
public static void main(string[] args){
 Scanner myinput=new Scanner("System.int");
 int n,s,r=0;
 System.out.println("enter the number");
 n=myinput.nextInt();
 while(n!=0)
 {
  s=n%10;
  r=r*10+r;
  n=n/10;
 }
 System.out.println("reverse="+r);
 }
}