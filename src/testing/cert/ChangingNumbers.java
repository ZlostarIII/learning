package testing.cert;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChangingNumbers {

	int num = 100;
	Integer key;

	public ChangingNumbers() {
		super();
	}

	public ChangingNumbers(Integer key) {
		super();
		this.key = key;
	}

	public void calc(int num) {
		this.num = num * 10;
	}

	public void printNum() {
		System.out.println(num);
	}

	public synchronized void go() throws InterruptedException {
		Thread t1 = new Thread();
		t1.start();
		this.num = 1000;
		System.out.println(num);
//		t1.wait(5000);
		Thread.sleep(1000);
		System.out.println("2");
	}
	
	public synchronized void goAgain() throws InterruptedException {
		Thread t1 = new Thread();
		t1.start();
		this.num = 3000;
		System.out.println(num);
//		t1.wait(5000);
		Thread.sleep(1000);
		System.out.println("5");
	}

	public static void main(String[] args) throws ParseException {
		ChangingNumbers cn = new ChangingNumbers();
		cn.calc(2);
		cn.printNum();

		Map<ChangingNumbers, String> m = new HashMap<>();
		ChangingNumbers c1 = new ChangingNumbers(1);
		ChangingNumbers c2 = new ChangingNumbers(2);
		ChangingNumbers c3 = new ChangingNumbers(1);
		ChangingNumbers c4 = new ChangingNumbers(new Integer(2));
		ChangingNumbers c5 = (ChangingNumbers) c1;
		m.put(c1, "one");
		m.put(c2, "two");
		m.put(c3, "one again");
		m.put(c4, "two again");
		m.put(c5, "one one");
		System.out.println(m.size());

		String in = "1 a 10 . 100 1000";
		Scanner s = new Scanner(in);
		int a = 7;
		assert a != 0;
		String sc = "";
		for (int i = 0; i < 5; i++) {
			sc += s.next();
		}
		s.close();
		System.out.println(sc);

		try {
			new ChangingNumbers().go();
			new ChangingNumbers().goAgain();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" ...aaand interrupted");
		}
		
		String[] nums = new String[] { "111,222", "333,4444" };
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		for(String getNums : nums) {
			System.out.println(nf.parse(getNums));
		}
		
		List<String> items = new ArrayList<>();
		items.add("pen");
		items.add("penci");
		items.add("box");
		for(String item : items) {
			if(item.indexOf("p") == 0) {
				continue;
			} else {
				System.out.println(item);
			}
		}
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(((ChangingNumbers) obj).key);
		System.out.println(this.key);
		return ((ChangingNumbers) obj).key == this.key;
	}

}
