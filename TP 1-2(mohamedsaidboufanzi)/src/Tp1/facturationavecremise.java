package Tp1;
import java.util.*;
public class facturationavecremise {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("donner le prix hors tax en dh:");
        double prixHt=sc.nextInt();
        double prixTtc=prixHt+prixHt*0.186;
        // on vas faire notre remise

        if ( prixTtc >= 1000 && prixTtc < 2000)
        prixTtc-=prixTtc*0.01;
        else	if(prixTtc>=2000 && prixTtc<5000) {
			prixTtc-=prixTtc*0.03;
		}
		else if(prixTtc>=5000) {
			prixTtc-=prixTtc*0.05;
		}
        System.out.println("votre prix ttc apres remise est :"+prixTtc+"dh");
        sc.close();
    }
}