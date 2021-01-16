package object;

public class Main8_4 {

	public static void main(String[] args) {

		Cleric cr = new Cleric();
		cr.name = "菅原";
		System.out.println("聖職者" + cr.name + "が誕生した！");

		cr.selfAid();
		// 回復量が戻り値として、かえってくる
		cr.mp += cr.pray(3);
		// System.out.println("現在のMPは" + cr.mp + "です");
	}

}
