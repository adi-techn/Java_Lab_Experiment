public class obj_class{
    public static void main(String[] args) {
        Pen p1=new Pen();         //Object creation
        p1.setTip(5);
        p1.setcolor("red");
        System.out.println(p1.color);     //calling directly
        p1.gettip();                      //calling through getter function
    }
}

class Pen{
    String color;         //Object's properties
    int tip_size;
       
    //Setters
    void setcolor(String color){                    
        this.color=color;            //'this' indicates the current element inside the class.
    }
    void setTip(int tip_size){
        this.tip_size=tip_size;
    }

    //Getters
    void getcolor(){
        System.out.println(color);
    }
    void gettip(){
        System.out.println(tip_size);
    }
}
