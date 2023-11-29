import java.util.HashMap;
import java.util.Scanner;

public  class Homework8{
    public static void main(String[] args){
        HashMap<String, String> credentails = new HashMap<>();
        credentails.put("myId", "myPass");
        credentails.put("myId2", "myPass2");
        credentails.put("myId3", "myPass3");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("ID를 입력하세요: ");
            String inputId = scanner.nextLine().trim();

            if (!credentails.containsKey(inputId)){
                System.out.println("존재하지 않는 ID입니다. 다시 입력하세요.");
                continue;
            }
            System.out.print("비밀번호를 입력하세요: ");
            String inputPassword = scanner.nextLine().trim();

            String storedPassword = credentails.get(inputId);

            if (inputPassword.equals(storedPassword)){
                System.out.println("로그인 성공!");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
            }
        }
        scanner.close();
    }
}