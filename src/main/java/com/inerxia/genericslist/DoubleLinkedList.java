package com.inerxia.genericslist;

public class DoubleLinkedList<T> implements MyLinkedList<T> {

    private int size;
    private Node<T> root;
    private Node<T> last;

    /*
        Tarea: implemente los metodos add, remove, y get (buscar) para una lista doblemente enlazada con estructura generica
        Nota: yo se los explico en pseudocodigo.

     */

    @Override
    public void add(T item) {

    }

    @Override
    public void remove(T item) {

    }

    @Override
    public T get(T item) {
        return null;
    }

    private static final class Node<T> { // La T es para decir que el atributo data es de cualquier tipo, pero debes decirle el tipo.

        private T data;
        private Node<T> next; //liga siguiente
        private Node<T> prev; // liga anterior (haga el dibujo)


        public Node(){}

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        public Node(Node<T> prev, T data, Node<T> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }
}
