package demo1;

import java.io.BufferedWriter;
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
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ���ļ�");
		String filename = sc.nextLine();
		FileOutputStream fis = new FileOutputStream(filename);
		OutputStreamWriter osr = new OutputStreamWriter(fis,"utf-8");
		BufferedWriter bw = new BufferedWriter(osr);
		PrintWriter pw = new PrintWriter(bw,true);
		System.out.println("���������ݣ�");
		while(true){
			String line = sc.nextLine();
			if("exit".equals(line)){
				break;
			}
			pw.println(line);
		}
		System.out.println("over");
		pw.close();
		sc.close();
		
	}

}
