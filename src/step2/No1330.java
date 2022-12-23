package step2;

import java.util.Scanner;

/*
 * No1330
 */
public class No1330 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String inPut = sc.nextLine();
        String[] A = inPut.split(" ");
        sc.close();
        //System.out.println("inPut >> " + inPut);
        
         int data1, data2 = 0;
         
         data1 = Integer.parseInt(A[0]);
         data2 = Integer.parseInt(A[1]);
       
         if(data1 < data2){
            System.out.println("<");
         } else if(data1 > data2){
            System.out.println(">");
        } else{
             System.out.println("==");
         }

    }//main

}//class
