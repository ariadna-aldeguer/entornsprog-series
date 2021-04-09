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
	
	public Temporada(int numero) {
		this.numero = numero;
		this.capitulos = new ArrayList<Capitulo>();
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
		if(!capitulos.contains(capitulo)) {
			capitulos.add(capitulo);
			return true;
		} else {
			return true;
		}
	}
	
	public String ListaCapitulos() {
		String res = "";
		for (Capitulo capitulo:capitulos) {
			res = res + capitulo;
		}
		return res;
	}

	@Override
	public String toString() {
		return "Temporada [numero=" + numero + ", serie=" + serie.getTitulo()+ "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		result = prime * result + ((serie == null) ? 0 : serie.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temporada other = (Temporada) obj;
		if (numero != other.numero)
			return false;
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		return true;
	}
	
	
	
	
	
}
