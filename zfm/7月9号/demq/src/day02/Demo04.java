package day02;

import java.util.Scanner;

/**
 * ����Scanner����һ���ַ�����������Scanner����һ���ַ������Ҹ��ַ��������ַ����е�λ�ã��������λ��
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�");
		String line = sc.nextLine();
		System.out.println("��������Ҫ��ѯ���ַ�");
		String c = sc.nextLine();
		/*int index = line.indexOf(c)+1;
		System.out.println("��ѯ���ַ��ڵ�  "+index+" λ");
		sc.close();*/
		for(int i=0;i<line.length();i++){//���ǲ�ѯ���ַ����ڶ��
			String c1 = line.charAt(i)+"";
			if(c.equals(c1)){
				i++;
				System.out.println("��ѯ���ַ��ڵ�  "+i+" λ");
			}
		}
		sc.close();
	}

}
