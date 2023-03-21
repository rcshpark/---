import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기
public class test3 {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
       int suNum = Integer.parseInt(stringTokenizer.nextToken());
       int quizNum = Integer.parseInt(stringTokenizer.nextToken());
       long[] s = new long[suNum + 1];
       stringTokenizer = new StringTokenizer(br.readLine());
        for(int i=1;i<=suNum; i++){
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q=1;q<=quizNum; q++){
            stringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j]-s[i-1]);
        }
    }
}
