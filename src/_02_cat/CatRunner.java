package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat x = new Cat("BigTimeTommy");
		x.meow();
		x.printName();
		for(int i = 0; i<793; i++) {
			x.kill();
		}
	}
}
