//stack data structures 
// LIFO based algorithm where LIFO stands for Last-In-First-Out 
//stores objects into a sort of "vertical tower" 

//while using stack, we can use these methods : 
/**1) push() - adds an element at the top of the stack
 syntax : public  push(item) {
    add Elements(item);

    return item;
 }
 */

import java.util.Stack;

public class StackDS {
    public static void main(String arg[]) {

        Stack<String> stack = new Stack<String>();

        // System.out.println(stack.empty());

        stack.push("valorant");
        stack.push("Minecraft");
        stack.push("Modern warfare");
        stack.push("forza horizon");
        stack.push("Read Dead Redemption2");

        String mygame = stack.pop();
        /*
         * stack.pop(); // remove r2r2
         * stack.pop(); // remove forza horizon
         * stack.pop(); // remove modern warfare
         * stack.pop(); // remove minecraft
         * stack.pop(); // remove valorant
         */

        // if ever want to look what top most variable in stack is we use peek method

        // if you need to search variable within the stack use search method
        // it is also possible to run out of heap space memory if we run it for 1billion
        // times
        for (int i = 0; i <= 5; i++) {
            stack.push("Hellfire");
        }
        System.out.println(stack.peek());
        System.out.println(stack.search("Minecraft"));
        // if we search an item not available in stack, it returns -1
        System.out.println(stack);
        System.out.println(mygame);
    }
}