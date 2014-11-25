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
public class Ejemplo {
    public static void main(String[] args){
    ArrayList<DemosEjemplo> nombres=new ArrayList<DemosEjemplo>();
    DemosEjemplo nomm= new DemosEjemplo("Pedro");
    DemosEjemplo nomm1= new DemosEjemplo("Juan");
    DemosEjemplo nomm2= new DemosEjemplo("Maria");
    DemosEjemplo nomm3= new DemosEjemplo("Luis");
    DemosEjemplo nomm4= new DemosEjemplo("David");
    nombres.add(nomm);
    nombres.add(nomm1);
    nombres.add(nomm2);
    nombres.add(nomm3);
    nombres.add(nomm4);
    
for(DemosEjemplo pa:nombres){
            System.out.println(pa.getNom());
        }        
    
    }
    
}
