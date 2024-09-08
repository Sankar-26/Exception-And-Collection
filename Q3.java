import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        //Days Array
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //Use try/catch block to capture the exception
        try {
            //Getting input from user
            System.out.print("Enter a day position: ");
            int x = obj.nextInt();
            System.out.println(days[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Please enter between a valid range(0-6).");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
