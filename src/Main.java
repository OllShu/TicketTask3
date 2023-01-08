import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String myString = "Здесь будет строка для разделения пополам.";
        int midlleOfString = myString.length()/2;
        //    System.out.println(myString.length()+" "+midlleOfString);

        char[] arrayMyString = myString.toCharArray();
        //System.out.println(Arrays.toString(arrayMyString));

        char[] arrayFirstPart = new char[midlleOfString];
        for (int i = 0; i < midlleOfString; i++) {
            arrayFirstPart[i] = arrayMyString [i];
        }
        //System.out.println(Arrays.toString(arrayFirstPart));

        String firstPart = "";
        firstPart = firstPart.copyValueOf(arrayFirstPart);
        System.out.println(firstPart);

        char[] arraySecondPart = new char[midlleOfString];
        for (int i = 0; i < midlleOfString; i++) {
            arraySecondPart[i] = arrayMyString [i+midlleOfString];
        }
        //System.out.println(Arrays.toString(arraySecondPart));

        String secondPart = "";
        secondPart = secondPart.copyValueOf(arraySecondPart);
        System.out.println(secondPart);
    }
}