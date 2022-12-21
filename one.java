package Java111Q2;
import java.util.*;
public class one {

	public static void main(String[] args) {
		System.out.println("密碼輸入測試");
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int pass1;
		int pass2;
		System.out.print("請輸入密碼:");
		pass1 = sc.nextInt();
		System.out.print("請再輸入一次密碼:");
		pass2 = sc.nextInt();
		while(pass1!=pass2) {
			i++;
			System.out.println("與第一次輸入的不同!");
			if(i==2) {
				throw new RuntimeException("輸入3次錯誤!程式停止!");
			}
			System.out.println("請再輸入一次密碼:");
			pass2 = sc.nextInt();
		}
		try {	
		}
		catch(RuntimeException e) {
			System.out.println(e);
		}
	}
}
