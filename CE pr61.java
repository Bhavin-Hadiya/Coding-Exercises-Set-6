import java.util.*;

public class CE pr61 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);

            int res = num / den;

            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing arguments");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}