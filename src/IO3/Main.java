package IO3;

import java.io.*;
import java.nio.charset.Charset;

public class Main {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset));

        String sum = "";
        int s = 0;
        char p =0;

       while ((s = reader.read()) != -1) {
           p = (char)s;
           sum = sum + p;
       }
        reader.close();
        return sum;
    }

}
