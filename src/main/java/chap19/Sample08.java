package chap19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Sample08 {
    public static void main(String[] args) throws Exception {
        URL url = new URL( 
"https://ssl.pstatic.net/melona/libs/1455/1455429/35360c0f22a7541dc120_20230802160332398.jpg");
        InputStream in = new BufferedInputStream(url.openStream());
        OutputStream out = new BufferedOutputStream(
            new FileOutputStream("네이버배너.jpg"));
        for ( int i; (i = in.read()) != -1; ) {
            out.write(i);
        }
        
        in.close();
        out.close();
    }
}
