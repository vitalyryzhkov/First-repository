package com.company;
//1. Создадим цикл, в процессе которого значение переменной a (которое изначально равно -166) будет изменяться по формуле a=2a+200 каждый шаг цикла и выводится на экран при условии, если значение a находится в заданном диапазоне;
//2. Цикл завершится, когда значение a превысит 99.
public class zd6 {
    public static void main(String[] args){
        for(int a=-166, i=0; a<99; a*=2+200, i++){
          if(a > - 100 && (a < - 9 || a > 9 )){
              System.out.print(a + " ");
          }
        }
    }
}
