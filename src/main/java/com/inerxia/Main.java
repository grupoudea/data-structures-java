package com.inerxia;
import com.inerxia.genericslist.DoubleLinkedList;
import com.inerxia.genericslist.MyLinkedList;
import com.inerxia.genericslist.SimplyLinkedList;

import java.util.LinkedList;
import java.util.Scanner;
public class Main {

    private static ListaLigada listaLigada = new ListaLigada();
    public static void main(String[] args) {


        MyLinkedList<String> listaNombres = new SimplyLinkedList<>();
        MyLinkedList<Integer> listaNumeros = new SimplyLinkedList<>();
        // Esto es una lista simple enlazada donde cada elemento es una lista simple enlazada de strings (Dibujela)
        MyLinkedList<SimplyLinkedList<String>> listaStringSimplementeEnlazada = new SimplyLinkedList<>();

        MyLinkedList<String> listaStringDoblementeEnlazada = new DoubleLinkedList<>();
        //Esto es una lista doblemente enladaza donde cada elemento es una listaLigada de strings (Dibujela)
        MyLinkedList<SimplyLinkedList<String>> listaDeListas = new DoubleLinkedList<>();

        listaNombres.add("Juan");
        listaNombres.add("Esteban");
        listaNombres.add("Kelly");
        listaNombres.add("Romeo");

        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(45);
        listaNumeros.add(1);




        Scanner scanner = new Scanner(System.in);
        int elementoEncontrado = 0;
        boolean encontrado = false;
        //crear una lista ligada con 5 de del 1 en adelante.


        boolean terminar = true;
        int elemento = 0;
        System.out.println("Elija una opcion: ");
        while(terminar == true){
            int opcion = 0;
            System.out.println("1. Insertar dato en la lista");
            System.out.println("2. terminar lista");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("ingrese el dato de la lista");
                    elemento = scanner.nextInt();
                    listaLigada.insertar(elemento);
                    terminar = true;
                    break;
                case 2:
                    terminar = false;
                    break;
            }
        }
        System.out.println("=============================================================");
        listaLigada.recorrer();







        /*for (int i = 0; i < 5; i++) {
            listaLigada.insertar(i+1);
        }

        listaLigada.remover(100);
        listaLigada.remover(2);

        listaLigada.recorrer();
        elementoEncontrado = listaLigada.buscar(5);

        if (elementoEncontrado != 0){
            System.out.println("Elemento " + elementoEncontrado + " encontrado");
        }

        System.out.println("final");*/

        /*
        Tarea:
        1. hacer que la variable numeroElementos incremente cuando se inserta y decremente cuando se remueve
        2. hacer un algoritmo que permita recorrer la lista ligada (piense en como hizo y entendío el remover)
        3. hacer un metodo para obtener el valor en particular (es decir, que retorne por ejemplo el valor 3 buscado en la lista) (este metodo es el de buscar o get)
        4. encontrar el menor
        5. encontrar el mayor

         */
    }

}