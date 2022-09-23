
package dpo1_ac_lumg;

import java.util.Scanner;


public abstract class Personal {
    
    //Atributos
   protected int No_empleado;
   protected String Apellido_paterno, Apellido_materno, nombre;
   protected  int Fecha_Nacimiento,Fecha_ingreso;
    
    
    //Metodos
    
    public abstract void muestraDatos();
       
       
         
          
         
         
        
    
    
    public abstract void calcularImpuestos();
    public abstract void calcularPagoneto();
    
   
    
}
