package step4;

import java.util.Scanner;
import java.util.ArrayList;

public class No10871 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int X = sc.nextInt();
        int [] N = new int[A];
        
        ArrayList result = new ArrayList();

        for(int i = 0; i < A; i ++){
            N[i] = sc.nextInt();
            if(N[i] < X){
               result.add(N[i]);
            }
        }
        
        for(int i = 0; i < result.size(); i ++){
            System.out.print(result.get(i) + " ");
        }

        sc.close();
    }//main
}//class