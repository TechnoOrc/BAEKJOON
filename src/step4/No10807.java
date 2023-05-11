package step4;

import java.util.Scanner;

public class No10807 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int [] iNum = new int[cnt];
        int pickNum = 0;
        int outCnt = 0;

        for(int i=0; i < cnt; i++){
            iNum[i] = sc.nextInt();
        }
        
        pickNum = sc.nextInt();
        sc.close();
        
        for(int i=0; i < cnt; i++){
            if(iNum[i] == pickNum){
                outCnt += 1;
            }
        }
        System.out.println(outCnt);



    }//main
}//class
