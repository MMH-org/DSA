package DSA.CodingQuestion;

import java.util.Scanner;

public class PrintThePattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numberInput= sc.nextInt();
        for(int i=1;i<=numberInput;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
