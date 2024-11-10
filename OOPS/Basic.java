 // classes re blueprint of object declared outside of maiin finction and amin class . Functions in that class are called as methods.
 
 class Pen{
    String color;
    String type;
    int x;
    int y;

    public void Clr(){
        System.out.println("Hello");
    };

    public void printPen(){
        System.out.println("color is " + this.color);
        System.out.println("type  is " + this.type);

    }

    // constructor is block of code used to create an oblect if constructor is not declared in java vava declares by itself  -- there are three types of constructor default, paramaterilized and copy constructor.

    // Default constructor-
    // Pen(){
    //     System.out.println("Constructor is called : This is normal constructer !");
    // }

    // Parameterilized Constructor.
    Pen(int x,int y){
        this.x = x;
        this.y = y;
        int z = this.x +this.y;
        System.out.println(z);
    }

 }

 public class Basic{
    // object is created in public class using classes  here p1 is object and Pen is class of that object.
    public static void main(String[] args){
        Pen p1 = new Pen(4,5);
       
    }
 }