import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberJoin {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//파일생성할 위치 지정
		File file = new File("C:\\song\\MemberDB.txt");
		try {
			//파일 작성
			FileWriter filewriter = new FileWriter(file, true);
			if(file.isFile() && file.canWrite()) {
				System.out.println("회원가입을 위해 ID를 입력하세요.");
				System.out.println("ID 입력 : ");
				//스캐너로 입력받기
				filewriter.append(scan.nextLine());
				filewriter.append("\t");
				System.out.println("비밀번호 입력 : ");
				filewriter.append(scan.nextLine());
				filewriter.append("\r"); //개행문자
				System.out.println("회원가입이 완료되었습니다.");
			}
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
