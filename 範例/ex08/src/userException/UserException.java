package userException;
import java.util.Scanner;

public class UserException {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b;
		try {
		    System.out.print("�п�J�Ĥ@�ӼƭȡG");
		    a = Integer.parseInt(scn.nextLine());
		    System.out.print("�п�J�ĤG�ӼƭȡG");
		    b = Integer.parseInt(scn.nextLine());
		    System.out.println(a + "/" + b + "=" + a/b);
		}
		catch(ArithmeticException e) {  //�ˬd�ҥ~�O�_����N�B�⪺���~
		     System.out.println("��N�B����~! �p���Ƭ�0!!");
		}
		catch(NumberFormatException e) { //�ˬd�ҥ~�O�_���r���ন�ƭȪ����~
		     System.out.println("���~!�r��L�k�ন�ƭ�!!");
		}
	}
}