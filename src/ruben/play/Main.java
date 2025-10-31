package ruben.play;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
		pelicula.duracion = 120;
		
		long duracionLong = pelicula.duracion;
		int	calificacionInt = (int) pelicula.calificacion;
		
		System.out.println("Duracion Long " + duracionLong);
		System.out.println("calificacion int " + calificacionInt);
		
		
		Usuario usuario = new Usuario();
		usuario.nombre = "Carlos";
		usuario.fechaRegistro = LocalDateTime.of(2025, 12, 24, 17, 15, 14);
		
		System.out.println(usuario.fechaRegistro);
		
		usuario.ver(pelicula);
		

//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Cual es tu nombre?");
//		String nombre = scanner.nextLine();
//		
//		System.out.println("Hola " + nombre  + ", Esto es ruben.play");
	}
}

