class AgeChecker {
    public void checkAge(int age) throws Exception {
  if (age < 18) {
            throw new Exception("Age is less than 18. Not eligible!");
        } else {
            System.out.println("Eligible to vote!");
        }
    }
}
public class task3 {
    public static void main(String[] args) {
        AgeChecker obj = new AgeChecker();
        try {
            obj.checkAge(16); 
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}