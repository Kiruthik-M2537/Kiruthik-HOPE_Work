package Day10;
public class UncheckedException {
    public static void main(String[] args) {
        try {
            int a = 10;
            int[] b = new int[a];

            for (int i = 0; i < a - 1; i++) {  // stop at a-2 to avoid ArrayIndexOutOfBounds
                b[i + 1] = b[i];
            }

            System.out.println("Array processed successfully. a = " + a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
    }
}