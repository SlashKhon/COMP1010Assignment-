package task6;

import core.Node;

public class DebugMeToo {
    /**
     * Assume the data instance variable of the Node class holds the balance of a bank account
     * @param startAccounts
     * @param goldThreshold
     * @return the number of bank accounts that have a balance of goldThreshold or more
     */
    public static int countGoldMembers(Node startAccounts, int goldThreshold) {
        int count = 0;
        while(startAccounts != null) {
            if(startAccounts >= goldThreshold) {
                count++;
            }
            startAccounts = startAccounts.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node acc4 = new Node(10, null);
        Node acc3 = new Node(70, acc4);
        Node acc2 = new Node(20, acc3);
        Node acc1 = new Node(90, acc2);
        
        System.out.println(countGoldMembers(acc1, 10));              //should be 4
        System.out.println(countGoldMembers(acc1, 20));              //should be 3
        System.out.println(countGoldMembers(acc2, 50));              //should be 1
        System.out.println(countGoldMembers(acc2, 100));             //should be 0
        System.out.println(countGoldMembers(null, 0)); //should be 0
        
    }
}
