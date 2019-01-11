package dd;

import java.util.Random;

public class Dem
{

	private int c;
	private int l;
	private int b;
	private boolean d;
	
	private int prohValueC;
	private int prohValueL;
	
	private int[][] grille;
	private boolean[][] place;
	
	
	public Dem()
	{
		
		c = 10;
		l = 10;
		b = 10;
		d = false;
		int i = 0;
		int j = 0;
		
		prohValueC = -1;
		prohValueL = -1;
		
		grille = new int[c][l];
		place = new boolean[c][l];
		
		
		while(i<c)//INIT
		{
			
			j = 0;
			
			while(j<l)
			{
				
				grille[i][j] = 0;
				place[i][j] = false;
				
				
				j++;
				
			}
			
			i++;
			
		}
		
	}
	
	public Dem(int _x, int _y, int _m)
	{
		
		c = _x;
		l = _y;
		b = _m;
		d = false;
		int i = 0;
		int j = 0;
		
		prohValueC = -1;
		prohValueL = -1;
		
		grille = new int[c][l];
		place = new boolean[c][l];
		
		
		while(i<c)//INIT
		{
			
			j = 0;
			
			while(j<l)
			{
				
				grille[i][j] = 0;
				place[i][j] = false;
				
				j++;
				
			}
			
			i++;
			
		}
		
	}
	
	public void Init()
	{
		
		c = 10;
		l = 10;
		b = 10;
		d = false;
		int i = 0;
		int j = 0;
		
		prohValueC = -1;
		prohValueL = -1;
		
		grille = new int[c][l];
		place = new boolean[c][l];
		
		
		while(i<c)//INIT
		{
			
			j = 0;
			
			while(j<l)
			{
				
				grille[i][j] = 0;
				place[i][j] = false;
				
				
				j++;
				
			}
			
			i++;
			
		}
		
	}
	
	public void Init(int _x, int _y, int _m)
	{
		
		c = _x;
		l = _y;
		b = _m;
		d = false;
		int i = 0;
		int j = 0;
		
		prohValueC = -1;
		prohValueL = -1;
		
		grille = new int[c][l];
		place = new boolean[c][l];
		
		
		while(i<c)//INIT
		{
			
			j = 0;
			
			while(j<l)
			{
				
				grille[i][j] = 0;
				place[i][j] = false;
				
				
				j++;
				
			}
			
			i++;
			
		}
		
	}
	
	public void genMap()
	{
		
		int i = 0;
		int j = 0;
		
		//METTRE LES MINES
		while(i < b)
		{
			
			int xA = rand(c-1);
			int yA = rand(l-1);
			
			if(grille[xA][yA] != 9)
			{
				if(xA == prohValueC && yA == prohValueL)i--;
				else grille[xA][yA] = 9;
			}
			else i--;
			
			i++;
			
		}
		
		//METTRE LES CHIFFRES
		i = 0;
		while(i<c)
		{

			j = 0;
			
			while(j<l)
			{
				
				if(grille[i][j] == 9)
				{
				
					if(i-1>=0)
						if(i-1 < c && grille[i-1][j] != 9) grille[i-1][j]++;
					if(i+1 < c && grille[i+1][j] != 9) grille[i+1][j]++;
					if(j-1>=0)
						if(j-1 < l && grille[i][j-1] != 9) grille[i][j-1]++;
					if(j+1 < l && grille[i][j+1] != 9) grille[i][j+1]++;
					if(i+1 < c && j+1 < l && grille[i+1][j+1] != 9) grille[i+1][j+1]++;
					if(i-1>=0 && j-1>=0)
						if(i-1 < c && j-1 < l && grille[i-1][j-1] != 9) grille[i-1][j-1]++;
					if(i-1>=0)
						if(i-1 < c && j+1 < l && grille[i-1][j+1] != 9) grille[i-1][j+1]++;
					if(j-1>=0)
						if(i+1 < c && j-1 < l && grille[i+1][j-1] != 9) grille[i+1][j-1]++;
					
				}

				j++;
				
			}
			
			i++;
			
		}
		
	}
	
	public void aff()
	{
		
		int i = 0;
		int j = 0;
		
		while(j<l)
		{
			
			i = 0;
			while(i<c)
			{
				
				if(place[i][j] == true)
				{
					if(grille[i][j] == 0)
						System.out.print(".");
					if(grille[i][j] == 1)
						System.out.print("1");
					if(grille[i][j] == 2)
						System.out.print("2");
					if(grille[i][j] == 3)
						System.out.print("3");
					if(grille[i][j] == 4)
						System.out.print("4");
					if(grille[i][j] == 5)
						System.out.print("5");
					if(grille[i][j] == 6)
						System.out.print("6");
					if(grille[i][j] == 7)
						System.out.print("7");
					if(grille[i][j] == 8)
						System.out.print("8");
					if(grille[i][j] == 9)
						System.out.print("*");
					
				}
				else System.out.print(" ");
				
				i++;
			
			}
		
			System.out.println();
			j++;
		
		}
		
	}
	
	public void setVisible(boolean bool)
	{
		
		int i = 0;
		int j = 0;
		
		while(i < c)
		{
			
			j = 0;
			
			while(j < l)
			{
				
				place[i][j] = bool;
				
				j++;
				
			}
			
			i++;
			
		}
		
	}

	public void click(int sX, int sY)
	{
		
		int[][] table = null;
		
		do
		{
			
			if(table == null)
				table = new int[1][2];table[0][0]=sX;table[0][1]=sY;
			
			if(grille[sX][sY] == 9){d=true;table=null;}
			else table = dec(table);
			
		}while(table != null);
		
	}
	
	public boolean getCompleted()
	{
		
		int i = 0;
		int j = 0;
		
		for(boolean[] tab : place)
		{
			j = 0;
			for(boolean t : tab)
			{
				if(!t && grille[i][j] != 9)return false;
				j++;
			}
			i++;
		}
		
		return true;
		
	}
	
	
	private static int rand(int max)
	{
		
		Random rand = new Random();
		return rand.nextInt(max+1);
		
	}
	
	private int[][] dec(int table[][])
	{
		
		int i = 0;
		
		int[][] tab = null;
		
		for(int[] t: table)
		{
			
			int sX = t[0];
			int sY = t[1];
			
			if(sX < c && sY < l)
			{
				
				place[sX][sY] = true;
				
				if(grille[sX][sY] == 0)
				{
					
					if(sX-1 < c && sX-1 >= 0 && place[sX-1][sY] == false)
					{
						if(grille[sX-1][sY] != 9) place[sX-1][sY] = true;
						if(grille[sX-1][sY] == 0)
						{
							if(tab == null)tab = new int[c*l][2];
							tab[i][0]=sX-1; tab[i][1]=sY;
						}i++;
					}
					if(sX+1 < c && place[sX+1][sY] == false)
					{
						if(grille[sX+1][sY] != 9) place[sX+1][sY] = true;
						if(grille[sX+1][sY] == 0)
						{
							if(tab == null)tab = new int[c*l][2];
							tab[i][0]=sX+1; tab[i][1]=sY;
						}i++;
					}
					if(sY-1 < l && sY-1 > 0 && place[sX][sY-1] == false)
					{
						if(grille[sX][sY-1] != 9) place[sX][sY-1] = true;
						if(grille[sX][sY-1] == 0)
						{
							if(tab == null)tab = new int[c*l][2];
							tab[i][0]=sX; tab[i][1]=sY-1;
						}i++;
					}
					if(sY+1 < l && place[sX][sY+1] == false)
					{
						if(grille[sX][sY+1] != 9) place[sX][sY+1] = true;
						if(grille[sX][sY+1] == 0)
						{
							if(tab == null)tab = new int[c*l][2];
							tab[i][0]=sX; tab[i][1]=sY+1;
						}i++;
					}
					if(sX-1 < c && sY-1 < l && sX-1 >= 0 && sY-1 >= 0 && place[sX-1][sY-1] == false)
					{
						if(grille[sX-1][sY-1] != 9) place[sX-1][sY-1] = true;
						if(grille[sX-1][sY-1] == 0)
						{
							if(tab == null)tab = new int[c*l][2];
							
							tab[i][0]=sX-1; tab[i][1]=sY-1;
						}i++;
							
					}
					if(sX+1 < c && sY+1 < l && place[sX+1][sY+1] == false)
					{
						if(grille[sX+1][sY+1] != 9) place[sX+1][sY+1] = true;
						if(grille[sX+1][sY+1] == 0)
						{
							if(tab == null)tab = new int[c*l][2];
							
							tab[i][0]=sX+1; tab[i][1]=sY+1;
						}i++;
					}
					if(sX-1 < c && sY+1 < l && sX-1 >= 0 && place[sX-1][sY+1] == false)
					{
						if(grille[sX-1][sY+1] != 9) place[sX-1][sY+1] = true;
						if(grille[sX-1][sY+1] == 0)
						{
							if(tab == null)tab = new int[c*l][2];
							
							tab[i][0]=sX-1; tab[i][1]=sY+1;
						}i++;
					}
					if(sX+1 < c && sY-1 < l && sY-1 >= 0 && place[sX+1][sY-1] == false)
					{
						if(grille[sX+1][sY-1] != 9) place[sX+1][sY-1] = true;
						if(grille[sX+1][sY-1] == 0)
						{
							if(tab == null)tab = new int[c*l][2];
							
							tab[i][0]=sX+1; tab[i][1]=sY-1;
						}i++;
					}
					
				}
				
			}
			
		}
		
		return tab;
		
	}
	
	public boolean isDeath() {
		return d;
	}
	
	public void prohibitedValue(int x, int y)
	{
		prohValueC = x;
		prohValueL = y;
	}
	
  	public int getX() {
		return c;
	}

	public int[][] getMap() {
		return grille;
	}

	public boolean[][] getShem() {
		return place;
	}

	public int getY() {
		return l;
	}

	public int getMine() {
		return b;
	}

	public void setMap(int[][] map) {
		this.grille = map;
	}

	public void setShem(boolean[][] shem) {
		this.place = shem;
	}
	
}
