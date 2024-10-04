package task7;

import core.Node;

public class ThingsToDo {
    /**
     * Assume that the data instance variable in the Node class represents the marks of a student in a unit
     * @param startMeritList
     * @return the number of students in the list starting at the passed Node
     */
    public static int countStudents(Node startMeritList) {
        return 0; //TODO
    }

    /**
     * Assume that the data instance variable in the Node class represents the marks of a student in a unit,
     * and further that the passing mark is 50
     * @param startMeritList
     * @return the number of students in the list starting at the passed Node who have passed
     */
    public static int countPasses(Node startMeritList) {
        return 0; //TODO
    }

    /**
     * Assume that the data instance variable in the Node class represents the marks of a student in a unit
     * @param startMeritList
     * @return the average marks of students in the list starting at the passed Node
     */
    public static double average(Node startMeritList) {
        return 0; //TODO
    }

    /**
     * Assume that the data instance variable in the Node class represents outcomes of a dice roll
     * @param startRolls
     * @return true if there are two consecutive 6s rolled in the sequence starting at startRolls
     * 
     * HINT: Because you are checking adjacent Nodes, you'll need to ensure that 
     * - the current node is not null, AND,
     * - the next node is not null
     */
    public static boolean twoSixesInARow(Node startRolls) {
        return false; //TODO
    }

    /**
     * Assume that the data instance variable in the Node class represents outcomes of a dice roll.
     * 
     * @param startRolls1
     * @param startRolls2
     * @return true if there are two sequences of dice rolls are identical (same number of rolls in the same order)
     */
    public static boolean identical(Node startRolls1, Node startRolls2) {
        return false; //TODO
    }
}
