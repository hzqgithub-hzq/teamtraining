package day01;


/**
 * ��ϰjavalang���е������
 * @author Administrator
 *
 */
public class JavaLang {
	public static void main(String[] args) {
		Boolean flag = null; //boolean���͵İ�װ��  ����Ϊnull ����
		
		Byte b1 = null; //byte�İ�װ��  ����Ϊnull �ֽ�
		
		Double b2 = null;//double�İ�װ�� ����Ϊnull С��
		
		Float f = null;//������С���İ�װ��
		
		Integer i = null;//�������͵İ�װ��
		
		Long l = null;//�����εİ�װ��
		
		//nullpointException  ��ָ���쳣 ������һЩ���������  �������ʵ�λ���ǲ����ڵģ��ͻ��������ڳ��ִ��쳣
		
		//numberFormatException ��������ת���쳣  ����һ����ֵ��������ת��ʱ��������ת����ֵ����������Ҫ����������ʱ���ͻ���ִ��쳣
		
		Object c = null;
		Object o1 = 2.3;//���� ��������඼ֱ�ӻ��߼�ӵü̳�������࣬
		
		//override  ��д ��ע�ͣ������ڸ������� ��д���෽��
		new Thread(new Runnable(){//runnable �����̵߳ķ�ʽ֮һ���̳���Runnable�ӿ� ��дrun ����
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
		}).start();
		
		//RunntimeException �������쳣  ���ڴ������Ҫ�����ڼ� ������ֵ��쳣
		
		Short s = null;//���͵İ�װ�� ����Ϊnull
		
		String s1 = "s";//String ,�ַ�������	
		s1.length();//��ȡ�ַ������� 
		s1.trim();//����ַ������߿հ�
		s1.charAt(0);//��ȡָ���ַ�
		s1.indexOf(0);//����ָ���ַ�
		s1.lastIndexOf(0);//����ָ���ַ������ֵ�λ��
		s1.split("s");//����ָ���ַ����в�� ����ֵΪ����
		s1.substring(0);//��ȡָ��λ�õ��ַ���
		s1.replace("c", "v");//�ַ����滻
		s1.matches("ss");//������ʽ�滻
		
		StringBuffer sf = new StringBuffer("sd");//�ɱ��ַ�  �̰߳�ȫ�� Ч�ʵ�
		sf.append("fg");//����Ԫ��
		sf.length();//��ȡ����
		sf.toString();//ת��Ϊ�ַ�
		sf.delete(0, 1);//ɾ��ָ��λ��Ԫ��
		sf.replace(0, 2, "sc");//�滻ָ��λ�õ��ַ�
		sf.substring(0);//��ȡָ��λ�õ��ַ���
		sf.indexOf("s",0);//����ָ���ַ���
		
		StringBuilder sd = new StringBuilder("sl");//�ɱ��ַ��� �̲߳���ȫ�� Ч�ʸ�
		sd.append("b");//�����ַ�
		sd.length();//��ȡ�ַ�������
		sd.charAt(0);//��ȡָ�����ַ�
		sd.substring(0);//��ȡָ��λ�õ��ַ���
		
		new Thread(){//�����̵߳ķ�ʽ �̳���thread��
			public void run(){
				
			}
		}.start();;
	}
}
 


