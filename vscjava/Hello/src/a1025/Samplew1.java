package a1025;

import java.io.FileOutputStream;
import java.io.IOException;

public class Samplew1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/temp/out.txt");
        output.close();
    }
}
