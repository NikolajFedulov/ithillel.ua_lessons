package ua.ithillel.lessons.lesson10;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//  Methods implements:
//      size()
//      add(Object element)
//      isEmpty()
//      contains(Object element)
//      remove(Object element)
//      clear()
//      toArray()
//      add(int index, Object element)
//      remove(int index)
//      get(int index)
//      set(int index, Object element)


public class MyLinkedList<E> implements List {
    private int size = 0;
    private final Node<E> HEADER = new Node<>(null);

    public MyLinkedList(){
    }

    private static class Node<E>{
        E content;
        Node<E> next;
        Node<E> prev;
        Node(E element){
            this.content = element;
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node<E> node = HEADER.next;
        while (node != null && node != HEADER){
            stringBuilder.append(node.content);
            if (node.next != HEADER){
                stringBuilder.append(", ");
            }
            node = node.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean add(Object element) {
        Node<E> node = new Node<>((E)element);
        if (HEADER.next == null){
            HEADER.next = node;
            node.prev = HEADER;
        }
        else {
            HEADER.prev.next = node;
            node.prev = HEADER.prev;
        }
        HEADER.prev = node;
        node.next = HEADER;
        size++;
        return true;
    }

    @Override
    public boolean contains(Object element) {
        Node<E> node = HEADER.next;
        while (node!=null && node!= HEADER){
            if (element.equals(node.content)){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    //no
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[size];
        Node<E> node = HEADER.next;
        int index = 0;
        while (node!=null && node!=HEADER){
            objects[index] = node.content;
            node = node.next;
            index++;
        }
        return objects;
    }

    @Override
    public boolean remove(Object element) {
        Node<E> node = HEADER.next;
        while (node!=null && node!= HEADER){
            if (element.equals(node.content)){
                node.prev.next = node.next;
                node.next.prev = node.prev;
                node.next = null;
                node.prev = null;
                node.content = null;
                size--;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    //no
    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    //no
    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        if (HEADER.next!=null && HEADER.prev!=null){
            HEADER.prev.next = null;
            HEADER.next.prev = null;
        }
        HEADER.prev = null;
        HEADER.next = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        Node<E> node = HEADER.next;
        int i = 0;
        if (0 <= index && index < size) {
            while (node!=null && node!=HEADER){
                if (i == index) {
                    return node.content;
                }
                node = node.next;
                i++;
            }
        }
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        Node<E> node = HEADER.next;
        int i = 0;
        if (0 <= index && index < size) {
            while (node!=null && node!=HEADER){
                if (i == index) {
                    return node.content = (E)element;
                }
                node = node.next;
                i++;
            }
        }
        return null;
    }

    @Override
    public void add(int index, Object element) {
        Node<E> node = HEADER.next;
        Node<E> newNode = new Node<E>((E)element);
        int i = 0;
        if (0<=index && index<size){
            while (node!=null && node!=HEADER){
                if (i == index){
                    newNode.next = node;
                    newNode.prev = node.prev;
                    node.prev.next = newNode;
                    node.prev = newNode;
                    size++;
                    break;
                }
                node = node.next;
                i++;
            }
        }
    }

    @Override
    public Object remove(int index) {
        Node<E> node = HEADER.next;
        int i = 0;
        if (0<=index && index<size){
            while (node!=null && node!=HEADER){
                if (i == index){
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                    node.next = null;
                    node.prev = null;
                    size--;
                    return node.content;
                }
                node = node.next;
                i++;
            }
        }
        return null;

    }

    //no
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    //no
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    //no
    @Override
    public ListIterator listIterator() {
        return null;
    }

    //no
    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    //no
    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    //no
    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    //no
    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    //no
    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    //no
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
