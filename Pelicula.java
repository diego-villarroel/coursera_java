package netflix;
/**
 * @author Diego Villarroel
 */
public class Pelicula extends Audiovisual implements IVisualizable {
    
    //ATRIBUTOS, GETTERS Y SETTERS
    private int año;    
    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año = año;
    }
    
    //CONSTRUCTORES
    public Pelicula(){
        super.setTitulo("-");
        super.setCreador("-");
        super.setGenero("-");
        this.visto = false;
    }    
    public Pelicula(String titulo, String creador){
        super(titulo, creador);
        super.setGenero("-");
        this.visto = false;
    }
    public Pelicula(String titulo, String creador, String genero, int duracion, int año){
        super(titulo, creador, genero, duracion);
        this.año = año;
        this.visto = false;
    }
    
    //METODOS
    @Override
    public void marcarVisto(){
        super.visto = true;
    }
    @Override
    public boolean esVisto(){
        return visto;
    }
    public int tiempoVisto(){
        return (int) (super.getDuracion() - 23);
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Titulo: " + super.getTitulo());
        System.out.println("Creador: " + super.getCreador());
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Duracion: " + super.getDuracion() + " minutos");
        System.out.println("Año: " + this.getAño());
        System.out.println("Visto: " + visto);
    }
    @Override
    public String toString(){
        return super.getTitulo() + ", " + super.getCreador() + ", " + super.getGenero() + ", " + super.getDuracion() + ", " + this.getAño();
    }
    public int compareTo(Pelicula o){
        if(this.getAño() < o.getAño()){
            return -1;
        }
        if(this.getAño() > o.getAño()){
            return 1;
        }
        return 0;
    }
}
