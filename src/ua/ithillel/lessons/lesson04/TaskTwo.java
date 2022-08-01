package ua.ithillel.lessons.lesson04;

public class TaskTwo {
    public static void main(String[] args) {
        String[] word1 = {"Ch", "op ", "you", "r o", "wn w", "oo", "d and", " it", " wil", "l war", "m you tw", "ice"};
        String[] word2 = {"Chop y", "our o", "wn wo", "od a", "nd i", "t wil", "l wa", "rm you twice"};
        String[] word3 = {"Cho", "p You", "r ow", "n woo", "d and It w", "ill w", "arm y", "ou twice"};
        StringBuilder wholeLine1 = new StringBuilder();
        StringBuilder wholeLine2 = new StringBuilder();
        StringBuilder wholeLine3 = new StringBuilder();

        for(String txt: word1){
            wholeLine1.append(txt);
        }
        for(String txt: word2){
            wholeLine2.append(txt);
        }
        for(String txt: word3){
            wholeLine3.append(txt);
        }
        System.out.println();
        System.out.println(wholeLine1.toString().equals(wholeLine2.toString()));
        System.out.println(wholeLine1.toString().equals(wholeLine3.toString()));


    }
}
