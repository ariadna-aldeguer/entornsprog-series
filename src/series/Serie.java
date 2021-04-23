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
		this.titulo = "";
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
	
	
	public String getTitulo() {
		return titulo;
	}
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
		
	/* SIN REFACTORING
	public int getDuracionSerie() {
		int total=0;
		
		for (Temporada temporada:temporadas) {
			ArrayList<Capitulo> capitulos = temporada.getCapitulos();
			for(Capitulo capitulo:capitulos) {
				total = total+capitulo.getDuracion();
			}
		}
		return total;
	}
	
	CON REFACTORING	
	public int getDuracionSerieCon() {
		int total=0;
		for (Temporada temporada:temproadas) {
			total = total+temporada.getDuration();
		}
		return total;
	}
	*/
	
	
}
