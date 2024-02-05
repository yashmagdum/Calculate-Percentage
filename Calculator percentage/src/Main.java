import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to percentage calculator");
        System.out.println("No of Subject");
        Scanner obj = new Scanner(System.in);
        int n =obj.nextInt();
        int marks[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Marks");
             marks[i] = obj.nextInt();
        }
        int total =0;
        for(int i=0;i<n;i++){
            total+=marks[i];
        }
        System.out.println(" total Marks is "+total);

        float per = (float) total/n;
        System.out.println("percentage is " + per);

    }
}