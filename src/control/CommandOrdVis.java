package control;

import model.Videoteca;

public class CommandOrdVis implements Command {

    private final Videoteca videoteca;

    public CommandOrdVis(Videoteca videoteca) {
        this.videoteca = videoteca;
    }
    
    @Override
    public void execute(){
        videoteca.ordMasvistas();
    }
}
