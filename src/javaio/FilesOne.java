package javaio;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FilesOne {

    public static void readFileBytes(String path) throws IOException {
        byte[] arr = new byte[50];
        int content;
        InputStream is=new FileInputStream(path);
        System.out.println("Available bytes : "+is.available());
        //1.
        //is.read(arr);
        //System.out.println(new String(arr));

        //2.
        while(is.read(arr)!=-1){
            System.out.println(new String(arr));
        }
        //3.
        while ((content=is.read())!=-1){
            System.out.print((char)content);
        }
        is.close();
    }

    public static void readFileChars(String path) throws IOException {
        char[] arr = new char[50];
        int content;
        InputStreamReader is=new FileReader(path);
        //1.
        is.read(arr);
        System.out.println(arr);

        //2.
//        while(is.read(arr)!=-1){
//            System.out.println(new String(arr));
//        }

        //3.
        //while ((content=is.read())!=-1){
        //    System.out.print((char) content);
        //}
        is.close();
    }

    public static void writeFileBytes(String path) throws IOException{
        String data = "dfa efsdv gsdvZv sdvbfsv sdsvsc zxcav sdvzxvsv";
        OutputStream os = new FileOutputStream(path);
        os.write(data.getBytes(StandardCharsets.UTF_8));
        System.out.println("Data is written to the file");
        os.close();
    }

    public static void main(String[] args) throws IOException {
        readFileChars("src/javaio/input.txt");
        //readFileBytes("src/javaio/input.txt");
        //writeFileBytes("src/javaio/output.txt");
    }


}
