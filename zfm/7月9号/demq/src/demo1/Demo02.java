package demo1;

import java.io.File;
import java.io.IOException;

/**
 * io����ϰ
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) throws IOException {
		File file = new File("demo");//����һ���ļ�
		if(!file.exists()){//�ж��Ƿ����
			file.createNewFile();//���������  ����
			System.out.println("true");
		}
	}
	
}
