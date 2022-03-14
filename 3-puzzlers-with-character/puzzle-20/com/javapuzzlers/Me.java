package com.javapuzzlers;

public class Me {
   public static void main(String[] args) {
      System.out.println(
         Me.class.getName().replaceAll(".", "/") + ".class");     //  replaceAll接收正则表达式作为第一个参数；转义"\\."
   }
}
