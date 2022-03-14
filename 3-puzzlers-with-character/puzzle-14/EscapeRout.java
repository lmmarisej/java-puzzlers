public class EscapeRout {
  public static void main(String[] args) {
    // \u0022 is the Unicode escape for double-quote (")
//    System.out.println("a".length() + "b".length());
    System.out.println("a\u0022.length() + \u0022b".length());    // unicode转义字符用于插入用源文件不能表示的字符
  }
}
