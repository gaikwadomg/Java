import java.util.*;
import java.io.File;

public class FileOperation{
    public static void main(String[] args){
        System.out.println("Files in java :");
        File file = new File("om.txt");
        System.out.println(file.exists());
        
    }
}