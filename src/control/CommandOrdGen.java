package control;

import model.Videoteca;

public class CommandOrdGen implements Command {

    private final Videoteca videoteca;

    public CommandOrdGen(Videoteca videoteca) {
        this.videoteca = videoteca;
    }
    
    @Override
    public void execute(){
        videoteca.ordGenero();
    }
}
