import java.math.BigInteger;
import java.util.Scanner;

public class Bj13706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        BigInteger n = new BigInteger(str);

        System.out.println(n.sqrt());
    }
}