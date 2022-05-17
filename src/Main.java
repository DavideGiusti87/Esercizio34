/*
Regex 03
Exercise: Regex 3

You have a string with the following value: are you able to climb, are you able to swim or are you able to fly?
with a regular expression, change into _XYZ every occurrence of are that has a space before
print the result
 */
public class Main {
    public static void main(String[] args) {
        String string = "are you able to climb, are you able to swim or are you able to fly?";
        System.out.println(string.replaceAll("\s(are)","_XYZ"));
    }
}
