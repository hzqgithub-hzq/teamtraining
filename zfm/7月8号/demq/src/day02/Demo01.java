package day02;

import java.util.Scanner;

/**
 * ����¼��һ���ַ�����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�) 
 * @param args
 */
public class Demo01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����루��ĸ�����֣�");//��ʾ����
		String line = scan.nextLine();//����
		int upnamcount = 0;//ͳ�ƴ�д��ĸ����
		StringBuffer upnam = new StringBuffer("");//ͳ�ƴ�д��ĸ
		int downnamcount = 0;//ͳ��Сд��ĸ����
		StringBuffer downnam = new StringBuffer("");//���Сд��ĸ
		int numbercount = 0;//ͳ����������
		StringBuffer number = new StringBuffer("");//�������
		for(int i=0;i<line.length();i++){//ѭ����ȡ
			char c = line.charAt(i);
			if('A'<=c && 'Z'>=c){//�ж��Ƿ�Ϊ��д��ĸ
				upnamcount ++;//������1
				upnam.append(c);//���
			}
			if('a'<=c && 'z'>=c){//�ж��Ƿ�ΪСд��ĸ
				downnamcount ++;//������1
				downnam.append(c);//���
			}
			if('0'<=c && '9'>=c){//�ж��Ƿ�Ϊ����
				numbercount ++;//������1
				number.append(c);//���
			}
		}
		//���
		System.out.println("��д��ĸ����Ϊ"+upnamcount+";�ֱ���:"+upnam);
		System.out.println("Сд��ĸ����Ϊ"+downnamcount+";�ֱ���:"+downnam);
		System.out.println("������ĸ����Ϊ"+numbercount+";�ֱ���:"+number);
		scan.close();
	}

}
