import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		int a, b=0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		 System.out.println("���ۼ��� : ");
		 a = sc.nextInt();
		 System.out.println("������ ���� : ");
		 b = sc.nextInt();
		 for(int i = a; i<=b; i++) {
			 sum += i;
		 	}
		 System.out.println(a+"���� " + b+"������ ���� " + sum);
		 
	}
}
