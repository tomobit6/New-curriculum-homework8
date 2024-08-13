package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

  public static void main(String[] args) {
    try {
      Path path = Path.of("JavaCourse.txt");
      //writeStringはまず場所を教えてくれ→pathを渡す。その次にテキストの内容を記述。APPENDは記述を追加。
      Files.writeString(path, "Javaコース楽しすぎ！！", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("例外が発生しました。");
      try {
        Path path = Path.of("JavaCourse.txt");
        //writeStringはまず場所を教えてくれ→pathを渡す。その次にテキストの内容を記述。
        Files.writeString(path, "Javaコース以外も楽しみ！！！", StandardOpenOption.APPEND);
      } catch (IOException ex) {
        ex.printStackTrace();
        System.out.println("さらに例外が発生しました。");
      }
    }
  }
}
