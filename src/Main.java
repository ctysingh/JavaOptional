import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String [] words = new String[5];
        for ( String word: words ) {
           // System.out.println(word);
            try {
                Optional<String> optStr = Optional.ofNullable(word);
            }
            catch (Exception ex) {
                System.out.println(ex.toString());
            }

        }
    }
}