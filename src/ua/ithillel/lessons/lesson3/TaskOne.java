package ua.ithillel.lessons.lesson3;

public class TaskOne {
    public static void main(String[] args) {
        String text = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String text_replace = text.replace("Z", " ");
        String[] text_split = text_replace.split(" ");
        String[] text_reverse = new String[text_split.length];
        String text_result = "";
        for(int i=0; i<text_split.length; i++){
            text_reverse[i] = new StringBuilder(text_split[i]).reverse().toString();
            text_result += text_reverse[i];
            if(i<text_split.length-1){
                text_result += " ";
            }
        }
        System.out.println(text_result);
    }
}
