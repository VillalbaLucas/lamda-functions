package Listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        System.out.println("ArrayList caracteres: \n----------- ");
        List<Character>caracteres = new ArrayList<>();

        caracteres.add('a');
        caracteres.add('z');
        caracteres.add('/');
        caracteres.add('g');
        caracteres.add('#');

        caracteres.stream()
                         .map(Character::toUpperCase)
                         .forEach(c -> System.out.print(c + ", "));
        
    }
}
