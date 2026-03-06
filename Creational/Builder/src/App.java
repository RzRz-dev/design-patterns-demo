
import model.builders.ComputerBuilder;
import model.computers.Computer;
import model.director.Director;





public class App {
    public static void main(String[] args) throws Exception {
        /* The problem to solve:
         *      Imagine you have a very modular big object, for example a house, a house can have windows,
         *  doors, rooms, roof, floors, etc., but it can also have many things that most of the houses may or may not have.
         *  For exmaple, garden, garage, rooftop, mini bar, basement.
         * 
         *  So, instead of creating a large and ugly constructor is more convenient to implement this design pattern.
         */
        
        ComputerBuilder builder = new ComputerBuilder();
        Director director = new Director(builder);

        Computer computer1 = director.constructGamingComputer("Core i9", 32, "RTX 5080", "2 TB", "1200 W");
        System.out.println(computer1);

        Computer computer2 = director.constructOfficeCOmputer("Core i5", 8, "512 GB");
        System.out.println(computer2);

    }
}

