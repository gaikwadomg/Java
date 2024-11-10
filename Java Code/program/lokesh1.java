public class lokesh1 {
    public static void main(String[] args) {
        String input = "example string";
        int[] frequency = new int[256]; // ASCII characters limit

        // Counting frequency of each character
        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++;
        }

        // Displaying character frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
}
