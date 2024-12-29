package Tp1;
import java.util.*;

public class tab {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.println("saisir the size of table:");
       int x=sc.nextInt();
       int [] Tab=new int[x];

       for(int i=0;i<x;i++) {
        System.out.println("Saisir le nombre "+(i+1)+" :");
        Tab[i]=sc.nextInt();
    }
    int max=0;
    for ( int nombre:Tab)
    if(nombre>max){
        max=nombre;

    }
    System.out.println("Le maximum du tableu est :"+max);
		sc.close();

    }
    
}
