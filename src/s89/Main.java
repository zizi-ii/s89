package s89;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		// 자신의 학번과 이름을 출력하라
		out.println("1234567 이지우");
		out.println(Hello.sum(10));
		out.println(Hello.sum(100));
		out.println(Hello.sum(1000));
		out.println(Sansu.max(new int[] {8, 5, 6, 9, 4}));
		out.println(Sansu.max(new int[] {-2, 5, 6, 9, -6}));
	}
}
