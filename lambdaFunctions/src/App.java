import java.util.ArrayList;
import java.util.List;

import Clases.Carro;
import Clases.Lambda;
import Clases.Persona;
import Clases.Genericos.Caja;

public class App implements Carro {
    
    Persona persona;
    Carro carro = new Carro();
    Caja<String, Integer> caja = new Caja<>();
    List<Integer> arr = new ArrayList<>();
    
    @Override
    public String arrancar() {
        () -> System.out.println("Estoy arrancando el app");
    }


    public void calcular(){
        Lambda lambda = (x, y) -> x+y;
        System.out.println(lambda.suma(5, 6));

    }

    public void imprimir(List<Integer> arr){
        arr.forEach((x)-> System.out.print(x + " "));
        System.out.print("\n");
    }


    public static void main(String[] args) throws Exception {
        
        App app = new App();
        //app.calcular();

        List<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(3);
        array.add(20);
        array.add(5);
        array.add(15);
        array.add(3);
        array.add(7);

        app.imprimir(array);

        app.imprimir( 
                    array
                        .stream()
                        .filter(x -> x < 9)
                        .toList() 
                ); 
        array.sort((x,y) -> y.compareTo(x));
        app.imprimir(array);


        

    }



}
