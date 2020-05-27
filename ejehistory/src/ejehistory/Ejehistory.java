/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejehistory;

/**
 *
 * @author Mauricio
 */
public class Ejehistory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("versión 0 para history");
        System.out.println("versión 1 adición de un sout");
        imprimir();
        System.out.println("versión 4.1 tag");
        desarrollo();
    }
    static void imprimir(){
        System.out.println("versión 2 desde método");
    }
    
    static void desarrollo(){
           System.out.println("desde desarrollo");
    }
}
