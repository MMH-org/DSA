package Src.DSA.CodingQuestion;
import java.util.*;
public class PrintThePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        for(int i=1 ; i<=N; i++){
            int temp = i;
            for(int j = 1; j<=i;j++){
                System.out.print(temp++ +" ");
            }
            temp-=2;
            for(int j =1;j<i;j++){
                System.out.print(temp-- +" ");
            }
            System.out.println();
        }
    }
}