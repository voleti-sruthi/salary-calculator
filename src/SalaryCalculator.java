import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        int weeklySalary = 0;
        int totalWorkingHoursInWeek = 0;
        Scanner scanner = new Scanner(System.in);
        for(int iterator = 0 ; iterator < 7 ; iterator++ ){
            int workingHoursInADay = scanner.nextInt();
            if(iterator == 0 ){
                weeklySalary = weeklySalary + workingHoursInADay*150;
            }
            else if(iterator == 6 ){
                weeklySalary = weeklySalary + workingHoursInADay*125;
            }
            else{
                if(workingHoursInADay > 8){
                    weeklySalary = weeklySalary + 15*( workingHoursInADay - 8 );
                }
                weeklySalary = weeklySalary + workingHoursInADay*100;
                totalWorkingHoursInWeek = totalWorkingHoursInWeek + workingHoursInADay;
            }
        }
        if(totalWorkingHoursInWeek > 40){
            weeklySalary = weeklySalary + 25;
        }
        System.out.println(weeklySalary);
    }
}