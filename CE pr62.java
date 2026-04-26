import java.util.*;

class VotingApp {
    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}

public class CE pr62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingApp v = new VotingApp();

        int age = sc.nextInt();

        try {
            v.checkEligibility(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
    }
}