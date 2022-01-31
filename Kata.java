/*
переворачивает string слово наоборот
 */
public class Kata {

    public static String solution(String str) {
        // Your code here...
        System.out.println(new StringBuilder(str).reverse().toString());
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Kata x = new Kata();

        x.solution("world");
    }

}
