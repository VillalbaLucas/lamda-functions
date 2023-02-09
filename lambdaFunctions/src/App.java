
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Clases.Mensaje;
import Clases.Persona;

public class App {


    private List<Persona> personas = new ArrayList<>();

    public void addPersonas(){
        Persona p = new Persona("Lucas", "Villalba", 123445, 23);
        Persona p2 = new Persona("Manuel", "Sosa", 123451251, 44);
        Persona p3 = new Persona("Estella", "Gomez", 42123717, 32);
        Persona p4 = new Persona("Maria", "Sain", 5543123, 23);

        personas.add(p); personas.add(p2); personas.add(p3); personas.add(p4);
    }

    public List<Persona> getPersonas() {
        return this.personas;
    }
    public static void main(String[] args){

        /* Scanner in = new Scanner(System.in);

        String firstMjs = in.nextLine();
        String secondMjs = in.nextLine();

        Mensaje mjs = (s) -> System.out.println("Nuevo mensaje: " + s);
        Mensaje mjs2 = (s) -> System.out.println("Nuevo mensaje del metodo 2: " + s);

        mjs.saludo(firstMjs);
        mjs2.saludo(secondMjs);*/
        

        App app = new App();
        app.addPersonas();
        System.out.print( app.getPersonas().stream()
                         .map(e -> e.toString())
                         .collect( Collectors.joining(", ") ) );
                         

    }



}
