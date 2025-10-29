package ruben.play;

import java.time.LocalDate;

import ruben.play.contenido.Pelicula;
import ruben.play.plataforma.Usuario;

public class Main {
	public static void main(String[] args) {
		System.out.println("RUBEN PLAY");
		
		Pelicula pelicula = new Pelicula();
		pelicula.titulo = "El señor de los anillos";
		pelicula.fechaEstreno = LocalDate.of(2018, 10, 15);
		pelicula.genero = "Fantasía";
		pelicula.calificar(4.2);
		
		System.out.println(pelicula.obtenerFichaTecnica());
		
		Usuario usuario = new Usuario();
		usuario.nombre = "Carlos";
		
		usuario.ver(pelicula);

//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Cual es tu nombre?");
//		String nombre = scanner.nextLine();
//		
//		System.out.println("Hola " + nombre  + ", Esto es ruben.play");
	}
}

