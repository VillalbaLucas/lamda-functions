package ConjuntoSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoSet {
    
    public static void main(String[] args){
        
        System.out.println("HashSet paises: \n----------");

        Set<String> paises = new HashSet<>();
        paises.add("Argentina");
        paises.add("Chile");
        paises.add("Peru");
        paises.add("Colombia");
        paises.add("Paraguay");
        paises.add("Bolivia");

        paises.forEach(e -> System.out.print(e + ", "));

        System.out.println("\nTreeSet colores: \n----------");

        Set<String> colores = new TreeSet<>();
        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("azul");
        colores.add("violeta");
        colores.add("naranja");
        colores.add("amarillo");

        colores.forEach(c -> System.out.print(c + ", "));

        System.out.println("\nLinkedHashSet colores: \n----------");

        Set<Integer> numeros = new LinkedHashSet<>();
        numeros.add(4);
        numeros.add(2);
        numeros.add(1);
        numeros.add(6);
        numeros.add(12);
        numeros.add(4);
        numeros.add(7);

        numeros.forEach(n -> System.out.print(n + ", "));
    }

}
