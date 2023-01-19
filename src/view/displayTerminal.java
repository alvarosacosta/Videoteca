package view;

import control.Command;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import model.Videoteca;

public class displayTerminal implements display{
    private Videoteca videoteca;
    private Map<String, Command> commands = new HashMap<>();
    
    public displayTerminal(Videoteca videoteca){
        this.videoteca = videoteca;
        
    }
    
    @Override
    public void start(){
        showFilms();
        showConfig();
    }
    
    @Override
    public void addCommand(String name, Command cm){
        this.commands.put(name, cm);
    }
    
    @Override
    public void showFilms() {
        System.out.println(this.videoteca.toString());

    }

    @Override
    public void showConfig() {
        System.out.println("Escriba \"Orden\" y pulsa enter si quieres cambiar el orden de visualizacion: ");
        
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        if(line.equals("Orden")){
            showOrdConfig();
        } else{
            System.out.println("Comando no permitido.");
            showConfig();
        }
        
        showFilms();
        showConfig();
    }
    
    @Override
    public void showOrdConfig(){
        System.out.println("\nAhora esriba como lo quiere ordenar: "
                    + "\n Genero -> Ordenar por genero de pelicula. "
                    + "\n Novedades -> Ordenar por las ultimas novedades."
                    + "\n Vistas -> Muestra primero las mas vistas."
                    + "\n Valoradas -> Muestra primero las mejores calificadas.");
        
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        if(line.equals("Genero") || line.equals("Novedades") 
                || line.equals("Vistas") || line.equals("Valoradas")){
            
            this.commands.get(line).execute();
            
            System.out.println("Hecho!");
            showFilms();
            showConfig();

        } else {
            System.out.println("Comando no permitido.");
            showConfig();
        }
        
    }
    
    
}
