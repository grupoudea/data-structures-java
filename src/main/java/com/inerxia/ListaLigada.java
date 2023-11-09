package com.inerxia;

import java.util.LinkedList;

public class ListaLigada {

    private Nodo raiz;
    private Nodo ultimo;

    private int numeroElementos;

    public ListaLigada(){
        this.numeroElementos = 0;
        this.raiz = null;
        this.ultimo = null;
    }

    public void insertar(int elemento){
        Nodo nodo = new Nodo(elemento);

        // esto es para el primer nodo
        if(raiz==null) {
            raiz = nodo;
            ultimo = nodo;
        } else {
            //raiz.setLiga(nodo);
            ultimo.setLiga(nodo);
            ultimo = nodo;

        }
        numeroElementos++;
    } //acabé aqui


    public void remover(int elemento) {

        if(raiz == null){
            System.out.println("Lista vacia");
        } else {
            //valido si quiero borrar el nodo primero
            if (raiz.getDato() == elemento) {
                raiz = raiz.getLiga();
                numeroElementos--;
            } else{
                // cuando no quiero eliminar el primero, sino cualquier otro.
                Nodo actual = raiz, anterior = raiz;

                while (actual!= null) { // elemento 5

                    if(actual.getDato() == elemento){
                        // borramos o desligamos
                        anterior.setLiga(actual.getLiga());
                        actual = null;
                        if(anterior.getLiga()==null){
                            ultimo = anterior;
                        }
                        numeroElementos--;
                    } else {
                        anterior = actual;
                        actual = actual.getLiga();
                    }

                }
            }
        }
    }


    public void recorrer(){
        Nodo actual = raiz;
        System.out.println("DATOS DE LA LISTA");
        while (actual != null){
            System.out.print(actual.getDato() + " | ");

            actual = actual.getLiga();

        }
    }

    public int buscar(int elemento) {

        int elementoEncontrado = 0;
        boolean encontrado = false;

        if (raiz.getDato() == elemento) {
            elementoEncontrado = elemento;
        } else {
            Nodo actual = raiz;
            while (actual != null) {
                if (actual.getDato() == elemento) {
                   elementoEncontrado = elemento;
                    encontrado = true;
                    break;
                } else {
                    actual = actual.getLiga();
                }
            }
            if (encontrado == false){
                System.out.println("Elemento no encontrado");
            }
        }

        return elementoEncontrado;
    }



}
