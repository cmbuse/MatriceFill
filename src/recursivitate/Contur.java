package recursivitate;

public class Contur {
	public int [][] matrice = {
		{0, 1, 0, 1, 0, 0, 1},
		{0, 1, 0, 1, 0, 0, 1},
		{0, 1, 0, 1, 0, 0, 1},
		{0, 1, 1, 1, 0, 0, 1},
		{0, 0, 0, 1, 0, 0, 1},
		{0, 1, 0, 1, 0, 0, 1},
		{0, 1, 0, 1, 0, 0, 1},
	};

	
	public int show() {
		// afisare matrice
		
				for(int i= 0; i < matrice.length; i++) {
						for(int j= 0; j < matrice[i].length; j++){
								System.out.print( matrice[i][j]);
								} 
					System.out.println();
		}
				return 0;
	} 

	public void fill( int x, int y) {
		if(x<0 || y<0 || x>= matrice.length || y>= matrice[0].length ) {
			return;
		}
		if(matrice[x][y]==0) {
			 matrice[x][y]=2; 
		
		fill(x-1, y);
		fill(x+1,y);
		fill(x,y-1);
		fill(x,y+1);
		
	}}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contur contur = new Contur();
		contur.show();
		contur.fill(2,2);
		System.out.println("...........................");
		contur.show();
		contur.fill(0,0);
		System.out.println("...........................");
		//contur.fill(4,4);
		contur.show();
	}


}



	
