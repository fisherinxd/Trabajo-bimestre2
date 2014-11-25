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
public class DemoPais {
    public static void main(String[] args){
    Pais nom=new Pais("Ecuador","Quito",123213);
    Pais nom1=new Pais("Argentina","BuenosAires",12341213);
    Pais nom2=new Pais("Chile","Santiago",123434343);
    Pais nom3=new Pais("Canada","Otawua",125555213);
        
   Pais[] p=new Pais[4];
   p[0]=nom;
   p[1]=nom1;
   p[2]=nom2;
   p[3]=nom3;
    
   for(Pais pa:p){
       System.out.println(pa.getNombre().toLowerCase()+"--"+pa.getCapital().toUpperCase()+"--"+pa.getPoblacion());
   }
   
   
    }
    
}
