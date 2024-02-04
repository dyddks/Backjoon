import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strArr = new String[n];

        for(int i=0; i<strArr.length; i++){
            strArr[i] = sc.next();
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);    // 사전 순 정렬

                }
                // 그 외의 경우
                else {
                        return s1.length() - s2.length();
                    }
                }
        });
        
        // 중복되는 단어는 한번만 출력
        System.out.println(strArr[0]);
        for (int i = 1; i < n; i++) {

            if (!strArr[i].equals(strArr[i - 1])) {
                System.out.println(strArr[i]);
            }
        }
    }
}