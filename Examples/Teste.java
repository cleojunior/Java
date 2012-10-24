public class Teste {
	private Integer x;
	private String s;

	private void mostra() {
		System.out.println(s);
		System.out.println(Integer.toString(x));
	}

	public void main (String[] args) {
		x = 10;
		s = "tora";

		mostra();
	}

}
