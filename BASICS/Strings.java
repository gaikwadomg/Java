public class Strings{
    public static void main(String[] args){

        /**
         * Strings are immutable in java that means when we declare any string in java it's value cannot be changed unless create a new string.
         * 
         * here are some functions on string :
         * 1.length()
         * 2.replace()
         * 3. charAt()
         * 4. substring()
         * 
         * 
         */
        
        // length() chatAt()
        String name = "om gaikwad";
        System.out.println(name.length());
        System.out.println(name.charAt(6));

        // replace()
        String name2 = name.replace('a','X');
        System.out.println(name2);

        // substring()
        System.out.println(name.substring(0,3));

        // concatnation string 
        String s1 = "Ayaj";
        String s2 = "om";
        String s3 = s1 +" and " + s2;
        System.out.println(s3);

    }

}