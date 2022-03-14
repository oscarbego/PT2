
package app;

/*
* PRUEBA TÉCNICA
* PROYECTO 2: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* CLASE Factura
* 
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 12 de marzo 2022
*/

public class Factura {

    //Variables de instancia
    private String numero;
    private String descripcion;
    
    private int cantidad;
    
    private double precio;
    
    
    //----------------------- Metodo Constructor --------------------------
    
    public Factura( String numero, String descripcion, int cantidad, double precio )
    {
        
        // Si la cantidad de articulos a llevar no es positivo, ésta
        // debera establecerse como cero
        if (cantidad<0)
            cantidad=0;

        // Si el precio de un articulo no es positivo, éste debe
        // establecerse como cero
        if (precio<0)
            precio= 0.0;
       
        
        //Asignar los valores a la factura
            this.numero=numero;
            this.descripcion=descripcion;
            this.cantidad =cantidad;
            this.precio=precio;
        
    }// cierra constructor
    
    
    
    
    // ---------------- Metodo Total articulo --------------------------
    
    public double getTotalFactura(){
        
        return getCantidad()*getPrecio();
    }
    
    
    
    // ---------------------- Metodos get´s y set´s ---------------------

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

   
    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}//cierra class Factura
