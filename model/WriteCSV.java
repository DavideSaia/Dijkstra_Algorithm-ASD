/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Utente
 */

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;



public class WriteCSV {

    protected static LinkedList<String> performance = new LinkedList<String>();


    //----------------------------------------------------------------

    //METHOD TO WRITE ON A CSV FILE
    
    public static void print(String fileName, String charset, LinkedList<String> lstSA) throws IOException{
        PrintWriter printWriter = new PrintWriter(
            new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream(fileName), charset)), true);

        for(int i=0; i<lstSA.size(); i++){
            printWriter.print( lstSA.get(i) + ";\n");
        }

        printWriter.close();
    }// end method print()

    //----------------------------------------------------------------

    //METHOD TO ADD THE PERFORMANCE TIME OBTAINED IN THE PERFORMANCE LIST


    public static LinkedList<String> setPerformanceList(double time, int vertex, double density){
        performance.add("Il tempo impigato per calcolare l'algoritmo è pari a =" + "\t" + time + "\t" + "secondi" + "\n" + 
                        "il numero di vertici di questo grafo è pari a =" + "\t" + vertex + "\n" +
                        "la densità è pari a =" + "\t" + density
        ); 

        return performance;
    }// end setPerformanceList()

    
}// end class
