package netflix;
//CLASE PADRE

/**
 * @author Diego Villarroel
 */
public class Audiovisual {
    
    //ATRIBUTOS
    private String titulo;
    private String creador;
    private String genero;
    private int duracion;
    public boolean visto;
    
    //CONSTRUCTORES
    public Audiovisual(){
    }
    public Audiovisual(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }
    public Audiovisual(String titulo, String creador, String genero, int duracion){
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    //GETTERS Y SETTERS
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getCreador(){
        return creador;
    }
    public void setCreador(String creador){
        this.creador = creador;
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public int getDuracion(){
        return duracion;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
}
