public class tower{
    public static void hanoi(int disk, String source , String helper , String destination){
        if(disk == 1){
            System.out.println("Transfer "+ disk + " from " + source + " to " + destination);
            return;
        }

        hanoi(disk-1,source , destination , helper);
        System.out.println("Transfer "+ disk + " from " + source + " to " + destination);
        hanoi(disk-1,helper,source,destination);
    }

    public static void main(String[] args){
        hanoi(3," Source "," Helper "," Destination ");
    }
}