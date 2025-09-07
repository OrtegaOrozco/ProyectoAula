
package proyecto;
import java.util.Scanner;

public class rutas {
    String nombreRegion;
        String centroDistribucion;
        String centroAlmacenamiento;
        double distancia = 0;
        double tiempoEntrega = 0;
     

    public rutas() {
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public String getCentroDistribucion() {
        return centroDistribucion;
    }

    public void setCentroDistribucion(String centroDistribucion) {
        this.centroDistribucion = centroDistribucion;
    }

    public String getCentroAlmacenamiento() {
        return centroAlmacenamiento;
    }

    public void setCentroAlmacenamiento(String centroAlmacenamiento) {
        this.centroAlmacenamiento = centroAlmacenamiento;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(double tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }


        
        
         public void registroRutas(){
             Scanner cin = new Scanner(System.in);
                System.out.println("para realizar el registro de una ruta ingrese los siguientes datos: ");
                    System.out.println("nombre de la region: ");
                    nombreRegion = cin.nextLine();
                    System.out.println("centro de distribucion mas cercano: "); 
                    centroDistribucion = cin.nextLine();
                    System.out.println("centro de almacenamiento mas cercano");
                    centroAlmacenamiento = cin.nextLine();
                    System.out.println("distancia aproximada (km): ");   
                    distancia = cin.nextDouble();
                    System.out.println("tiempo de entrega aproximado: ");  
                    tiempoEntrega = cin.nextDouble();
         } 

         public void verRegistro(){
             System.out.println("nombre de la region: "+nombreRegion);
             System.out.println("centro de distribucion mas cercano: "+centroDistribucion ); 
             System.out.println("centro de almacenamiento mas cercano: "+centroAlmacenamiento);
             System.out.println("distancia aproximada (km): "+ distancia); 
             System.out.println("tiempo de entrega aproximado: "+ tiempoEntrega);  
             
         }
}

