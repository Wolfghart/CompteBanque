package banque;

public class Compte {
	protected int solde = 0;
	
	public void deposer(int somme) {
		this.solde += somme;
	}
	
	public int retirer(int somme) {
		int res = this.solde-somme;
		this.solde-= somme;
		return res;
	}
	
	public int virer(int somme, Compte compteDestination) {
		int res = somme;
		this.solde-=somme;
		compteDestination.deposer(somme);
		return res;
	}
	
	@Override
	public String toString() {
		return " Solde : "+this.solde ;
	} 
	
	public void Main() {
		Compte A = new Compte();
		Compte B = new Compte();
		A.solde = 1000;
		B.solde = 2680;
		
		LivretA La = new LivretA();
		LivretA Lb = new LivretA();
		
		A.virer(500, La);
		Lb.virer(1080, B);
		
		System.out.println(A.toString()+" - "+La.toString());
		System.out.println(B.toString()+" - "+Lb.toString());
	}
}
