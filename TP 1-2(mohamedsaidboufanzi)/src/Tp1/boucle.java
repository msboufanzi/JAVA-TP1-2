package Tp1;

import java.util.Scanner;


public class boucle {

    public static void main(String[] args) {
		int i=0;
     int sum=0;
     Scanner sc= new Scanner(System.in);

 do {
        
            System.out.println("veiller enter le nemuro "+i+1+":");
            int num = sc.nextInt();
    
    
            sum +=num;
            ++i;

    }while(i<10);




    System.out.println("La somme des numéros est : " + sum);
    sc.close(); // Close the scanner after us
}
}
