package day02;

import java.util.Arrays;

/**
 * .String str = "svd9876fsb543fdg210";���ַ���������ż��תΪint[] ���飬�ٶ�����ð������
 * ���ʹ��Arrays�������
 * @author Administrator
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		String str = "svd9876fsb543fdg210";
		StringBuffer bf = new StringBuffer();
		for(int i=0;i<str.length();i++){
			char cha = str.charAt(i);
			if(cha>48 && cha<=57){//���ֵ�ASCII��
				bf.append(cha);
			}
		}
		int arr[] = new int[bf.length()];//����һ��������ֵ�����
		for(int j=0;j<bf.length();j++){//ѭ������
			String ch = bf.charAt(j)+"";//�õ�ÿ���ַ�
			int number = Integer.parseInt(ch);//���ַ�ǿתΪ��������
			if(number%2 == 0){//�ж��Ƿ�Ϊż��
				arr[j] = number;//��ż��  ���븴��
			}
		}
		System.out.println(bf);
    	pai(arr);//ð������
		System.out.println(Arrays.toString(arr));//���
	}
	
	public static void pai(int arr[]){//ð������
		for(int i=0;i<arr.length;i++){//ѭ�� ���� ��ÿһ���������������жԱ�
			for(int j=0;j<arr.length-1-i;j++){//�Ա�
				if(arr[j]>arr[j+1]){//�������һ������ ����λ�ý��� ���ν���
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
