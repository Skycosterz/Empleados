
package dpo1_ac_lumg;

import java.util.Scanner;


public class Docente extends Personal {
    
    Scanner teclado= new Scanner(System.in);
    //Atributos
    
    protected double Sueldo_base;
    protected double Beca;
    
    
   
    //Metodos
    
      @Override
      public void muestraDatos(){
           Scanner teclado = new Scanner(System.in);
        
        System.out.println("Tu numero de empleado es: ");
        No_empleado = teclado.nextInt();
        
        System.out.println("Tu apellido paterno es: ");
        Apellido_paterno= teclado.next();
        
        System.out.println("Tu apellido materno es: ");
             Apellido_materno= teclado.next();
           
           System.out.println("Tu nombre es: ");
         nombre = teclado.next();
           
        System.out.println("Tu fecha de Nacimiento es(sin espacios) ");
         Fecha_Nacimiento = teclado.nextInt();
         
         System.out.println("Tu fecha de ingreso es:(sin espacios) ");
         Fecha_ingreso = teclado.nextInt();
        
          System.out.println("Tu sueldo base es: ");
        Sueldo_base = teclado.nextDouble();
          
          System.out.println("Tu beca es de: ");
       Beca = teclado.nextDouble();
       
       
          System.out.println(" Tus datos son: ");
          System.out.println("tu numero "+No_empleado);
          System.out.println("tu Apellido son "+Apellido_paterno+Apellido_materno);
          System.out.println("su nombre es "+nombre);
          System.out.println("su fecha de nacimiento es "+Fecha_Nacimiento);
          System.out.println("su fecha de ingreso es "+Fecha_ingreso);
          System.out.println("Su sueldo base es"+Sueldo_base);
          System.out.println("su Beca es de "+Beca);
        
      }
    
    
    
    @Override
     public void calcularImpuestos(){
        
       double montocalcular = Sueldo_base+Beca;
      double porcentaje = montocalcular*15/100;
       
         System.out.println("El porcentaje es "+porcentaje);
         
       
    }
     
     
     @Override
     public void calcularPagoneto(){
         double montocalcular = Sueldo_base+Beca;
       double porcentaje = montocalcular*15/100;
       double pagoneto=montocalcular-porcentaje;
         System.out.println("el pago neto es  "+ pagoneto);
         
     }
    
}
