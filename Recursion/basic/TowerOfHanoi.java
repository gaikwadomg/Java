public class TowerOfHanoi{
    public static void SwitchDisks(int noOfDisk , String source , String helper , String destination){
        if(noOfDisk == 1){
            System.out.println("Transfer "  + noOfDisk + " Disks " + source + " to " + destination);
            return;
        }

        SwitchDisks(noOfDisk-1, source, destination , helper);
        System.out.println("Transfer "  + noOfDisk + " Disks " + source + " to " + destination);
        SwitchDisks(noOfDisk-1, helper, source , destination);
    }

    public static void main(String[] args){
        int n = 3; // number of disks
        SwitchDisks(n, " Sour ", " Help ", " Dest ");
    }
}