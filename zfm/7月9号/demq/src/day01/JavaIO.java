package day01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ��дjavaio���еĳ�����
 * @author Administrator
 *
 */
public class JavaIO {
	public static void main(String[] args) throws Exception {
		File file = new File("text.doc");//������Ҫ�����ļ���Ŀ¼�Ĵ������ļ��Ĳ��Һ��ļ���ɾ����
		file.exists();//�жϳ���·������ʾ���ļ���Ŀ¼�Ƿ���� ����Ϊbooleanֵ
		file.mkdirs();//�����˳���·����ָ����Ŀ¼�������������赫�����ڵĸ�Ŀ¼
		file.mkdir();//�����˳���·����ָ����Ŀ¼
		file.listFiles();//����һ������·�������飬��Щ·������ʾ�˳���·��������ʾĿ¼�е��ļ�
		file.delete();//ɾ���˳���·������ʾ���ļ���Ŀ¼
		file.isDirectory();//���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼
		file.isFile();//���Դ˳���·������ʾ���ļ��Ƿ���һ����׼�ļ�
		file.length();//�����ɴ˳���·������ʾ���ļ��ĳ���
		
		FileInputStream fis = new FileInputStream(file);//��ȡ�ļ����ֽ���
		BufferedInputStream bis = new BufferedInputStream(fis);//���ļ�д����ֽ���
		FileOutputStream fos = new FileOutputStream(file) ;//���ļ�������� ������ֽ���
		BufferedOutputStream  bos = new BufferedOutputStream(fos);// ������ֵ�Ŀ����Ϊ��������ļ�д���ݵ�Ч��
		InputStreamReader Isr = new InputStreamReader(fis);//���ֽ���ת��Ϊ�ַ���
		OutputStreamWriter osw = new OutputStreamWriter(fos);//������ֽ���ת��Ϊ����ַ���
		BufferedReader br = new BufferedReader(Isr);//�����ַ��� ��߶�Ч��
		BufferedWriter bw = new BufferedWriter(osw);//�����ַ��� ���дЧ��
		
		//IOException ����io���п��ܷ������쳣
		
		//FilenotFounfExceptiom �ļ��Ҳ����쳣 ���ڴ����ļ�ʱ  �ļ������ڵ��쳣
		
		
	}

}
