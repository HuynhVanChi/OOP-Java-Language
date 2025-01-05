package HOMEWORK.chuong_3.Bai5;

public class TestString {
    public static void main(String[] args) {
        
        String text = new String("I'm studying ItB69IU.");

        System.out.println("Text: " + text);
        System.out.println("text.lenght(): " + text.length());
        System.out.println("text.charAt(5): " + text.charAt(5));

        System.out.println( "text.substring(5,8): "+ text.substring(5,8));
        System.out.println("text.indexOf(\"in\"): " + text.indexOf("in"));

        String newText = text + "How about you?";
        newText = newText.toUpperCase();
        System.out.println("newText: " + newText);
        if(text.equals(newText)) 
        {
            System.out.println("text and newText are equal.");
        } 
        else
        { 
            System.out.println("text and newText are not equal.");
        }
    }
}
