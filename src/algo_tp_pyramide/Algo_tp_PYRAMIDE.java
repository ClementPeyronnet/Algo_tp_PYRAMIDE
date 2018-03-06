/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_tp_pyramide;

import java.io.*;
import java.util.Scanner;



/**
 *
 * @author clemss
 */
public class Algo_tp_PYRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        if(sc.hasNextInt()) {
            int hauteur = sc.nextInt();
            // On creer une boucle, on réitere tant que i est inférieur
            // à la hauteur, puis on l'incrémente
            
             for (int a = 0; a < hauteur; a++) {
                for (int b = 0; b < hauteur - a; b++){
                       System.out.print(" ");   
                }
                for (int c = 0; c <= 2 * a; c++){
                    System.out.print("*");
                }
              
                System.out.println(""); 
            }
        }
        
    }
}