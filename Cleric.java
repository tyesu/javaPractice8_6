package object;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.MAXHP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
		System.out.println("MPが5減った");
		System.out.println("現在のMPは" + this.mp + "です");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は、" + sec + "秒祈った");
		int recovery = new java.util.Random().nextInt(3) + sec;
		if(recovery + this.mp < 10) {
			int recoveryActuary = recovery;
			System.out.println(recovery + "MP回復した");
			System.out.println("現在のMPは" + (recovery + this.mp) +"です");
			return recoveryActuary;
		}else {
			int recoveryActuary = this.MAXMP - this.mp;
			System.out.println((this.MAXMP - this.mp) + "MP回復した");
			System.out.println("MPが最大まで回復した");
			return recoveryActuary;
		}
	}
}
