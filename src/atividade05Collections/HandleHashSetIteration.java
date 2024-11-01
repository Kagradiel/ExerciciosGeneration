package atividade05Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import atividade05Collections.Services.CollectionsManipulator;

public class HandleHashSetIteration {
	
	private static CollectionsManipulator listManipulator = new CollectionsManipulator();

    public static void handle(Scanner read) {
        Set<Integer> setNumbers = new HashSet<>();
        
        System.out.println("\nDigite 10 valores não repetidos");
        listManipulator.getSet(setNumbers, 10, "Digite o número", read);
        
        System.out.println("\nListar dados do Set: ");
        Iterator<Integer> iSetNumbers = setNumbers.iterator();
        while (iSetNumbers.hasNext()) {
            System.out.println(iSetNumbers.next());
        }
    }
	
}
