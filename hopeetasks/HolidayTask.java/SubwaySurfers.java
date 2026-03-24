import java.util.*;

public class SubwaySurfers {

    public static void Game() {
        Scanner sc = new Scanner(System.in);
        char operation;

        while (true) {
            System.out.print("\nOperation to be performed: ");
            operation = sc.next().charAt(0);

            switch (operation) {
                case '<':
                    System.out.println("MOVE LEFT");
                    break;

                case '>':
                    System.out.println("MOVE RIGHT");
                    break;

                case '^':
                    System.out.println("JUMP");
                    break;

                case 'v':
                    System.out.println("SLIDE");
                    break;

                case '.':
                    System.out.println("GAME HAS BEEN STOPPED");
                    return; // exit the method

                default:
                    System.out.println("RUNNING");
            
            }
            sc.close();
        }
        
        
    
    }


    public static void main(String[] args) {
        System.out.println("\nAvailable Moves:\n");
        System.out.println("1. To move Left  - '<'");
        System.out.println("2. To move Right - '>'");
        System.out.println("3. To Jump       - '^'");
        System.out.println("4. To Slide      - 'v'");
        System.out.println("5. To stop       - '.'");

        Game();
        
    }
}