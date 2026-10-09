package app;

import database.DatabaseInitializer;

/**
 * Classe responsável por inicializar o JavaFX sem exigir 
 * parâmetros complexos de módulos (--module-path) na JVM.
 */
public class Launcher {

    public static void main(String[] args) {
        DatabaseInitializer.inicializar();
        MainApplication.main(args);
    }
}