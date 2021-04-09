package series;

import java.util.ArrayList;


public class Temporada {

	private int numero;
	private ArrayList<Capitulo> capitulos;
	private Serie serie;
	
	// FULL
	public Temporada(int numero, Serie serie) {
		this.numero = numero;
		this.capitulos = new ArrayList<Capitulo>();
		this.serie = serie;
	}
	
	// POR DEFECTO
	public Temporada() {
		this.capitulos = new ArrayList<Capitulo>();
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public boolean addCapitulo(Capitulo capitulo) {
		capitulos.add(capitulo);
		capitulo.setTemporada(this);   //this --> temporada. 
		return true; 
	}
	
	public String ListaCapitulos() {
		String resultado="";
		for (Capitulo capitulo: capitulos) {
			resultado += capitulo; // Se deberia implentar la clase toString de capitulo.
		}
		return resultado;	
	}
}
