package domini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class joc {
	private  List<casella> taulell = new ArrayList<casella>();
	
	
	public joc(){
		
	}
	
	
	public void creaTaulell(){
		int comptador = 0; //variable per poder numerar la fitxa
		for(int f = 0; f < 7; f++){
			for(int c = 0; c < 7; c++){
				if(comptador == 16){
					taulell.add(new casella(17,false,f,c));
					comptador = 17;
					
				}
				else if(posicio.posicioIncorrecte(f, c) == false){
					comptador++;
					taulell.add(new casella(comptador,true,f,c));
				}
				
			}
		
		}
		
		//la casella central esta buida
	} 
	
	

	public String toString() {
		Iterator<casella>mostra = taulell.iterator();
		String ret = "";
		
		while(mostra.hasNext()){
			casella aux = mostra.next();
			if(aux.Ocupada()){
				System.out.print(aux.NumeroCasella() + " X");
			}else{
				System.out.print(aux.NumeroCasella() + " ");
			}
		
		}
		
		return ret;
		
	/*
		int comptador = 0;
		String visual = "";
		for (int f = 0; f < 7; f++) {
			for (int c = 0; c < 7; c++) {
				if(posicio.posicioIncorrecte(f, c) == false){
					if(taulell.get(comptador).Ocupada()){
						visual += taulell.get(comptador).NumeroCasella() + "  X  ";comptador++;
					}else{
						visual += taulell.get(comptador).NumeroCasella() + "     ";

					}
				}else{
					if(c == 6)
						visual += "\n";
					else 
						visual += "     ";
				}
				
				
			}
			
			visual += "\n";
		}
		return visual;
		
	*/
	}
	
	public static void main (String args[]){
		joc joguina = new joc();
		joguina.creaTaulell();
		System.out.println(joguina);
	}
}
