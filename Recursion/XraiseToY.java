// x ^ y (nth term )

public class XraiseToY{
    public static void raiseStatement(int x , int y , int result){
        if(y == 0){
            System.out.println(result);
            return;
        }
        result = result *x ;
        raiseStatement(x, y-1, result);


    }

    public static int calPower(int x , int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
          int nm1 = calPower(x,n-1);
          int tot = x * nm1;
          return tot;
    }

    public static int calPower3(int x , int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        if(n%2 == 0){
            //even
            return calPower3(x, n/2) * calPower3(x, n/2);
        }
        else{
            //even
            return calPower3(x, n/2) * calPower3(x, n/2) * x;
        }
    }
    public static void main(String[] args){
        int x = 4;
        int y = 5;
        int result = 1 ;

        int res = calPower3(x,y);
        System.out.println(res);

        raiseStatement(x,y,result);
    }
}