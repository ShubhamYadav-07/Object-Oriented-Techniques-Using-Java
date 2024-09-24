/*1) Implement the code using main() method to calculate and print the Total and Average marks scored by a student from the input given through the command line arguments. 
Assume that four command line arguments name, marks1, marks2, marks3 will be passed to the main() method in the below class with name TotalAndAvgMarks.*/
public class TotalAndAvgMarks {
    public static void main(String args[]) {
        if (args.length != 4) {
            System.out.println("Usage: java TotalAndAvgMarks <name> <marks1> <marks2> <marks3>");
            return;
        }

        String name = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int num3 = Integer.parseInt(args[3]);

        int total = (num1 + num2 + num3);
        double average = total / 3.0; // Use double for more accurate average

        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
