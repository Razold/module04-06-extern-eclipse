package fr.eni;

public class AppelExtern {

	public static void main(String[] args) {
		String chaine1 = Messages.getString("AppelExtern.chaine1"); //$NON-NLS-1$
		String chaine2 = Messages.getString("AppelExtern.chaine2"); //$NON-NLS-1$
		
		String s3 = chaine1 + chaine2;
		
		System.out.println(s3);
		
		String chaine4 = "Coucou"; //$NON-NLS-1$
	}

}
