package control;

import model.Videoteca;

public class CommandOrdNov implements Command {

    private final Videoteca videoteca;

    public CommandOrdNov(Videoteca videoteca) {
        this.videoteca = videoteca;
    }
    
    @Override
    public void execute(){
        videoteca.ordNovedades();
    }
}
