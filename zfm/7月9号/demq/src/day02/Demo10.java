package day02;
/**
 * .����һ������Ϊ15λ������ַ�������дСд�����֣�������������ַ�����
 * @author Administrator
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer();//��������ַ���
		char cha;//�����ĸ
		int number;//�������
		for(int i=0;i<15;i++){//����15������
			int c =  (int)(Math.random()*10000);//ת�ͣ������������
			int type =c%3+1;//�ж���������
			switch(type){//ѡ����������
			case 1://����
				number = (int)(Math.random()*10);
				System.out.print(number);
				sf.append(number);
				break;
			case 2://��д
				number = (int)(Math.random()*(90-65)+65);
				cha = (char)number;
				System.out.print(cha);
				sf.append(cha);
				break;
			case 3://Сд
				number = (int)(Math.random()*(122-97)+97);
				cha = (char)number;
				System.out.print(cha);
				sf.append(cha);
				break;
			}
		}
		

	}

}
