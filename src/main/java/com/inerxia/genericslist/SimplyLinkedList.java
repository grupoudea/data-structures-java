package com.inerxia.genericslist;

public class SimplyLinkedList<T> implements MyLinkedList<T> {

    private int size;
    private Node<T> root;
    private Node<T> last;

    public SimplyLinkedList(){
        this.size = 0;
        this.root = null;
        this.last = null;
    }

    @Override
    public void add(T item) {
        Node node = new Node(item);

        // esto es para el primer nodo
        if(root==null) {
            root = node;
            last = node;
        } else {
            last.setLink(node);
            last = node;

        }
        size++;
    }

    @Override
    public void remove(T item) {
        // TODO hay que hacer la implementación
    }

    @Override
    public T get(T item) {
        // TODO hay que hacer la implementación

        return null;
    }


    // está clase, es una clase anidada
    // private significa que no puede ser usada en ningun otro lugar, solo es accedida por la clase LinkedList de este mismo archivo
    // static final = no necesitamos una instancia para acceder a la clase y no podemos heredar de esta clase.
    private static final class Node<T> { // La T es para decir que el atributo data es de cualquier tipo, pero debes decirle el tipo.

        private T data;
        private Node<T> link;

        public Node(){}

        public Node(T data) {
            this.data = data;
            this.link = null;
        }
        public Node(T data, Node<T> link) {
            this.data = data;
            this.link = link;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getLink() {
            return link;
        }

        public void setLink(Node<T> link) {
            this.link = link;
        }
    }


}
