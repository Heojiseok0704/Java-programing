import java.util.Scanner;

public class HW3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System .out.printf("몇 개의 수를 입력할 예정인가요?: ");
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("수를 입력하세요: ");
        for(int i = 0; i<n; i++){
            int num= scanner.nextInt();
            if(num>max){
                max = num;
            }
            if (num<min){
                min = num;
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }
}