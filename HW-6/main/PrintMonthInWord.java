import java.util.Scanner;

public class PrintMonthInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month number: ");
        int monthNum = scanner.nextInt();

        String monthString;

        if (monthNum == 1) {
            monthString = "JAN";
        } else if (monthNum== 2) {
            monthString = "FEB";
        } else if (monthNum== 3) {
            monthString = "MAR";
        } else if (monthNum== 4) {
            monthString = "APR";
        } else if (monthNum== 5) {
            monthString = "MAY";
        } else if (monthNum== 6) {
            monthString = "JUN";
        } else if (monthNum== 7) {
            monthString = "JUL";
        } else if (monthNum== 8) {
            monthString = "AUG";
        } else if (monthNum== 9) {
            monthString = "SEP";
        } else if (monthNum== 10) {
            monthString = "OCT";
        } else if (monthNum== 11) {
            monthString = "NOV";
        } else if (monthNum== 12) {
            monthString = "DEC";
        } else {
            monthString = "Not a valid month";
        }

//   Realization with 'switch' operator.

//        switch (monthNum) {
//            case 1:  monthString = "JAN"; break;
//            case 2:  monthString = "FEB"; break;
//            case 3:  monthString = "MAR"; break;
//            case 4:  monthString = "APR"; break;
//            case 5:  monthString = "MAY"; break;
//            case 6:  monthString = "JUN"; break;
//            case 7:  monthString = "JUL"; break;
//            case 8:  monthString = "AUG"; break;
//            case 9:  monthString = "SEP"; break;
//            case 10: monthString = "OCT"; break;
//            case 11: monthString = "NOV"; break;
//            case 12: monthString = "DEC"; break;
//            default: monthString = "Not a valid month"; break;
//        }


        System.out.println(monthString);
    }
}
