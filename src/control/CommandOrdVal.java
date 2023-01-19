package control;

import model.Videoteca;

public class CommandOrdVal implements Command {

    private final Videoteca videoteca;

    public CommandOrdVal(Videoteca videoteca) {
        this.videoteca = videoteca;
    }
    
    @Override
    public void execute(){
        videoteca.ordMasvaloradas();
    }
}
