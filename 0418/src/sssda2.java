import java.util.Scanner;
public class sssda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1000  ������ �ڿ��� �Է�: ");
		int num1 = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=num1) {
			if(i%4==0) {
				System.out.println(i);
				sum +=i;
			}
			i++;
		}
		System.out.println("1~"+num1+"���� 4�� ����� ��" + sum +"�Դϴ�");
	}

}
