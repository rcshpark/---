import java.util.Scanner;

// 평균 구하기
public class test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum=0;
        int max=0;
        for(int i=0; i<N; i++){
            int A = sc.nextInt();
            if(A > max) max=A;
            sum =sum + A;
        }
        System.out.println(sum/max*100.0/N);
    }
}
