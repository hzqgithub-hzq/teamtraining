package demo1;

import java.util.Scanner;
/**
 * Scanner��ϰ
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("������");
		String username = sc.nextLine();
		sc.close();
		String name  = "��";
		if(username.equals(name)){
			System.out.println("Ŷ��");
		}else{
			System.out.println("��");
		}
		
	}
	}

