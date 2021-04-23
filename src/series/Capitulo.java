package series;

import java.util.ArrayList;

public class Capitulo{
	
	private int duration;
	public final int DURACION;
	private int duracion;
	private int num;
	private Temporada temporada;
	private ArrayList<Personaje> personajes;
	
	
	public Capitulo() {
		this.personajes=new ArrayList<Personaje>();
		this.DURACION=45;
	}
	
	public Capitulo(int duracion, int num, Temporada temporada) {
		this.num=num;
		this.temporada=temporada;
		this.personajes=new ArrayList<Personaje>();
		this.DURACION=duracion;
	}
	
	public String ListaPersonajes() {
		String res="";
		for (Personaje personajes: personajes) {
			res += personajes; // Se deberia implentar la clase toString de capitulo.
		}
		return res;	
	}
	public boolean addPersonajes(Personaje personaje) {
		personajes.add(personaje);
		personaje.setCapitulo(this);   //this --> serie. 
		return true; 
	}
	
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getNum() { 
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String listaPersonajes() {
		StringBuffer sb = new StringBuffer();
		for(Personaje per:personajes) {
			sb.append(per.getNombre()+"\n");
		}
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DURACION;
		result = prime * result + duration;
		result = prime * result + num;
		result = prime * result + ((personajes == null) ? 0 : personajes.hashCode());
		result = prime * result + ((temporada == null) ? 0 : temporada.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Capitulo other = (Capitulo) obj;
		
		if (DURACION != other.DURACION) return false;
		if (duration != other.duration) return false;
		if (num != other.num) return false;
		if (personajes == null) {
			if (other.personajes != null)
				return false;
		} else if (!personajes.equals(other.personajes))
			return false;
		if (temporada == null) {
			if (other.temporada != null)
				return false;
		} else if (!temporada.equals(other.temporada)) {
			return false;
		}
		return true;
	}	
	
}
