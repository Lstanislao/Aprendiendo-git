/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author LStanislao
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stack myStack = new Stack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        myStack.print();

        Stack myCopy = new Stack();

        myCopy = myStack.reverse(myStack, myCopy);

        myCopy.print();

    }

}
