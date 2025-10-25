package ruben.play;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cual es tu nombre?");
		String nombre = scanner.nextLine();
		
		System.out.println("Hola " + nombre  + ", Esto es ruben.play");
	}
}
