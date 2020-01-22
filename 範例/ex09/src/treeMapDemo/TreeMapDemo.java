package treeMapDemo;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
	   var tmap = new TreeMap<>();
	   tmap.put(260, "�y��");
	   tmap.put(970, "�Ὤ");
	   tmap.put(500, "����");
	   tmap.put(900, "�̪F");
	   tmap.put(600, "�Ÿq");
	   System.out.println("���X���e�G" + tmap);
	   System.out.println("���X�������ӼơG" + tmap.size());
	   int key = (int) tmap.firstKey();
	   System.out.println("���X���Ĥ@�Ӷl���ϸ��G" + key);
	   System.out.println("���X���Ĥ@�Ӧa�W�G" + tmap.get(key));
	   System.out.println("���X���̫�@�Ӷl���ϸ��G" + tmap.lastKey());
	   System.out.println("���X���̫�@�Ӧa�W�G" + tmap.get(tmap.lastKey()));
	   System.out.println("�l���ϸ��j�󵥩�" + 600 + "���������X�G" +
	                       tmap.tailMap(600));
	}
}
