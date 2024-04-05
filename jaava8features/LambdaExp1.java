package jaava8features;
@FunctionalInterface
interface Addable{
	int add(int a, int b);
	
}
public class LambdaExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a1= (c,d)->c+d;
		System.out.println("Add "+a1.add(10, 20));

	}

}
