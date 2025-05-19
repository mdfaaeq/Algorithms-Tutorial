/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.learn.algorithm;
import java.util.Stack;

/**
 *
 * @author faaeq
 */
public class StackLearn {

    public static void main(String[] args) {
        Stack <String> stack = new Stack<String>();
        stack.push("Faaeq");
        stack.push("Hatim");
        
        // Finding the last in the stack 
        System.out.println(stack.peek());
        
        // Searching whether the value is in the stack
        System.out.println(stack.search("Hatim"));
        
        
        // Removing uitems from the stack
        System.out.println(stack);
    }
}
