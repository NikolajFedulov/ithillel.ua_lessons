package ua.ithillel.lessons.lesson09;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//  MyStringArrayList implemented methods:
//  size(), isEmpty(), contains(Object obj), add(Object obj), remove(Object obj),
//  clear(), get(int index), set(int index, Object element), add(int index, Object element),
//  remove(int index), indexOf(Object obj)

public class MyStringArrayList<E> implements List {

    private static final int DEFAULT_CAPACITY = 12;
    private String[] data;
    private int capacity;
    private int size;

    MyStringArrayList(){
        this (DEFAULT_CAPACITY);
    }

    MyStringArrayList(int capacity){
        this.capacity = capacity;
        data = new String[this.capacity];
        size = 0;
    }

    private void incrementOfArray(){
        String[] copyOfData = new String[data.length+capacity];
        for (int i = 0; i<data.length; i++){
            copyOfData[i] = data[i];
        }
        data = copyOfData;
    }

    private void arrayShiftToLeft(int index){
        if (index>=0){
            for (int i = index; i < data.length; i++){
                if (i!=data.length-1){
                    data[i] = data[i+1];
                }
                else {
                    data[i] = null;
                }
            }
        }
    }

    private void arrayShiftToRight(int index){
        if (index>=0 && size<data.length){
            for(int i=data.length-1; i>index; i--){
                data[i] = data[i-1];
            }
        }
    }

    public void toConsole(){
        System.out.print("[");
        int quantityElements = 5;
        for ( int i=0; i<size; i++){
            System.out.print(data[i]);
            if (i!=size-1){
                System.out.print(",\t");
            }
            if( (i+1)%quantityElements==0 && i!=size-1){
                System.out.println();
            }
        }
        System.out.println("]");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object obj) {
        if (obj==null){
            return false;
        }
        return indexOf(obj)>0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object obj){
        if (obj == null) {
            return false;
        }
        if (size == data.length){
            incrementOfArray();
        }
        data[size] = (String) obj;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object obj) {
        int index = indexOf(obj);
        if (index>=0){
            arrayShiftToLeft(index);
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        data = new String[capacity];
        size = 0;
    }

    @Override
    public Object get(int index) {
        if (0<=index && index<size){
            return data[index];
        }
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        if (0<=index && index<size && element!=null){
            return data[index] = (String) element;
        }
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if (0<=index && index<size && element!=null){
            if (size == data.length) {
                incrementOfArray();
            }
            arrayShiftToRight(index);
            set(index, element);
            size++;
        }
    }

    @Override
    public Object remove(int index) {
        if (0<=index && index<size){
            String str = (String) get(index);
            arrayShiftToLeft(index);
            size--;
            return str;
        }
        return null;
    }

    @Override
    public int indexOf(Object obj) {
        if (obj==null) {
            return -1;
        }
        for(int i=0; i<size; i++){
            if (data[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
