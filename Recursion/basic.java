public class basic{
    public static void Printlines(int x){
        System.out.println(x);
        x = x + 1;
        if (x > 5) {
            return;
        }
        Printlines(x);
    }
    public static void main(String args[]){
        int x = 1;
        Printlines(x);
    }
}