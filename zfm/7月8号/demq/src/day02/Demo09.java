package day02;
/**
 * .���������ַ���ɵĵ����������ͳ�Ƹ����� 
 * String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
 * @author Administrator
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		String s1[] = s.split(",");//�ȸ��ݡ��������в��
		int count = 0;//���������ַ�������
		for(int i=0;i<s1.length;i++){//ѭ������
			String s2[] = s1[i].split(" ");//�ٸ��ݡ� �����
			for(int j=0;j<s2.length;j++){//ѭ������
				if(s2[j].length()==3){//�жϳ����Ƿ�Ϊ3
					count++;//������һ
					System.out.println(s2[j]);//���������ĸ
				}
			}
		}
		System.out.println("�����ַ��ĸ����У�"+count);
	}

}
