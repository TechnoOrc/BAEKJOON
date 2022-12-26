package step2;

import java.util.Scanner;

public class No9498 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int inPut = 0;
        inPut = sc.nextInt();
        sc.close();

        if(inPut <= 100 && inPut >= 90){
            System.out.println("A");
        } else if(inPut <= 89 && inPut >= 80){
            System.out.println("B");
        }else if(inPut <= 79 && inPut >= 70){
            System.out.println("C");
        }else if(inPut <= 69 && inPut >= 60){
            System.out.println("D");
        }else System.out.println("F");
    }//main

}//class
