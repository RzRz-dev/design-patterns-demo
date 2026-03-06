
import model.objects.TextDocument;
import model.registries.DocumentRegistry;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        * Problem to be solved:
        * Imagine you want to create many objects with one same basis
        * For example, you want to copy a car, but if you look from outside, a you will only see, the chassis, maybe the wheels, etc.
        * But, you won't see the motor, and some othe features as the HP.
        * So, if you want to create as many cars as you want, you will evenrually realize that you can't, because you don't know each of its properties, and methods.
        * 
        * That's why prototype design pattern is useful. It delegates the creation of new objects to the object itself.
        */
        
        DocumentRegistry registry = new DocumentRegistry();

        TextDocument reportTemplate =
                new TextDocument("Report Template", "", "Times New Roman", 12);

        TextDocument resumeTemplate =
                new TextDocument("Resume Template", "", "Arial", 11);

        registry.register("report", reportTemplate);
        registry.register("resume", resumeTemplate);

        TextDocument report =
                (TextDocument) registry.get("report");

        report.setTitle("Q1 Financial Report");
        report.setContent("Revenue increased by 20%");

        System.out.println(report);        


    }
}
