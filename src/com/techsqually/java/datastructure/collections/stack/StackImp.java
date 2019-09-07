package com.techsqually.java.datastructure.collections.stack;

import java.util.stream.IntStream;

public class StackImp {

 public static int[] stack = new int[10];
  public static int tos ;

      StackImp(){
          tos = -1;
      }

    public static void main(String[] args) {

        //Pusting Element into a Stack
        IntStream.range(1,21).forEach(i -> push(i));

        //Pop added Elements from Stack
        for (int i = 0 ; i < stack.length-10; i++){

            System.out.println(pop());
        }


    }


    public static void push(int item){
        if (tos ==  stack.length-1){
            int[] backUpStack = new int[stack.length + 10];
            System.arraycopy(stack,0,backUpStack,0,stack.length);
            stack = backUpStack;
            stack[++tos] = item;
        }else{
            stack[++tos] = item;
        }
    }

    public static int pop(){

          if (tos < 0){
              System.out.println("Stack underflow.");
              return 0;
          }else{
              return stack[tos--];
          }
    }

}
