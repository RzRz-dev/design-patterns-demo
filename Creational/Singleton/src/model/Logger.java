package model;

public class Logger {
    public static Logger instance;
    
    private Logger(){
        // This is private so no constructor can be called, this prevents Logger variable = new Logger();
    }

    public static Logger getInstance(){
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println("[LOG]: "+message);
    }
}
