
package app;
/*
* PRUEBA TÉCNICA
* PROYECTO 2: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* Probar el funcionamiento de la clase FACTURA
*
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 13 de marzo 2022
*/

import java.util.Scanner; //Libreria para poder leer datos del teclado

public class PruebaFactura {

    public static void main(String[] args) {
              
        Scanner sc = new Scanner(System.in); //Variable que permite la lectura de teclado
        
        
        System.out.println("Tienda de Suministros Informaticos");
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.print("Clave del articulo: ");
        String numero=sc.nextLine();
        System.out.print("Descripcion: ");
        String descripcion=sc.nextLine();
        System.out.print("Cantidad de piezas: ");
        int cantidad=sc.nextInt();
        System.out.print("Precio: ");
        double precio=sc.nextDouble();
        
        // Crear objeto tipo factura
        Factura factura=new Factura(numero,descripcion,cantidad,precio);
        
        //Calcular el monto de la factura
        System.out.println("TOTAL A PAGAR: $"+ factura.getTotalFactura());
        
        
      
        
    }//Cierra void main
    
}//Cierra class PruebaFactura
