package ua.ithillel.lessons.lesson10;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        System.out.println("\tMethods: add(Object element), size(), isEmpty()");
        for (int i=0; i<10; i++){
            myLinkedList.add(String.format("element_%s", i));
        }
        System.out.println(myLinkedList);
        System.out.println("size: " + myLinkedList.size());
        System.out.println("Is empty? " + myLinkedList.isEmpty());
        System.out.println();

        String[] strings = {
                "element_4",
                "element_14",
                "something",
                "some element"
        };
        System.out.println("\tMethod: contains(Object element)");
        System.out.printf("Is contains \"%s\"? %s\n", strings[0], myLinkedList.contains(strings[0]));
        System.out.printf("Is contains \"%s\"? %s\n", strings[1], myLinkedList.contains(strings[1]));
        System.out.println();

        System.out.println("\tMethod:  remove(Object element)");
        System.out.printf("Is remove \"%s\"? %s\n", strings[0], myLinkedList.remove(strings[0]));
        System.out.printf("Is remove \"%s\"? %s\n", strings[1], myLinkedList.remove(strings[1]));
        System.out.println(myLinkedList);
        System.out.println("size: " + myLinkedList.size());
        System.out.println();

        System.out.println("\tMethod toArray()");
        Object[] objects =  myLinkedList.toArray();
        for (Object obj: objects){
            System.out.print(obj + ", ");
        }
        System.out.println("\n");

        System.out.println("\tMethod: add(int index, Object element)");
        int indexOut = myLinkedList.size()+10;
        myLinkedList.add(myLinkedList.size()/3, strings[2]);
        myLinkedList.add(indexOut, strings[2]);
        myLinkedList.add(-100, strings[2]);
        System.out.println(myLinkedList);
        System.out.println("size: " + myLinkedList.size());
        System.out.println();

        System.out.println("\tMethod: remove(int index)");
        System.out.printf("Removed element at index %s: %s\n", 5, myLinkedList.remove(5));
        System.out.printf("Removed element at index %s: %s\n", indexOut, myLinkedList.remove(indexOut));
        System.out.println(myLinkedList);
        System.out.println("size: " + myLinkedList.size());
        System.out.println();

        System.out.println("\tMethods: get(int index), set(int index, Object element)");
        int index2 = myLinkedList.size()*2/3;
        System.out.printf("Set \"%s\" at index %s: %s\n", strings[3], index2, myLinkedList.set(index2, strings[3]));
        System.out.printf("Set \"%s\" at index %s: %s\n", strings[3], indexOut, myLinkedList.set(indexOut, strings[3]));
        System.out.printf("Get element at index %s: %s\n", index2, myLinkedList.get(index2));
        System.out.printf("Get element at index %s: %s\n", indexOut, myLinkedList.get(indexOut));
        System.out.println(myLinkedList);
        System.out.println("size: " + myLinkedList.size());
        System.out.println();

        System.out.println("\tMethod: clear()");
        myLinkedList.clear();
        System.out.println(myLinkedList);
        System.out.println("size: " + myLinkedList.size());
        System.out.println("Is empty? " + myLinkedList.isEmpty());
        System.out.println();
    }
}
