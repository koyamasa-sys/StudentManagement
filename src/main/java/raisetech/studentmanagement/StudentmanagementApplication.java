package raisetech.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementApplication {

	public static void main(String[] args) {
		//localhost:8080
		SpringApplication.run(StudentmanagementApplication.class, args);
		System.out.println("実行中");
	}
}


//src,main,java～build.gradile
//	このファイルは,StudenymanagemenyApplication
//外部ライブラリ,フレームワークを使う全てのライブラリ
//localhost:8080,エラー
