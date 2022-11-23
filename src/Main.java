import java.util.Optional;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Properties props = new Properties();
        props.setProperty("a", "5");
        props.setProperty("b", "true");
        props.setProperty("c", "-3");


        System.out.println( readDuration(props, "a"));
        System.out.println( readDuration(props, "b"));
        System.out.println( readDuration(props, "c"));

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

    private static int readDuration(Properties props, String name) {
        String val = props.getProperty(name);
        if(val != null) {
            try {
                int i = Integer.parseInt(val);
                if(i>0) {
                    return  i;
                }
            } catch (NumberFormatException ex){

            }
        }
        return 0;
    }

    private static int readDurationUsingOptional(Properties props, String name) {
        String val = props.getProperty(name);
        if(val != null) {
            try {
                int i = Integer.parseInt(val);
                if(i>0) {
                    return  i;
                }
            } catch (NumberFormatException ex){

            }
        }
        return 0;
    }
}