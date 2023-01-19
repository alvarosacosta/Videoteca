package view;

import control.Command;

public interface display {
    public void start();
    public void showFilms();
    public void addCommand(String name, Command cm);
    public void showConfig();
    public void showOrdConfig();
}
