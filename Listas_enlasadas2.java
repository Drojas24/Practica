/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_enlasadas2;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Listas_enlasadas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      lista list = new lista();
     int opcion = 0, elemen;
     do
     {
      
       opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
                 "1. Agregar un elemento al inicio de la lista \n"
               + "2. Agregar un elemento al final de la lista \n"
               + "3. Eliminar al inicio de la lista\n"
               + "4. Eliminar al Final de la lista\n"  
               + "5. Indicar dato a Eliminar\n"
               + "6. Mostrar los datos de la lista\n"         
               + "7. Salir", " Menu de Opciones",3));
       
       switch (opcion){
        
           case 1:
                elemen = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento:",
                "Insertado al inicio",3 ));
                // Agregando al nodo
                list.agregarAlinicio(elemen);
           break;
           case 2:
                elemen = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento:",
                "Insertado al final",3 ));
                // Agregando al nodo
                list.agregarAlFinal(elemen);
           break;
           case 3:
               list.EliminarInicio();
           break;
           case 4:
               list.EliminarFin();
           break;
           case 5:
               elemen = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Elemento: ",
                "Eliminar Valor",3 ));
               list.EliminarValor(elemen);
           break;
            case 6:
               list.mostrarlista();
            break;           
           case 7:
               JOptionPane.showMessageDialog(null, "Programa Finalizado");
            break;
           default:
               JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
          
       }
       
    } while (opcion != 7);
    
    
    }   
}
