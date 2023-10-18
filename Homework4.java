import java.util.Scanner;
public class Homework4{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("두 수를 입력하세요: ");
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int gcdResult = gcd(m, n);
    System.out.println("두 수의 최대공약수는" + gcdResult + "입니다.");
}
public static int gcd(int m, int n){
if(m ==0){
    return m;
}
while(true){
    if(m%n == 0){
return n;
}
    int temp = m;
    m = n;
    n= temp % n;
    }
}
}