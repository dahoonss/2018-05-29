package java_example_01;

public class FloatDoubleexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 실수형 변수를 선언하는 타입 double(8byte),float(4byte)
 * 자바는 기본 실수값을 double 타입으로 인지하기 때문에 float 타입의 변수에
 * 실수를 담기 위해선 값의 끝에 F를 붙여야 함.
 */
		double var1 = 3.14;
		float var2 =3.14F;
		
		double var7 =3e6;
		float var8 =3e6F;
		double var9 =2e-3;
		
		System.out.println("var1:"+ var1);
		System.out.println("var2:"+ var2);
		System.out.println("var7:"+ var7);
		System.out.println("var8:"+ var8);
		System.out.println("var9:"+ var9);
	}
	

}
