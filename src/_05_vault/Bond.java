package _05_vault;

public class Bond {
	public int findCode(Vault y) {
		for(int i = 0;i<1000000;i++) {
			if(y.triCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
