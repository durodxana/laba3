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


    public static void main (String [] args ) throws FileNotFoundException {
        String textFromFile = read (filename);
        System.out.println(textFromFile);
        Pattern p = Pattern.compile ("\\b[А-я]+(у|ишь|[ая]ть|[ен]т|и[тм]|[ну]т|[и]те|ся)\\b");
        Matcher m = p.matcher ( textFromFile);
        int k = 0;
        while (m.find()) {
            System.out.println(m.group());
            k++;

        }

        System.out.println("________");
        System.out.println("Кол-во глаголов:" +k);
        System.out.println();


        Pattern nar = Pattern.compile("\\b[в|из|до|на|за][А-я]+[оа]\\b");
        Matcher m_nar = nar.matcher(textFromFile);
        int k_nar = 0 ;
        while (m_nar.find())
        {
            System.out.println(m_nar.group());
            k_nar++;
        }


    }
}
