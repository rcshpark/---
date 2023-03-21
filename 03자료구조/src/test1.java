import java.util.Scanner;

// 숫자 합 예제  
public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String nNum = sc.next();
        char[] sNum = nNum.toCharArray();

        int sum = 0;

        for(int i=0; i<sNum.length; i++){

            // - 48 , -'0' 은 아스키 코드개념을 토대로, String 을  int로 형변환을 위해 사용하는 방법 
            sum+=sNum[i] - 48;
            // sum+=sNum[i] - '0';
        }
        System.out.println(sum);
    }
}
