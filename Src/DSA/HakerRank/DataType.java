package Src.DSA.HakerRank;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(); // input frome zero t

        for(int i=0;i<t;i++){
            try{
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
            sc.close();

        }
    }
}

