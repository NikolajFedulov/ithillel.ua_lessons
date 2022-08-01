package ua.ithillel.lessons.lesson09;

public class Main {
    private static final int CAPACITY = 5;
    private static final MyStringArrayList<String> myStringArrayList = new MyStringArrayList(CAPACITY);

    private static void generalInfo(){
        myStringArrayList.toConsole();
        System.out.println("Size = " + myStringArrayList.size());
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Add to ArrayList:");
        for (int i=0; i<10; i++){
            myStringArrayList.add(String.format("number %s", i));
        }
        myStringArrayList.add(null);
        generalInfo();

        System.out.println("After remove the elements:");
        String[] elements = {"number 6", "someThing", null};
        for (String str: elements){
            System.out.println(String.format("Remove \"%s\" is %s", str, myStringArrayList.remove(str)));
        }
        generalInfo();

        int[] indices = {-1, myStringArrayList.size()/2, myStringArrayList.size()+1};
        for (int i: indices){
            System.out.println(String.format("Remove by index #%s. Removed - \"%s\"", i, myStringArrayList.remove(i)));
        }
        generalInfo();

        System.out.println("Adding by index:");
        int[] indices2 = {-1, 0, myStringArrayList.size()/2, myStringArrayList.size()+1, myStringArrayList.size()+4};
        for (int i=0; i<indices2.length; i++){
            myStringArrayList.add(indices2[i], String.format("number %s", i+11));
        }
        myStringArrayList.add(0, null);
        generalInfo();

        System.out.println("Set and Get elements:");
        String element = "eleMENt";
        int[] indices3 = {-1, 0, myStringArrayList.size()/2, myStringArrayList.size()-1, myStringArrayList.size()};
        for (int i: indices3){
            System.out.print(String.format("Set \"%s\" at index #%s. ", element, i));
            System.out.println("Result: " + myStringArrayList.set(i, element));
            System.out.println(String.format("Get element at index #%s: %s", i, myStringArrayList.get(i)));
        }
        System.out.print(String.format("Set \"%s\" at index #%s. ", null, 0));
        System.out.println("Result: " + myStringArrayList.set(0, null));
        generalInfo();

        String[] elements2 = {
                (String) myStringArrayList.get(myStringArrayList.size()/3),
                "a table",
                null
        };
        for (String str: elements2){
            System.out.println(String.format("Index of \"%s\" = %s",str, myStringArrayList.indexOf(str)));
            System.out.println(String.format("Is ArrayList contain \"%s\": %s", str, myStringArrayList.contains(str)));
        }
        System.out.println();

        System.out.println("ArrayList is empty?: " + myStringArrayList.isEmpty());
        myStringArrayList.clear();
        System.out.println("After clear() arrayList is empty?: " + myStringArrayList.isEmpty());
        generalInfo();
    }
}
