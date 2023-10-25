package a1025;

import java.io.FileWriter;
import java.io.IOException;

//FileOutputStream 대신에 FileWriter를 이용하면 byte 배열 대신 문자열을 사용할 수 있어 편리하다.
public class Samplew5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:/Temp/out.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다.\r\n"; // 줄바꿈
            fw.write(data);
        }
        fw.close();

        FileWriter fw2 = new FileWriter("c:/Temp/out.txt", true);
        for (int i = 11; i < 21; i++) {
            String data = i + " 번째 줄입니다.\r\n"; // 줄바꿈
            fw2.write(data);
        }
        fw2.close();
    }
}
