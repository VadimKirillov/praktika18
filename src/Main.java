import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //System.out.println(2/0); бан
        System.out.println(2.0/0);
        System.out.println();

        //Exception();

    }


    public static void Exception() {

        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter int:");
        String intString = myScanner.next();

        try{
            int a = Integer.parseInt(intString);
            System.out.println( 2/a );
        }
        catch (ArithmeticException exc){
            System.out.println( exc.getClass() + exc.getMessage() );
        }
        catch (NumberFormatException e){
            System.out.println( e.getClass() + e.getMessage() );
        }
    }
}