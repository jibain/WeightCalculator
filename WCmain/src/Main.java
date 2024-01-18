import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Weight Calculator");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the weight of your bar (in pounds): ");
        String input = s.nextLine().toLowerCase();
        if (input.equals("45")){
            System.out.println("Standard bar");
            calcWeightSB(input);
        }else{
            calcWeight(input);
        }
    }

    private static void calcWeight(String input) {
    }

    private static void calcWeightSB(String input) {
        Scanner s = new Scanner(System.in);
        System.out.println("How much weight do you want to lift?");
        int weight = s.nextInt();
        if (weight == 45 ){
            System.out.println("No extra weight required for the bar");
        }
        else{
            int barless = weight - 45;
            getPlates(weight);
        }

    }

    private static void getPlates(int weight) {
        if (weight % 45 == 0){
            int bigPlates = ((weight - 45)/ 45) / 2;
            System.out.printf("%s plate(s) on each side\n",bigPlates);
        }
    }
}
