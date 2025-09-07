
package proyecto;
import java.util.Scanner;

public class inventario {
    
    int idProducto = 0;
    String nombreProducto;
    String descripcion;
    double precioUnitario = 0;
   
    
    
    

    public inventario() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }



   
    
    
    public void registro(){
        Scanner cin = new Scanner(System.in);
                System.out.println("para realizar el registro de un producto ingrese los siguientes datos: ");
                    
                    System.out.println("id del producto: "); 
                    idProducto = cin.nextInt();
                    cin.nextLine();
                    System.out.println("nombre del producto: ");
                    nombreProducto = cin.nextLine();
                    System.out.println("descripcion: ");   
                    descripcion = cin.nextLine();
                    System.out.println("precio unitario: ");  
                    precioUnitario = cin.nextDouble();
                    

}
    public void verRegistro(){
        
        System.out.println("el registro de el producto es el siguiente: ");
        
        System.out.println("id del producto: "); 
        System.out.println(idProducto);
        System.out.println("nombre del producto: "); 
        System.out.println(nombreProducto);
        System.out.println("descripcion: "); 
        System.out.println(descripcion);
        System.out.println("precio unitario: ");
        System.out.println(precioUnitario);
        
    }         
     
  
    
}
