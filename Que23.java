class LibraryItem{
     int library_item;
     public void item(){
          System.out.println("Library Items::Book,DVD,Journal");
     }
}
class Book extends LibraryItem{
     public void item_name(){
          System.err.println("Book");
          System.err.println("Item No.:"+library_item);
     }
}
class DVD extends LibraryItem{
     public void item_name(){
          System.err.println("DVD");
          System.err.println("Item No.:"+library_item);
     }
}
class Journal extends LibraryItem{
     public void item_name(){
          System.err.println("Journal");
          System.err.println("Item No.:"+library_item);
     }
}
public class Que23 {
     public static void main(String[] args) {
          DVD dvd=new DVD();
          dvd.library_item=22;
          dvd.item();
          dvd.item_name();
     }
}
