package treeSetDemo;
import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
	    var tset = new TreeSet<>();
	    int[] number = { 23, 45, 9, -6, 18, 93, 100, 76, 54, 66, 
		                 89, 34, 0, -55, -27, 61 };
        for (int n : number)
		    tset.add(n);
		System.out.println("���󤺤��������e�G");
		System.out.println("  " + tset);
		System.out.println("�Ĥ@�Ӥ������e���G" + tset.first());
		System.out.println("�̫�@�Ӥ������e�G" + tset.last());
		
		Scanner keyin = new Scanner(System.in);
		int num = 0;
		while (true) {
		   System.out.print("�п�J�@�Ӿ�ơH ");
		   try {
		      num = Integer.parseInt(keyin.nextLine());
		   } catch (NumberFormatException ex) {
		      System.out.println("  �п�J�ƭȡI");
		      continue;
		   }
		   if (num >= (int) tset.first() && num <= (int) tset.last())
		      break;
		   else
		      System.out.println("  �d����~�I");
	   }
	   System.out.print("  �������e�j�󵥩�" + num + "�̡G");
	   System.out.println(tset.tailSet(num));
	   keyin.close();
	}
}