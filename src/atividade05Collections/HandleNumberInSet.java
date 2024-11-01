package atividade05Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HandleNumberInSet {

    public static void handle(Scanner read) {
    	
        Set<Integer> setNumbersToFind = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            setNumbersToFind.add(i + 1);
        }

        System.out.print("\nDigite um número inteiro: ");
        int number = read.nextInt();

        if (!setNumbersToFind.contains(number))
            System.out.println("\nO número " + number + " não foi encontrado!");
        else
            System.out.println("\nO número " + number + " foi encontrado!");
        

    }
	
}
