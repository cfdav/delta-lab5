import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        //String for the input from user in hexadecimal
        String hex = s.next();
        //The last index number of the hexadecimal input by the user
        int hexLength = hex.length() - 1;

        //Initialize the decimalValue converted from hexadecimal
        long decimalValue = 0;

        //Loop counter initialized
        int i = 0;

        //for counting the numbers left to right
        int hexSpot = 0;

        //get rid of 0x
        if (Integer.valueOf(hex.charAt(0)) == '0' && Integer.valueOf(hex.charAt(1)) == 'x'){
            hexSpot += 2;
            hexLength -= 2;
    }

        //Create a while loop to convert each char to decimal base
        while (i <= hexLength) {
            int val;
            if (hex.charAt(hexSpot) >= 65 && hex.charAt(hexSpot) <= 70) {
                val = Integer.valueOf(hex.charAt(hexSpot) - 55);
                decimalValue += val * (long) Math.pow(16, hexLength);
            }else if (hex.charAt(hexSpot) >= 97 && hex.charAt(hexSpot) <= 102) {
                val = Integer.valueOf(hex.charAt(hexSpot) - 87);
                decimalValue += val * (long) Math.pow(16,hexLength);
            } else {
                val = Integer.valueOf(hex.charAt(hexSpot)-'0');
                decimalValue += val * (long) Math.pow(16,hexLength);
            }
            hexSpot ++;
            hexLength --;
        }
        System.out.println("Your number is " + decimalValue + " in decimal");

    }
}
