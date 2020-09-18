package netflix;
import java.util.Arrays;
//PRINCIPAL

/**
 * @author Diego Villarroel
 */
public class Netflix {
    public static void main(String[] args) {
        
        Pelicula[] peliculas = new Pelicula[5];
        peliculas[0] = new Pelicula("Joker", "Todd Philips", "Thriller", 122, 2019);
        peliculas[1] = new Pelicula("Dragón Rojo", "Bret Ratner", "Thriller", 124, 2002);
        peliculas[2] = new Pelicula("La Lista de Schindler", "Steven Spielberg", "Drama", 195, 1993);
        peliculas[3] = new Pelicula();
        peliculas[4] = new Pelicula("Deadpool 2", "David Leitch");
        
        Serie[] series = new Serie[5];
        series[0] = new Serie("Band of Brother", "Phil Alden Robinson", "Acion", 70, 1);
        series[1] = new Serie("Rick y Morty", "Dan Harmon", "Dibujos", 23, 3);
        series[2] = new Serie("Friends", "David Crane", "Comedia", 22, 4);
        series[3] = new Serie("Black Mirror", "Charlie Brooker");
        series[4] = new Serie();       
        
        peliculas[0].marcarVisto();
        peliculas[2].marcarVisto();
        series[1].marcarVisto();
        series[3].marcarVisto();
                
        
        for (int i = 0; i < peliculas.length; i++){
            if(peliculas[i].esVisto()){
                peliculas[i].mostrarDatos();
                System.out.println(peliculas[i].tiempoVisto() + " minutos vistos");
                System.out.println("");
            }
        }
        
        for (int i = 0; i < series.length; i++){
            if(series[i].esVisto()){
                series[i].mostrarDatos();
                System.out.println(series[i].tiempoVisto() + " minutos vistos");
                System.out.println("");
            }
        }
        
        /* CICLO FOR - NO FUNCA
        int j = 0;
        for (int i = 0; i < series.length; i++){
            if(series[i].getTemporada() < series[i + 1].getTemporada()){
                return j++;
            }
        }
        series[j].toString();
        */
        
        /*  ARRAY.SORT - NO FUNCA
        Arrays.sort(series);
        Arrays.sort(peliculas);
        */
    }
}
        