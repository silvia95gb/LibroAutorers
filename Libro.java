package paqueteClases;

public class Libro {
	String titulo;
	Autor autor;
	boolean prestado;

	public Libro(){}

	public Libro(String titulo, Autor autor ) {		
		this.titulo = titulo;
		this.autor = autor;
		this.prestado = false;	}

	public Libro (String titulo){
		this.titulo = titulo;		
		this.autor=new Autor ();	}

	public String getTitulo() {
		return titulo;	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;	}

	public Autor getAutor() {
		return autor;	}

	public void setAutor(Autor autor) {
		this.autor = autor;	}

	public void setAutor(){
		this.autor.setNombre("Ana");
		this.autor.setEdad(30);	}

	public boolean estaPrestado() {
		return prestado;	}

	public void prestar() {
		if (this.estaPrestado())
			System.out.println("No se puede prestar porque esta prestado");
		else prestado=true;	}	

	public void devolver(){
		if (!this.estaPrestado())
			System.out.println("No se puede devolver porque no esta prestado");
		else prestado=false;	}

	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor.toString() + ", prestado="
		+ prestado + "]";
	}
}

