/**
 * Created by durodxana on 13.05.2016.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class laba3 {
    public static String read(String filename) throws FileNotFoundException {
        StringBuilder ab = new StringBuilder();

        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));

            try {
                //BufferedReader in = new BufferedReader ( new FileReader(filename));
                String a;
                while ((a = in.readLine()) != null) {
                    ab.append(a);
                    ab.append("\n");
                }
            } finally{
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);


        }
        return ab.toString();
    }
    //}
    private static String filename = "C:\\Users\\Student\\Desktop\\slova.txt";


    public static void main(String[] args){

    }
}
