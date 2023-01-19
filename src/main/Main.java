package main;

import control.CommandOrdGen;
import control.CommandOrdNov;
import control.CommandOrdVal;
import control.CommandOrdVis;
import model.Film;
import model.Videoteca;
import view.display;
import view.displayTerminal;



public class Main {

    public static void main(String[] args) {
        Videoteca videoteca = new Videoteca();
        iniPelis(videoteca);
        
        display display = new displayTerminal(videoteca);
        
        display.addCommand("Genero", new CommandOrdGen(videoteca));
        display.addCommand("Novedades", new CommandOrdNov(videoteca));
        display.addCommand("Vistas", new CommandOrdVis(videoteca));
        display.addCommand("Valoradas", new CommandOrdVal(videoteca));
        
        display.start();
        
    }
    
    public static void iniPelis(Videoteca videoteca){
        videoteca.addFilm(new Film("Caratula1", "Titulo1", 
                2000, "Director1", "Actor1, Actor2", 
                "GeneroA", 10, 120, 456));
        videoteca.addFilm(new Film("Caratula2", "Titulo2", 
                2002, "Director2", "Actor2, Actor3", 
                "GeneroC", 8, 120, 299));
        videoteca.addFilm(new Film("Caratula3", "Titulo3", 
                2004, "Director3", "Actor4, Actor5", 
                "GeneroB", 2, 120, 2000));
        videoteca.addFilm(new Film("Caratula4", "Titulo4", 
                2006, "Director4", "Actor6, Actor7", 
                "GeneroB", 10, 120, 0));
        videoteca.addFilm(new Film("Caratula5", "Titulo5", 
                2023, "Director5", "Actor8, Actor9", 
                "GeneroC", 6, 120, 1));
        videoteca.addFilm(new Film("Caratula6", "Titulo6", 
                2077, "Director6", "Actor10, Actor11", 
                "GeneroC", 7, 120, 19078));
        videoteca.addFilm(new Film("Caratula7", "Titulo7", 
                1988, "Director7", "Actor12, Actor13", 
                "GeneroA", 8, 120, 1234));
        videoteca.addFilm(new Film("Caratula8", "Titulo8", 
                2009, "Director8", "Actor14, Actor15", 
                "GeneroB", 9, 120, 22));
        videoteca.addFilm(new Film("Caratula9", "Titulo9", 
                2999, "Director9", "Actor16, Actor17", 
                "GeneroA", 10, 120, 48));
    }
    
}
