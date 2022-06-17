package IO3;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Main {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset));
        String sum = "";
        String s;
        while ((s = reader.readLine()) != null) {
            sum = sum + s;
        }
        reader.close();
        return sum;
    }

}
