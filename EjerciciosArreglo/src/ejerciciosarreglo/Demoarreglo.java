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
public class Demoarreglo {
    public static void main(String[] args){
        int [] valores=new int[5];
        valores[0]=100;
        valores[1]=200;
        valores[3]=400;
        valores[2]=300;
        valores[4]=500;
        
        for(int i=0;i< valores.length;i++){
            System.out.println(valores[i]);
        }
    }
    
}
