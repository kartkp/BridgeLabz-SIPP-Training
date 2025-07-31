package JavaStreams;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largefile.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.txt"))) {

            byte[] buffer = new byte[4096];
            int len;
            while ((len = bis.read(buffer)) > 0) {
                bos.write(buffer, 0, len);
            }
        }

        long end = System.nanoTime();
        System.out.println("Buffered copy time: " + (end - start) / 1e6 + " ms");
    }
}
