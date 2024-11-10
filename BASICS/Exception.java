
import java.util.*;
public class Exception{
    public static void main(String[] args){
        System.out.println("Exception handing in java TRY CATCH :");

        // TRY - CATCH block is used to handle exception in java if some code may get an exception then that piece of code is to be written in try block and can be handled in catch box using Exception class;

        // eg - 
        int[] mark = {44,55,66};

        try {
            System.out.println(mark[5]);
        } catch(Exception ex) {
            // do something
        }

        // not working

        System.out.println("This code always work as exception is handled in try catch block hence no error in console.");


    }
}