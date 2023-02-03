
import java.util.Scanner;

import Clases.Carta;
import Clases.Mensaje;

public class App {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String firstMjs = in.nextLine();
        String secondMjs = in.nextLine();

        Mensaje mjs = (s) -> System.out.println("Nuevo mensaje: " + s);
        Mensaje mjs2 = (s) -> System.out.println("Nuevo mensaje del metodo 2: " + s);

        mjs.saludo(firstMjs);
        mjs2.saludo(secondMjs);


        Carta carta = new Carta();
        carta.saludo(secondMjs);
    }



}
