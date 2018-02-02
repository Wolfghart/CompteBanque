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
}
