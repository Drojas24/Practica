/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_enlasadas2;

/**
 *
 * @author Andrea
 */
public class lista {
    
    protected nodo inicio, fin ; // Puntoros para saber donde esta el inicio y el fin
 
public lista (){

    inicio = null;
    fin = null ;
}

// Metodo para saber si la lista esta vacia

public boolean estaVacia (){
    
if (inicio == null)
   {
    return true; 
   }
else 
    {
    return false;
    }
}

//Metodo para insertar al final de las lista

public void agregarAlFinal(int valor){
    if (!estaVacia()){
        
        fin.siguiente = new nodo (valor);
        fin = fin.siguiente;
    }
    else {
        inicio = fin = new nodo (valor);
        
    }
    
}




// Metodo para agregar un nodo al inicio de lista

public void agregarAlinicio (int valor){
// creacion del nodo/Inicio posicio a Insertar .siguiente 
inicio = new nodo(valor, inicio);//Creacion Objeto para almacenar
if (fin == null)
{
   fin = inicio;
}

}


// Metodo para mostar la lista
public void mostrarlista(){
    
    nodo recorrer = inicio;
    System.out.println();
    if(inicio!=null){
  while (recorrer!= null) 
   {
     System.out.print("[" + recorrer.dato + "]--->");
     recorrer = recorrer.siguiente;
   }
    }else{
        System.out.println("No tiene elementos");
    }  
}

public void EliminarInicio(){
    nodo recorrer = inicio;
    inicio=recorrer.siguiente;
}

public void EliminarFin(){
    if(fin!=inicio){
    nodo recorrer = inicio;
    while(recorrer.siguiente!=fin){
      
           recorrer=recorrer.siguiente;
    
    }
     fin =recorrer;
     fin.siguiente=null;
}
}

public void EliminarValor(int Valor){
    nodo anterior = null;
    if(inicio!=fin&&inicio.dato!=Valor){
        nodo recorrer=inicio;
        while(recorrer.dato!=Valor){
            anterior=recorrer;
            recorrer=recorrer.siguiente;
            
        }
        anterior.siguiente = recorrer.siguiente;
    }else if(inicio.dato==Valor){
        EliminarInicio();
    }
}

public void consulta(int valor){
    inicio = new nodo(fin,valor,inicio);
    System.out.println(inicio.siguiente);
    System.out.println(inicio.anterior);

}
}


