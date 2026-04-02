import java.util.Scanner;
public class CategorizeBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        System.out.print("Enter mass: ");
        int mass = sc.nextInt();

        boolean isBulky = length >= 10000 || width >= 10000 || height >= 10000 ||
                          (long) length * width * height >= 1_000_000_000;

        boolean isHeavy = mass >= 100;

        String result;

        if (isBulky && isHeavy) {
            result = "Both";
        } else if (!isBulky && !isHeavy) {
            result = "Neither";
        } else if (isBulky) {
            result = "Bulky";
        } else {
            result = "Heavy";
        }

        System.out.println("Category: " + result);
    sc.close();
    }
}