import java.util.Scanner;

public class Bj1120 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int cnt = a.length();
        int loop = b.length()-a.length();
        for(int j=0; j<=loop; j++){
            int tmp = 0;
            for(int i=j; i<a.length(); i++){
                if(a.charAt(i) != b.charAt(i)){
                    tmp++;
                }
            }
            if(cnt >= tmp){
                cnt = tmp;
            }
            a = " " + a;
        }

        System.out.println(cnt);
    }
}
