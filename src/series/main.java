package series;

public class main {

	public static void main(String[] args) {
		
		Serie miserie = new Serie("Walking Dead");
		miserie.addTemporada(new Temporada(1,miserie));
		miserie.addTemporada(new Temporada(2,miserie));
		miserie.addTemporada(new Temporada(3,miserie));
		miserie.addTemporada(new Temporada(4,miserie));
		miserie.addTemporada(new Temporada(5,miserie));
		miserie.addTemporada(new Temporada(6,miserie));
		
		Temporada temporada6 = new Temporada(6,miserie);
		temporada6.addCapitulo(new Capitulo(45,1,temporada6));
		miserie.addTemporada(temporada6);
		
		System.out.print(miserie);

	}

}
