package series;

import java.util.ArrayList;

public class Serie {

	private String titulo;
	private ArrayList<Temporada> temporadas;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTItulo(String titulo) {
		this.titulo = titulo;
	}
	
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
		if (!temporadas.contains(temporada)) {
			temporadas.add(temporada);
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		String res= "Serie [titulo=" + titulo + " ]\n";
		for(Temporada temporada:temporadas)
			res=res+temporada;
		return res;
	}
	
	


	
	
}
