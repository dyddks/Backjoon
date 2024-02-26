import java.util.Arrays;
import java.util.Scanner;

public class Bj1302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        int cnt=1;
        int max = 0;
        String str = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i-1].equals(arr[i])){
                cnt++;
                if(max<cnt){
                    max=cnt;
                    str = arr[i-1];
                }
            }else{
                cnt=1;
            }
        }
        System.out.println(str);
    }
}
