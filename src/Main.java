import java.util.Scanner; //패키지 import

class Homework1{ //클래스 이름
    public static void main(String[] args){ //main 함수
        Scanner sc = new Scanner(System.in);//키보드로 입력받기
        System.out.println("정수를 입력하세요 : ");
        int num1 = sc.nextInt();//정수 입력
        sc.nextLine();
        String s1 = String.format("%d", num1); // num1을 문자열로 변환
        System.out.printf("현재까지 입력된 정수의 합은 %s 입니다.\n", s1);
        System.out.println("정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        String s2 = String.format("%d", num1+num2);
        System.out.printf("현재까지 입력된 정수의 합은 %s 입니다.\n", s2);
        System.out.println("정수를 입력하세요 : ");
        int num3 = sc.nextInt();
        String s3 = String.format("%d", num1+num2+num3);
        System.out.printf("현재까지 입력된 정수의 합은 %s 입니다.\n", s3);
        System.out.println("정수를 입력하세요 : ");
        int num4 = sc.nextInt();
        String s4 = String.format("%d", num1+num2+num3+num4);
        System.out.printf("현재까지 입력된 정수의 합은 %s 입니다.\n", s4);
        System.out.println("정수를 입력하세요 : ");
        int num5 = sc.nextInt();
        String s5 = String.format("%d", num1+num2+num3+num4+num5);
        System.out.printf("현재까지 입력된 정수의 합은 %s 입니다.", s5);
    }
}