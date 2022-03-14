import java.io.*;

public class Copy {
    static void copy(String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) > 0)
                out.write(buf, 0, n);
        } finally {
            if (in != null) in.close();         // 对finally中的异常都要处理，不能任其传播
            if (out != null) out.close();
        } 
    }

    public static void main(String[] args) throws IOException {
            copy("/Users/lmmarise.j/Desktop/java-puzzlers/5-exceptional-puzzlers/puzzle-41/Copy.java",
                    "/Users/lmmarise.j/Desktop/java-puzzlers/5-exceptional-puzzlers/puzzle-41/Copy1.java");
    }
}
