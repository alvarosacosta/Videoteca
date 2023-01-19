package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Videoteca {

    ArrayList<Film> pelis = new ArrayList<>();

    public void addFilm(Film film){
        pelis.add(film);
    }
    
    public void deleteFilm(String titulo){
        for (Film peli : pelis) {
            if(peli.getName().equals(titulo)){
                pelis.remove(peli);
            }
        }
    }
    
    public Film getFilm(String titulo){
        for (Film peli : pelis) {
            if(peli.getName().equals(titulo)){
                return peli;
            }
        }
        
        return null;
    }
    
    public void ordGenero(){
        Collections.sort(pelis, (Film obj1, Film obj2) -> obj1.getGenero().compareTo(obj2.getGenero()));
    }
    
    @Override
    public String toString(){
        String result = "";
        
        for (Film peli : pelis) {
            result += peli.toString() + "\n";
        }
        
        return result;
    }
    
    public void ordNovedades(){
        Collections.sort(pelis, (Film obj1, Film obj2) -> obj2.getAño() - obj1.getAño());
    }
    
    public void ordMasvistas(){
        Collections.sort(pelis, (Film obj1, Film obj2) -> obj2.getVisionados() - obj1.getVisionados());
    }
    
    public void ordMasvaloradas(){
        Collections.sort(pelis, (Film obj1, Film obj2) -> obj2.getCalificacion() - obj1.getCalificacion());
    }
    
}
