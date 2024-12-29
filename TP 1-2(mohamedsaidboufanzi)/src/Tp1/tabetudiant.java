package Tp1;


public class tabetudiant {
    public static void main(String[] args) {
        double[] noteEtud= {12,15.8,7,13.4,18,12,17.5,6,8,10};
        double moy=0;
		for(double note : noteEtud) {
			moy+=note;
		}
		moy/=noteEtud.length;
        int i=0;
		for(double note : noteEtud) {
			if(note>moy)
				i++;
		}
		System.out.println("La moyenne de la classe est : "+moy);
		System.out.println("le nombre d'etudiant ayant une note sup a la moyenne : "+i);
    }
    
}
