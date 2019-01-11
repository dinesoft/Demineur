package dd;

import java.util.Scanner;

public class exemple
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Dem demineur = new Dem();
		
		int c; //colonne
		int l; //ligne
		int b; //bombe
		
		int val;
		boolean NoRe = true;
		
		boolean cont = true;
		
		while(cont)
		{
			if(NoRe)
			{
				System.out.print("Nombre de ligne: ");
				l = Integer.parseInt(sc.nextLine());
				System.out.print("Nombre de colone: ");
				c = Integer.parseInt(sc.nextLine());
				System.out.print("Nombre de mine: ");
				b = Integer.parseInt(sc.nextLine());
				
				if(b < c*l);
				else System.out.println("[Trop de mine]");
				
				demineur.Init(c, l, b);
				
				System.out.print("Colonne: ");
				c = Integer.parseInt(sc.nextLine());
				System.out.print("Ligne: ");
				l = Integer.parseInt(sc.nextLine());
				
				/**demineur.prohibitedValue(c, l);  **/
				demineur.genMap();
				
				demineur.click(c, l);
				demineur.aff();
				
			}
			
			
			while(!demineur.getCompleted())
			{
				
				System.out.print("Colonne: ");
				c = Integer.parseInt(sc.nextLine());
				System.out.print("Ligne: ");
				l = Integer.parseInt(sc.nextLine());
				
				demineur.click(c, l);
				
				if(!demineur.isDeath())
					demineur.aff();
				else break;
				
			}
			
			demineur.setVisible(true);
			demineur.aff();
			
			if(!demineur.isDeath())System.out.println("YOU WON !");
			else System.out.println("YOU DEATH !");
			
			/**System.out.println("1. Rejouer la mÍme map");**/
			System.out.println("2. Rejouer une autre map");
			System.out.println("3. Quitter");
			val = Integer.parseInt(sc.nextLine());
			
			/**if(val == 1)NoRe=false;**/
			if(val == 2)NoRe=true;
			if(val == 3)cont=false;
			
		}

	}

}