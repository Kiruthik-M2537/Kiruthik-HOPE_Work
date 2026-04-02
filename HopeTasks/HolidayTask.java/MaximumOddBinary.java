import java.util.Scanner;

public class MaximumOddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String binaryString = sc.nextLine();

        int countOnes = 0;
        StringBuilder resultBuilder = new StringBuilder();

        for (char ch : binaryString.toCharArray()) {
            if (ch == '1') {
                countOnes++;
            }
        }

       
        for (int i = 0; i < binaryString.length() - 1; i++) {
            if (countOnes > 1) {
                countOnes--;
                resultBuilder.append('1');
            } else {
                resultBuilder.append('0');
            }
        }
        sc.close();

    
        resultBuilder.append('1');

        System.out.println("Maximum odd binary number: " + resultBuilder.toString());
    }
}