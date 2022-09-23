
package dpo1_ac_lumg;

import java.util.Scanner;


public class DPO1_AC_LUMG {

 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        Docente docente = new Docente();
       Administrativo admin = new Administrativo();      
        int opcion ;
        
        //Menú para los empleados
        do{
            
            System.out.println("1.-capturar datos del docente");
            System.out.println("2.-capturar datos del administrador");
            System.out.println("3.-calcular impuestos y pago neto de docente");
            System.out.println("4.-calcular impuestos y pago neto del administrativo");
            System.out.println("5.-salir");
            opcion = teclado.nextInt();         
            switch(opcion){
                case 1:
                    System.out.println("del docente");
                     docente.muestraDatos();
                    
                     break;
                     
                case 2:
                     System.out.println("del admin");
                     admin.muestraDatos();
                     break;
                case 3:
                     docente.calcularImpuestos();  
                     docente.calcularPagoneto();
                    break;
                case 4: 
                      admin.calcularImpuestos();
                      admin.calcularPagoneto();
                    
                
            }
        }while(opcion !=5);
          
        
        
     
       
      
        
    }
    
}
