import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LogIn {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int pass = 0;
		System.out.println("LogIn을 위해 ID와 비밀번호를 입력하세요.");
		System.out.println("ID 입력 : ");
		String id = scan.nextLine();
		System.out.println("비밀번호 입력 : ");
		String pw = scan.nextLine();
		//파일 입출력 선언
		File file = new File("C:\\song\\MemberDB.txt");
		//file에 있는 정보 읽기
		try {
			FileReader filereader = new FileReader(file);
			//읽어들인 내용을 Buffer에 저장
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			//BufferReader가 한줄씩 읽어서 line에 넣어준다. 끝날때까지
			try {
				while((line = bufReader.readLine()) != null) {
					//id와 pw의 인덱스를 읽어옴. 없다면 -1
					System.out.println(line.indexOf(id) + "\t" + line.indexOf(pw));
					//로그인이 되었는지 확인하기 위해 변수 생성
					int passId = line.indexOf(id);
					int passPw = line.indexOf(pw);
					//로그인이 되면 pass 1
					if(passId != -1 && passPw != -1) {
						System.out.println("로그인 성공");
						pass = 1;	}
					}
				if(pass == 0) { System.out.println("로그인 실패");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
