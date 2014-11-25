/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosarreglo;


import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DemoListas1 {
     public static void main(String[] args){
     ArrayList<Pais> paises=new ArrayList<Pais>();
     Pais mipais=new Pais("Ecuador","Quito",12312312);
     Pais tupais=new Pais("Peru","Lima",123123);
     Pais elpais=new Pais("España","Madrid",123123455);
     
     paises.add(mipais);
     paises.add(elpais);
     paises.add(tupais);
     
        for(Pais pa:paises){
            System.out.println(pa.getCapital());
        }
     
     }
    
}
