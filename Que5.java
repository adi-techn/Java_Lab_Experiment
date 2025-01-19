class Que5{
     int i;char ch;
     float f;double d;
     boolean b;byte by;
     public static void main(String[] args) {
         Que5 t=new Que5();
         System.out.println("char:[]"+t.ch+" "+Character.BYTES);
         System.out.println("Int:"+t.i+" "+Integer.BYTES);
         System.out.println("Float:"+t.f+" "+Float.BYTES);
         System.out.println("Double:"+t.d+" "+Double.BYTES);
         System.out.println("Boolean:"+" "+"Depend on JVM");
         System.out.println("Byte:"+t.by+" "+Byte.BYTES);
     }
 }
 
 