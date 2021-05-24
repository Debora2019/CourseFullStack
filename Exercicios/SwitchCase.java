import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int day, month, yearBirthday, yearActual, maxDay=0;
        String nameMonth;

        System.out.println("Insert in number your Birthday Month: ");
        month = new Scanner(System.in).nextInt();

while(month > 12 || month <= 0){
    System.out.println("Month invalid!");
    System.out.println("Inform a valid month");
    month = new Scanner(System.in).nextInt();
}

switch (month){
    case 1: 
        nameMonth = "January";
        maxDay = 31;
        break;
    case 2: 
        nameMonth = "February";
        maxDay = 28;
        break;
    case 3: 
        nameMonth = "March";
        maxDay = 31;
        break;
    case 4: 
        nameMonth = "April";
        maxDay = 30;
        break;
    case 5: 
        nameMonth = "May";
        maxDay = 31;
        break;
    case 6: 
        nameMonth = "June";
        maxDay = 30;
        break;
    case 7: 
        nameMonth = "July";
        maxDay = 31;
        break;
    case 8: 
        nameMonth = "August";
        maxDay = 31;
        break;
    case 9: 
        nameMonth = "September";
        maxDay = 30;
        break;
    case 10: 
        nameMonth = "October";
        maxDay = 31;
        break;
    case 11: 
        nameMonth = "November";
        maxDay = 30;
        break;
    case 12: 
        nameMonth = "December";
        maxDay = 31;
        break;
    default:
        nameMonth = "invalid month";
}

System.out.println("Insert the day of your birthday ");
day= new Scanner(System.in).nextInt();

while(day > maxDay || day <=0){
    System.out.println(nameMonth + " tem " + maxDay + " dias ");
    System.out.println("Invalid day");
    System.out.println("Insert a valid day");
    day = new Scanner(System.in).nextInt();
}

System.out.println("Insert the current year ");
yearActual = new Scanner(System.in).nextInt();
System.out.println("Insert the birthday year ");
yearBirthday = new Scanner(System.in).nextInt();

System.out.println("You were born in:  " + day + " of " + nameMonth + " " + yearBirthday);
int age =  yearActual - yearBirthday;
System.out.println("You are " + age + " years");
    }
}
