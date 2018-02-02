package banque;

public class Compte {
	private int solde = 0;
	
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
}