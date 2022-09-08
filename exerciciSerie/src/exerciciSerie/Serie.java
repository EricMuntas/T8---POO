package exerciciSerie;

public class Serie {

	private String titulo = "";
	private int numeroTemporadas = 3;
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";
	
	
	// Por defecto.
	public Serie() {
		super();
	}


	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}


	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	
	
}
