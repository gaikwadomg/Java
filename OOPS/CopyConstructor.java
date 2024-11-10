// copy constructor 

class Copy{
    String name;
    int age;

    // copy constructro copies element of other constructor in itself  below is copy constructor. if you want to create copy constructor then you need to define another constructor which needs to copy first.
    Copy(Copy s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Copy(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void op(){
        System.out.println("my name - " + this.name);
        System.out.println("my age - " + this.age);

    }
}

public class CopyConstructor{
    public static void main(String[] args){

    Copy s1 = new Copy("om gaikwad" ,80);


    Copy s2 = new Copy(s1);
    s2.op();

    }
}