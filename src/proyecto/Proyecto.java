
package proyecto;
import java.util.Scanner;
import java.util.ArrayList;
public class Proyecto {
    
   
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<inventario> listaProducto = new ArrayList<>();
        ArrayList<rutas> listaRutas = new ArrayList<>();
        ArrayList<pedido> listaPedidos = new ArrayList<>();
        
        int a =0;
        int b =0;
        
        do{
        System.out.println("--programa de sistemas de entregas inteligentes--");
        System.out.println("seleccione un numero segun la operacion a la que desee acceder para leer o modificar:");
        System.out.println(" 1-registro de productos y revision de inventario, 2-asignacion y detalles de rutas, 3-,registrar pedidos, 4- simular entrega, 5-salir del programa");
        a = cin.nextInt();
        
        
        switch(a){
            case 1:
                do{
                System.out.println("digite 1- si quiere registrar un nuevo producto, 2- si quiere ver el inventario de los productos, 3- si quiere salir de esta seccion");
                b = cin.nextInt();
                switch(b){
                    
                    case 1:
                        inventario p1 = new inventario();
                        p1.registro();
                        listaProducto.add(p1);

                    break;
                    case 2:
                        if(listaProducto.isEmpty()){
                        System.out.println("el inventario esta vacio");
                        }else{
                        for (inventario producto : listaProducto){
                        producto.verRegistro();
                            }
                        }
                    break;
                    case 3:
                        b = 0 ;
                        break;
                    default:
                        System.out.println("digite segun lo indicado: ");
                        break;
                }
                }while(b !=0 );
                break;
            case 2:
                do{
                    System.out.println("digite 1 si quiere registrar una nueva ruta, 2 si quiere ver los datalles de las rutas guardadas, 3 para salir de la seccion ");
                    b = cin.nextInt();
                    
                    switch(b){
                        case 1:
                            rutas r1 = new rutas();
                            r1.registroRutas();
                            listaRutas.add(r1);
                            break;
                        case 2:
                            if(listaRutas.isEmpty()) {
                                System.out.println("la lista de rutas esta vacia");
                            }else{
                                for(rutas ruta : listaRutas){
                                    ruta.verRegistro();
                                }
                            }
                            break;
                        case 3 :
                            b =0;
                            break;
                        default:
                        System.out.println("digite segun lo indicado: ");
                        break;
                            }
                }while(b !=0);
                break;
            
            case 3:
                do{
                    System.out.println("digite 1 si quiere registrar un nuevo pedido, 2 si quiere ver los detalles de los pedidos actuales, 3 si quiere salir de la seccion");
                    b =cin.nextInt();
                    switch(b){
                        case 1:
                         
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            b = 0;
                            break;
                        default:
                        System.out.println("digite segun lo indicado: ");
                        break;
                    
                    
                    }
                
                
                }while( b != 0);
                break;
            
            case 4:
                
                break;
             
            case 5:
                a = 0;
                break;
        
            default:
                System.out.println("digite segun lo indicado ");
                break;
        }
        }while(a != 0);       
    }
    
}
