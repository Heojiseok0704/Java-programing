import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework9 {
    public static void main(String[] args) {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("myId", "myPass");
        credentials.put("myId2", "myPass2");
        credentials.put("myId3", "myPass3");

        try (BufferedReader reader = new BufferedReader(new FileReader("db.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length == 2) {
                    credentials.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("id와 password를 입력해주세요");

        while (true) {
            System.out.print("id : ");
            String inputId = scanner.nextLine().trim();

            if (!credentials.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
                continue;
            }

            System.out.print("password : ");
            String inputPassword = scanner.nextLine().trim();

            if (credentials.get(inputId).equals(inputPassword)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
            }
        }

        scanner.close();
    }
}
