package model;

public class Film {
    
    private final String caratula;
    private final String titulo;
    private final int año;
    private final String director;
    private final String actores;
    private final String genero;
    private final int calificacion;
    private final int duracion;
    private final int visionados;
            
    public Film(String caratula, String titulo, int año, String director, 
            String actores, String genero, int calificacion, int duracion, int visionados){
        
        this.caratula = caratula;
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.actores = actores;
        this.genero = genero;
        this.calificacion = calificacion;
        this.duracion = duracion;
        this.visionados = visionados;
    }
    
    public String getName(){
        return this.titulo;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public int getAño(){
        return this.año;
    }
    
    public int getVisionados(){
        return this.visionados;
    }
    
    public int getCalificacion(){
        return this.calificacion;
    }
    
    @Override
    public String toString(){
        return "Caratula: " + this.caratula + " Titulo: " + this.titulo 
                + " Ano de salida: " + String.valueOf(this.año) + 
                " Director: " + this.director + " Actores: " + this.actores + 
                " Genero: " + this.genero + " Calificacion: " 
                + String.valueOf(this.calificacion) + " Duracion: " 
                + String.valueOf(this.duracion) + " Veces vista: " 
                + String.valueOf(this.visionados);
    }
    
    
}
