
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("My name is - " + this.name);
        System.out.println("My age is - " + this.age);
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}

public class Constructorr{
    public static void main(String[] args){

        Student s1 = new Student("om",100);
        s1.printInfo();

        Student s2 = new Student("Kunal" ,200);
        s2.printInfo();

    }
}

// distructor - are functions that delete destroy objects. In java there are no destructors as java has automatic garbage collector is used to delete object and free memory