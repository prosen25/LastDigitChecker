//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(isValid(9));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            return ((num1 % 10 == num2 % 10) || (num2 % 10 == num3 % 10) || (num1 % 10 == num3 % 10));
        }
        return false;
    }

    public static boolean isValid(int num) {
        return !(num < 10 || num > 1000);
    }
}