package Tp1;
public class CompteBancaire {
    private double sold;
    
    public  CompteBancaire(){sold=0;}
    
    public void Deposer(double montant) {
    	sold+=montant;
    }
  
    public void Retirer(double montant) {
    	sold-=montant;
    }
   
    public void getsold() {
    	System.out.println("Votre sold est : "+sold+"DH");
    }
	public static void main(String[] args) {
		CompteBancaire client=new CompteBancaire();
		client.Deposer(2000);
		client.getsold();
		client.Retirer(1500);
		client.getsold();
	}
}