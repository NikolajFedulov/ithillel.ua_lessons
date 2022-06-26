package ua.ithillel.lessons.lesson7;

public class TheNestingDepthOfVPS {
    public static void main(String[] args) {
        //String s1 = "(1+(2*3)+((8)/4))+1";
        //String s1 = ")1+(2*3)+((8)/4)(+1";
        //String s1 = "(1+(2*3)+(8)/4))+1";
        //String s1 = "";
        //String s1 = "548+23";
        String s1 = "78-(2*(45+(2+6)+((8+2)(4-(45+9)))-78))+23";
        char charFromTestString;
        int vps = 0;
        int depth = 0;

        for(int i=0; i<s1.length(); i++){
            charFromTestString = s1.charAt(i);
            if (charFromTestString == '(') vps++;
            if (charFromTestString == ')') vps--;
            if (vps < 0) break;
            if (vps > depth) depth = vps;
        }

        if (vps != 0) System.out.printf("String %s is not valid parentheses string", s1);
        else System.out.printf("Depth of parentheses string %s is %s", s1, depth);
    }
}
