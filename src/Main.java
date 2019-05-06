
import java.util.Scanner;

public class Main {
    private static String  str[];
    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner in = new Scanner(System.in);
        String s = in. nextLine();
        System.out.println("You entered string ");
        try{
            System.out.println("Result ::" + Multiply1(1, s, 0));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private   static  Integer Multiply1(int result, String s , int nextIndex){
        try {
            if(result == 0 || s.isEmpty() && nextIndex == 0) return 0;
            if(nextIndex > s.length()) {
                return result;
            }
            int a = Integer.parseInt(s.substring(0, 1));
            return  Multiply1(result * a, s.substring(2), nextIndex+2);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
