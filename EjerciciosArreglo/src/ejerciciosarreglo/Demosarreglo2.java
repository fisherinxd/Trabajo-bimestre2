/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosarreglo;

/**
 *
 * @author admin
 */
public class Demosarreglo2 {
    public static void main(String[] args){
   Persona persona1=new Persona("Alva","29");
   Persona persona2=new Persona("Jose","12");
   Persona persona3=new Persona("Pedro","12");
    
   Persona[] paralelo=new Persona[3];
   paralelo[0]=persona1;
   paralelo[1]=persona2;
   paralelo[2]=persona3;
   
   for (int i=0;i<paralelo.length;i++){
       System.out.println(paralelo[i].getEdad());
   }
        System.out.println("----------------------");
   
   for(Persona p:paralelo){
       System.out.println(p.getEdad());
   }
}
}
