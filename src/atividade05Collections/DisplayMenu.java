package atividade05Collections;

import java.util.Scanner;

public class DisplayMenu {

	public static byte display(Scanner read) {
        
        
        System.out.println("\nVocê deseja acessar qual atividade: \n"
                         + "1 - Lista de Cores\n"
                         + "2 - Buscador de Números\n"
                         + "3 - Iterar por HashSet\n"
                         + "4 - Buscar Número no Set\n"
                         + "0 - Sair\n");
        
        System.out.print("Qual atividade você quer realizar: ");
        
        byte menu = read.nextByte();
        
        
        return menu; 
    }
	
}
