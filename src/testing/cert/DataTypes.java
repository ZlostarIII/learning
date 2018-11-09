package testing.cert;

public class DataTypes {

	public static void main(String[] args) {

		byte[] buf = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// @formatter:off
		
		// 56 should be max
		long l = ((buf[0] & 0xFFL) << 104) |
				 ((buf[0] & 0xFFL) << 96) |
				 ((buf[0] & 0xFFL) << 88) |
				 ((buf[0] & 0xFFL) << 80) |
				 ((buf[0] & 0xFFL) << 72) |
				 ((buf[0] & 0xFFL) << 64) |
				 ((buf[0] & 0xFFL) << 56) |
		         ((buf[1] & 0xFFL) << 48) |
		         ((buf[2] & 0xFFL) << 40) |
		         ((buf[3] & 0xFFL) << 32) |
		         ((buf[4] & 0xFFL) << 24) |
		         ((buf[5] & 0xFFL) << 16) |
		         ((buf[6] & 0xFFL) <<  8) |
		         ((buf[7] & 0xFFL) <<  0);
		
		System.out.println(l);
		// @formatter:off
		
	}
}
