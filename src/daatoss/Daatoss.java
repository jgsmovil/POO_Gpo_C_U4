/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daatoss;

/**
 *
 * @author Juana García
 */
public class Daatoss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando objeto " info"
        Informacion info = new Informacion("Victor","Sistemas",2);
       // Encapsular 
       String NumCont = info.getNombre()+" "+info.getCarrera()+" "+info.getSemestre()+"";
        System.out.println("Datos del l¿alumno:  "+NumCont);
    }
    
}
