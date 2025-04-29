public class poly{
     public static void main(String[] args) {
         Calculator calc=new Calculator();
         System.out.println(calc.sum(4,5));
         System.out.println(calc.sum((float)2.5,(float)3.5));
         System.out.println(calc.sum(4,6,5));
 
         Cow c=new Cow();
         c.eat();
     }
 }
 
 class Calculator{               //Method(Function) Overloading - Same function but diff. parameters
 
     int sum(int a,int b){
         return a+b;
     }
 
     float sum(float a,float b){
         return a+b;
     }
 
     int sum(int a, int b,int c){
         return a+b+c;
     }
 }
 
 // Method(Function) Overriding - Parent and child contains same function but different definition
 class Animal{
     void eat(){
         System.out.println("Eats anything");
     }
 }
 class Cow extends Animal{
     void eat(){
         System.out.println("Eats veg");
     }
 }
