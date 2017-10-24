package domini;

public class posicio {
	//atributs de la clase posicio
	
	private int fila, columna;
	
	//metode per saber si la casella que es crea esta dins o no dels limits del taulell
	public static boolean posicioIncorrecte(int x, int y){
		if (x == 0 || x == 1 || x == 5 || x == 6)
			if (y == 0 || y == 1 || y == 5 || y == 6)return true;
		
		return false;
	}
	
	
	public posicio (int f, int c){
		fila = f;
		columna = c;

	}
	
	public int getFila(){
		return fila;
	}
	
	public int getColumna(){
		return columna;
	}
}
