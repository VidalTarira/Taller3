import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Pelicula {
    String titulo;
    int anio;
    String genero;

    public Pelicula(String titulo, int anio, String genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return anio + " - " + titulo + " (" + genero + ")";
    }
}

public class OrdenadorPeliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pelicula> lista = new ArrayList<>();

        System.out.print("¿Cuántas películas desea ingresar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        for (int i = 0; i < n; i++) {
            System.out.println("\nPelícula #" + (i + 1));
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Año de lanzamiento: ");
            int anio = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer
            System.out.print("Género: ");
            String genero = scanner.nextLine();

            lista.add(new Pelicula(titulo, anio, genero));
        }

        // Ordenar por año
        Collections.sort(lista, Comparator.comparingInt(p -> p.anio));

        // Mostrar resultado
        System.out.println("\n--- Películas Ordenadas por Año ---");
        for (Pelicula p : lista) {
            System.out.println(p);
        }

        scanner.close();
    }
}

