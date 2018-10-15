package testing.stuff;

public class BinGaps {
	public static void main(String[] args) {
		System.out.println(solution(32));
	}

	private static int solution(int n) {

		String binRep = Integer.toBinaryString(n);
		
		System.out.println(binRep);
		
		int currentItr = 0;
		int maxZeroSeq = 0;
		
		for (int index = 0; index < binRep.length(); index++) {
			if (binRep.charAt(index) == '0') {
				++currentItr;
			} else if(binRep.charAt(binRep.length()-1) != '1') {
				currentItr = 0;
			} else {
				maxZeroSeq = Math.max(maxZeroSeq, currentItr);
				currentItr = 0;
			}
		}
		
		return Math.max(maxZeroSeq, currentItr);
	}
}
