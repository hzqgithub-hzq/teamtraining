package demo1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * ��ָ���ļ�����д������
 * @author Administrator
 *
 */
public class Demo22 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ���ļ�");//�Զ��������ļ���
		String filename = sc.nextLine();//�����û����������
		File file = new File(filename);
		if(!file.exists()){//�ж��ļ��Ƿ����
			throw new FileNotFoundException("�ļ�������");
		}
		FileOutputStream fis = new FileOutputStream(filename);//�����ļ������
		OutputStreamWriter osr = new OutputStreamWriter(fis,"utf-8");//ת��Ϊ�ַ���
		BufferedWriter bw = new BufferedWriter(osr);//�ַ�������
		PrintWriter pw = new PrintWriter(bw,true);//�ı��������ӡ
		System.out.println("���������ݣ�");
		while(true){//ѭ��д��
			String line = sc.nextLine();//������������
			if("exit".equals(line)){//������exitʱ���� �˳�����
				break;
			}
			pw.println(line);//д���ļ�
		}
		System.out.println("over");
		pw.close();//�ر�д����
		sc.close();//�ر�����
		
	}

}
