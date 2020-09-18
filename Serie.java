package netflix;

/**
 * @author Diego Villarroel
 */
public class Serie extends Audiovisual implements IVisualizable {
    
    //ATRIBUTOS, GETTERS Y SETTERS
    private int temporada;
    public int getTemporada(){
        return temporada;
    }
    public void setTemporada(int temporada){
        this.temporada = temporada;
    }
    
    //CONSTRUCTORES
    public Serie(){
        super.setTitulo("-");
        super.setCreador("-");
        super.setGenero("-");
        this.temporada = 1;
        this.visto = false;
    }    
    public Serie(String titulo, String creador){
        super(titulo, creador);
        super.setGenero("-");
        this.temporada = 1;
        this.visto = false;
    }
    public Serie(String titulo, String creador, String genero, int duracion, int temporada){
        super(titulo, creador, genero, duracion);
        this.temporada = temporada;
        this.visto = false;
    }
    
    //METODOS
    public void marcarVisto(){
        super.visto = true;
    }
    public boolean esVisto(){
        return visto;
    }
    public int tiempoVisto(){
        /*for(int time = this.getDuracion(); 0 < time; time--){
            Thread.sleep(1000);*/
        return (int) (super.getDuracion() - 17);       
    }
    public void mostrarDatos(){
        System.out.println("Titulo: " + super.getTitulo());
        System.out.println("Creador: " + super.getCreador());
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Duracion: " + super.getDuracion() + " minutos");
        System.out.println("Temporada: " + this.getTemporada());
        System.out.println("Visto: " + visto);
    }
    @Override
    public String toString(){
        return super.getTitulo() + ", " + super.getCreador() + ", " + super.getGenero() + ", " + super.getDuracion() + ", " + this.getTemporada();
    }   
    public int compareTo(Serie o){
        if(this.getTemporada() < o.getTemporada()){
            return -1;
        }
        if(this.getTemporada() > o.getTemporada()){
            return 1;
        }
        return 0;
    }
}
