package step2;

import java.util.Scanner;

import javax.swing.InputMap;

public class No2753 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int inPut = 0;
        inPut = sc.nextInt();
        sc.close();

        if( ((inPut % 4 == 0)  && (inPut % 100 != 0)) || ((inPut % 4 == 0)  && (inPut % 400 == 0)) ){
            System.out.println(1);
        } else System.out.println(0);


    }//main

}//class
