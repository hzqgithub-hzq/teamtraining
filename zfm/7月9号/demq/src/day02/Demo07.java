package day02;

import java.util.Scanner;

/**
 * ����¼��һ���ַ���������������ʽ�ж��Ƿ���һ��qq����
 * @author Administrator
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������䣺");
		String email = sc.nextLine();//�����û�����������
		String regax = "[1-9a-zA-Z]+@[1-9A-Za-z]+[.]com?" ;//ȷ��������ʽ
		boolean flag = email.matches(regax);//ʹ��api��֤
		if(flag){
			System.out.println("ok");
		}else{
			System.out.println("�����ʽ����");
		}
		sc.close();
	}

}
