package day02;

import java.util.Scanner;

/**
 * ����¼��һ���ַ�����Ҫ�󳤶�Ϊ8��������������󣻷������������ַ��������д�д�ַ��滻��'M'   
 * @author Administrator
 *
 */
public class Demo02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("������");
		String str = sc.nextLine();
		if(str.length()!=8){//���Ƴ��ȣ�ֻ��Ϊ8 �������쳣
			throw new Exception("����ֻ��Ϊ8����ĳ���Ϊ��"+str.length());
		}
		String s = "";
		for(int i=0;i<str.length();i++){//ѭ����ȡ
			char c = str.charAt(i);
			if('A'<=c && 'Z'>=c){//�ж��Ƿ�Ϊ��д��ĸ
				 s = str.replace(c, 'M');//�滻
			}
		}
		System.out.println(s);
		sc.close();
		
	}
}
