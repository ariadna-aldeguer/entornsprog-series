package series;

import java.util.ArrayList;

public class Serie {

	private String titulo;
	private ArrayList<Temporada> temporadas;
	
	public Serie(String titulo, ArrayList<Temporada> temporadas) {
		this.titulo = titulo;
		this.temporadas = temporadas;
	}

	// FULL
	public Serie(String titulo){
		this.titulo = titulo;
		this.temporadas = new ArrayList<Temporada>();
	} 
	
	// POR DEFECTO 
	public Serie() {
		this.temporadas = new ArrayList<Temporada>();
	} 
	
	public boolean addTemporada(Temporada temporada) {
		temporadas.add(temporada);
		temporada.setSerie(this);   //this --> serie. 
		return true; 
	}


	
	
}
