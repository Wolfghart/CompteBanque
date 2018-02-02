package banque;

public class LivretA extends Compte {

	@Override
	public int retirer(int somme) {
		int diff = solde - somme;
		int res = 0;
		if(diff>0) {
			solde -= somme;
			res = somme;
		}
		return res;
	}
	
	@Override
	public int virer(int somme, Compte compteDestination) {
		int res;
		if(solde>somme) {
			compteDestination.solde+=somme;
			solde-=somme;
			res=somme;
		}else {
			compteDestination.solde+=solde;
			solde = 0;
			res=solde;
		}
		return res;
		
	}
}
