package task6;

import core.Node;

public class DebugMe {
    /**
     * Assume the data instance variable of the Node class holds the balance of a bank account
     * @param startAccounts
     * @return the number of bank accounts that are in debit (negative balance)
     */
    public static int countDebits(Node startAccounts) {
        int countNegativeBalance = 0;
        while(startAccounts != null) {
            if(startAccounts.data < 0) {
                countNegativeBalance++;
                startAccounts = startAccounts.next;
            }
        }
        return countNegativeBalance;
    }

    public static void main(String[] args) {
        Node acc5 = new Node(-10, null);
        Node acc4 = new Node(-70, acc5);
        Node acc3 = new Node(0, acc4);
        Node acc2 = new Node(20, acc3);
        Node acc1 = new Node(-90, acc2);
        
        System.out.println(countDebits(acc1));                //should be 3
        System.out.println(countDebits(acc2));                //should be 2
        System.out.println(countDebits(acc3));                //should be 2
        System.out.println(countDebits(acc4));                //should be 2
        System.out.println(countDebits(acc5));                //should be 1
        System.out.println(countDebits(null));  //should be 0
    }
}
