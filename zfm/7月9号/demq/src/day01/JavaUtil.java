package day01;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ����java�е�util���еĳ�����
 * @author Administrator
 *
 */
public class JavaUtil {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();//����ʵ�ֵļ��� ���ҿ� ��ɾ�� �����ظ�
		list.add("s");//����Ԫ��
		list.size();//��ȡ���ϳ���
		list.isEmpty();//�жϼ����Ƿ�Ϊ��
		list.remove(0);//ɾ��ָ��Ԫ��
		//list.get(0);//��ȡָ��Ԫ��
		
		Date date = new Date();//ʱ������ ���Ի�ȡ��ǰʱ��
		date.toString();//ת��Ϊ�ַ�������
		date.getTime();//�����ڲ��洢�ĺ�������1970��7��1��0ʱ0�ֿ�ʼ
		date.setTime(0);//���������ڴ�ĺ�����
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();// �̲߳���ȫ������null key��null value������ȡ�ٶȿ졣�ײ����Թ�ϣ��ʵ�ֵ�.
		map.put("s", 1);//��ֵ  ���Ԫ��
		map.get("s");//����key��ȡԪ��
		map.isEmpty();//�ж��Ƿ�Ϊ��
		map.containsKey("k");//�ж�keyֵ�Ƿ����
		map.size();//��ȡԪ�ظ���  ���ϳ���
		map.clear();//�������Ԫ��
		
		HashSet<String>set = new HashSet<String>();//�̲߳���ȫ����ȡ�ٶȿ졣�ײ����Թ�ϣ��ʵ�ֵġ������ظ�
		set.add("a");//����Ԫ��
		set.size();//��ȡ���ϳ���
		set.toString();//ת��Ϊ�ַ��� 
		set.isEmpty();//�ж��Ƿ�Ϊ�� ����ֵΪboolean
		set.clear();//�����������
		set.contains("d");//�ж��Ƿ����
		
		LinkedList<String> link = new LinkedList<String>();//�̲߳���ȫ����ȡ�ٶȿ졣�ײ����Թ�ϣ��ʵ�ֵġ�
		link.add("a");//����Ԫ��
		link.size();//��ȡ���ϳ���
		link.get(0);//��ȡָ��Ԫ��
		link.contains("S");//�ж��Ƿ����
		link.isEmpty();//�ж��Ƿ�Ϊ�� ����ֵΪboolean
		link.clear();//�������Ԫ��
		link.remove(0);//�Ƴ�ָ��Ԫ��
		set.toString();//ת��Ϊ�ַ��� 
		
		Scanner snc = new Scanner(System.in);//�����ṩϵͳ�������
		String name = snc.nextLine();//�����ַ���
		int i = snc.nextInt();//��������
		snc.close();//�ر�����
		
	}

}
