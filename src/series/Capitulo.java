package series;

import java.util.ArrayList;

public class Capitulo extends Especial{
	
	public final int DURACION = 0;
	private int duracion;
	private int num;
	private Temporada temporada;
	private ArrayList<Personaje> personajes;
	
	
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
	
	
	
}
