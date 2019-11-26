package J1;
/**
 * Marie test *
 */
import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programme op = new Programme();
		op.atelier10();
		Date madate;
		madate = new Date();
		// sysout raccourci 
	}
	
	public void atelier2() {
		boolean bool = true;
		System.out.println(bool);
		int var1 = -25;
		System.out.println(var1);
		float var2 = -25.7777777777777f;
		System.out.println(var2);
		double var3 = -25.4444444444444444444444;
		System.out.println(var3);
		char var4 = 's';
		System.out.println(var4);
		String var5 = "abc";
		System.out.println(var5);
		
		
 }
	public void atelier3() {
		System.out.println("Entrez votre nom:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();


		
		System.out.println("Entrez votre prénom:");
		String firstname = sc.nextLine();
		System.out.println("Entrez votre âge:");
		int age = sc.nextInt();
		System.out.printf("Le candidat s'appelle %s %s il a %d ans.",name,firstname,age);
		sc.close();		
	}
	
	public void atelier4() {
		System.out.println("Entrez un entier a:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Entrez un entier b:");
		int b = sc.nextInt();
		System.out.println(" a+b = "+(a+b)+"\n a-b = "+(a-b)+"\n a*b = "+(a*b)+"\n a/b = "+(a/b));
		if (b != 0) {
			System.out.println(" a/b = "+(a/b)+"\n a%b = "+(a%b)+"\n a+b-a/b = "+(a+b-a/b)+"\n a+(b-a)/b = "+(a+(b-a)/b));
		}
		
		System.out.println(" a==b = "+(a==b)+"\n a!=b = "+(a!=b)+"\n a<b = "+(a<b)+"\n a<=b = "+(a<=b));
		System.out.println(" a>=b = "+(a>=b)+"\n a>b = "+(a>b));	
		boolean c = true;
		boolean d = false;
		System.out.println(" c&&d = "+(c&&d)+"\n c||d = "+(c||d)+"\n !c = "+(!c));
		sc.close();		
		
	}
	public static void atelier5() {
		byte var1 = 127;
		short var2 = 32767;
		var1 = var2; // cannot convert from short to byte but can convert from byte to short
		System.out.println(var2);
		
	}
	public static void atelier6() {
		String s = "Chaîne de caractère";
		String s2 = "Une autre chaîne de caractère";
		String s3 = "Une chaîne de caractère";
		String s4 = "Chaîne de caractère";
		System.out.println("Méthode classique: \n s==s2 = "+(s==s2)+"\n s2==s3 = "+(s2==s3)+"\n s3==s4 = "+(s==s4));
		System.out.println(" s==s3 = "+(s==s3)+"\n s2==s4 = "+(s2==s4)+"\n s3==s4 = "+(s4==s3));
		System.out.println(" s==Chaîne de caractère = "+(s=="Chaîne de caractère"));
		
		System.out.println("Méthode equals: \n s==s2 = "+(s.equals(s2))+"\n s2==s3 = "+(s2.equals(s3))+"\n s3==s4 = "+(s.equals(s4)));
		System.out.println(" s==s3 = "+(s.equals(s3))+"\n s2==s4 = "+(s2.equals(s4))+"\n s3==s4 = "+(s3.equals(s4)));
		System.out.println(" s==Chaîne de caractère = "+(s.equals("Chaîne de caractère")));
		
		System.out.println(s.contains("de")+" "+s.length()+s.endsWith("ère")+" "+ s.getBytes()+" " +s.indexOf("ère"));
		
	}
	public static void atelier7() {
		float x = 27.2125f;
		double y = 28.8;
		System.out.println("maximum of the two numbers:"+(java.lang.Math.max(x,y)+"\n minimum of the two numbers:" +java.lang.Math.min(x,y)));
		System.out.println("Random number:" +(Math.random()*100));
		System.out.println("Nextup number: " + Math.nextUp(y));
	}
	
	public static void atelier8( ) {
		boolean a = true;
		boolean b = false;
		byte c = 1;
		byte d = 2;
		if (a) {
			System.out.println("The condition a is true");
		}
		if (b) {
			System.out.println("The condition b is true");
		}
		if (c==d) {
			System.out.println("c and d are equals");
		}
		else {
			if (c==1) {
				System.out.println("c equals 1");
			}
			if (d==2) {
				System.out.println("d equals 2");
			}
			System.out.println("c and d are not equals");
				
			}
		
		if (c>d) {
			System.out.println("c is greater than d");
	
		}
		else if (c<d) {
			System.out.println("c is smaller than d");
		}
		else {
			System.out.println("c is equals to d");
		}
		
		int x = 3;
		switch(x) {
		case 1: System.out.println("1");
		case 2: System.out.println("2");
		case 3: System.out.println("3");
		default: System.out.println("autre");
			
		}
		}
	public static void atelier9() {
		int i = 1;
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		int z = 0;
		System.out.println("");
		do {
			System.out.println(z);
			z++;
		}
		
		while (z<1);
		System.out.println("");

		for(int j=1;j<6;j++) {
			System.out.println(j);
		}
	}
	
	public static void atelier10() {
		String[] liste = {"Pikachu", "Salamèche", "Bulbizarre","Carapuce","Racaillou"};
		Arrays.sort(liste);
		for (String item:liste) {
			System.out.println(item);
		}
		int i = 0;
		System.out.println("");
		while (i<liste.length) {
			System.out.println(liste[i]);
			i++;
		}
		System.out.println(Arrays.binarySearch(liste, "Carapuce"));
		String[][] liste2 = {{"Pikachu","Raichu"},{"Salamèche"},{"Bulbizarre"},{"Carapuce","Tortank"},{"Onyx","Rocaillou"}};
		int cmpt = 0;
		for (String[] item:liste2) {
			
			System.out.println("Liste evolution "+cmpt+":");
			cmpt ++;
			for (String evo:item) {
				System.out.print(evo+" ");
			}
			System.out.println("");
			System.out.println("-------");
		}
	}
	
	public static void atelier11() {
		System.out.println("Bienvenue dans le jeu \"Hidden number\"");
		System.out.println("Entrez votre pseudo:");
		Scanner sc = new Scanner(System.in);
		String pseudo = sc.nextLine();
		int numD;
		int cmp = 0;
		int num = (int) (Math.random()*11-1);
		System.out.println(num);
		do {
			
			System.out.println("Il vous reste "+(5-cmp)+" coups!");
			System.out.println("Veuillez entrer un chiffre:");
			numD = sc.nextInt();
			cmp++;
		}
		while ((numD != num) && (cmp< 5));
		if (cmp>4) {
			System.out.println("Vous avez perdu");
		}
		else {
			System.out.printf("Bravo %s vous avez gagné en %d coups!",pseudo,cmp);
		}
		
	}
	public void test() {
	     String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();
	}
}
