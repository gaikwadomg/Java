public class Q2{
    public static int countPaths(int m ,int n , int i , int j ){

        if(i == n-1 && j == m-1){
            return 1;
        }
        if(i == n || j == m){
            return 0;
        }

        int downPaths = countPaths(m,n,i+1,j);
        int sidePaths = countPaths(m,n,i,j+1);
        return downPaths + sidePaths;
    }

    public static void main(String[] args){
        // program to find no of paths in a maze 
        int n = 3;
        int m = 3;
        int paths = countPaths(m,n,0,0);

        System.out.println(paths);
    }
}