package day02;

import java.util.Scanner;

/**
 * 3.ģ��QQ��½�������˺������룬����˺���������ȷ����ʾ��¼�ɹ���
���ʧ�������µ�¼������ʾ��¼���󼸴Σ������¼������������������¼ʧ�ܡ�
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int count = 0;//�����½����
		while(count!=3){//���Ƶ�½����
			System.out.println("�������û���");
			String userName = scan.nextLine();//�����û���
			System.out.println("����������");
			String password = scan.nextLine();//��������
			count ++;
			if(userName.equals("root") && password.equals("1234")){//�ж��Ƿ���ȷ
				System.out.println("��½�ɹ�");
				return;//�ɹ��˳�����
			}else{
				System.out.println("��½���󣬴������Ϊ��"+count);//������ʾ�������
			}
		}
		scan.close();
		System.out.println("��½ʧ��");//����ʧ�ܺ�  ��½ʧ��
		
		
	}

}
