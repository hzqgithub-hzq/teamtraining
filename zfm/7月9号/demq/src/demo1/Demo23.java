package demo1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo23 {
/**
 * ��ȡָ���ļ���
 * @param args
 * @throws FileNotFoundException 
 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ���ļ�");//���տͻ��Զ���ѡ����ļ�����
		String filename = sc.nextLine();
		File file = new File(filename);
		if(!file.exists()){//�ж��ļ��Ƿ����
			throw new FileNotFoundException("�ļ�������");
		}
		FileInputStream fis = new FileInputStream(filename);//�����ļ�������
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");//ת��Ϊ�ַ���
		BufferedReader bw = new BufferedReader(isr);//�����ַ���
		String line = null;
		while((line=bw.readLine()) != null){//ѭ���ж϶�ȡ�����ж��Ƿ�Ϊnull
			System.out.println(line);//�����������
		}
		bw.close();//�ر���
		sc.close();//�ر�����
	}

}
