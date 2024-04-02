package iut.bad;

public class Femme extends Humain {
	
	public Femme (String nom, String prenom, int age) {
		   super(nom, prenom, age);
		   }
   public static void main(String[]args) {
	     Femme bao = new Femme("bao","vao",14);
	     Homme Koto = new Homme("koto","rabe",15);
	     
	     bao.ami(Koto, 100);
	     
   }
}
