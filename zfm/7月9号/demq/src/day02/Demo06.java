package day02;

import java.util.Arrays;

/**
 * ����Math���ȡ5����������Χ��(15,30)�������ظ������������У�ð�������������
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		int arr[] = new int[5];//�������������ڽ���
		for(int i=0;i<5;i++){//ѭ������
			int num = (int) (Math.random()*(30-15)+15);//���������
			if(check(arr,num)){//�ж������Ƿ����
					i--;//����  ѭ����һ  ��������
			}else{//������
				arr[i] = num;//��ֵ
			}
		}
		pai(arr);//ð������
		System.out.println(Arrays.toString(arr));//���
		
	}
	public static boolean check(int arr[],int num){
		for(int i=0;i<arr.length;i++){//����������ִ���
			if(arr[i]==num){//���б����Ա�
				return true;//���� �򷵻�true
			}
		}
		return false;//������  �򷵻� false
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
