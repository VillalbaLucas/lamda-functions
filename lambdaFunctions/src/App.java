import java.io.InputStream;
import java.util.Scanner;

import Clases.Mensaje;

public class App {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String mensajeIn = in.nextLine();

        Mensaje mjs = (s) -> System.out.println("Nuevo mensaje: " + s);
        Mensaje mjs2 = (s) -> System.out.println("Nuevo mensaje del metodo 2: " + s);

        mjs2.saludo(mensajeIn);
    }



}
