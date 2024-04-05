package jaava8features;

@FunctionalInterface
interface Syable {
	String Say(String str);
}

public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Syable s1 = name -> "Hello " + name;
		System.out.println(s1.Say("Priyanka"));

		Syable s2 = msg -> {
			return "Message : " + msg;
		};
		System.out.println(s2.Say("Learning Java 8 features"));

	}

}
