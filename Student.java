import java.util.Scanner;

public class Student{
    private String 학번;
    private String 이름;
    private String 전공;
    private String 전화번호;

    public String get학번(){
        return 학번;
    }

    public void set학번(String 학번){
    this.학번 = 학번;
    }

    public String get이름(){
        return 이름;
    }

    public void set이름(String 이름){
        this.이름 = 이름;
    }

    public String get전공(){
        return 전공;
    }

    public void set전공(String 전공){
        this.전공 = 전공;
    }

    public String get전화번호(){
        return 전화번호;
    }

    public void set전화번호(String 전화번호){
        this.전화번호 = 전화번호;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Student[] 학생들 = new Student[3];

        for(int i = 0; i<3; i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요");
            String 입력 = scanner.nextLine();
            String[] 정보 = 입력.split("");

            Student 학생 = new Student();
            학생.set학번(정보[0]);
            학생.set이름(정보[1]);
            학생.set전공(정보[2]);
            학생.set전화번호(정보[3]);

            학생들[i] = 학생;
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i<3; i++){
            Student 학생 = 학생들[i];
            System.out.println("첫번째 학생: " + 학생.get학번() + " " + 학생.get이름() + " " + 학생.get전공() + " " + 학생.get전화번호());
        }
        scanner.close();
    }
}