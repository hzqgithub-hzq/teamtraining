package day02;

import java.util.Arrays;

/**
 * �������ַ��������ŷָ���õ����ַ�������ת��Ϊint���飬���򣬱��������
�ַ������£�"120,11,32,135,234,91,18"
 * @author Administrator
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		String str = "120,11,32,135,234,91,18";
		String s[] = str.split(",");//���ݶ��Ž��зָ�
		int arr[] = new int[s.length];//���������������
		for(int i=0;i<s.length;i++){//����
			arr[i] = Integer.parseInt(s[i]);//ǿתΪ��������
		}
		Arrays.sort(arr);//����
		for(int i:arr){//����
			System.out.println(i);
		}
		}

}
