package testing.cert;

import java.nio.ByteBuffer;

public class DataTypes {

	public static void main(String[] args) {

		byte[] buf = { 1, 2, 3, 4, 5, 6, 7, 8 };
		byte[] buf2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		// @formatter:off
		// 56 should be max
		// long is 64 bit
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
		
		l = 	 ((buf2[0] & 0xFFL) << 104) |
				 ((buf2[0] & 0xFFL) << 96) |
				 ((buf2[0] & 0xFFL) << 88) |
				 ((buf2[0] & 0xFFL) << 80) |
				 ((buf2[0] & 0xFFL) << 72) |
				 ((buf2[0] & 0xFFL) << 64) |
				 ((buf2[0] & 0xFFL) << 56) |
		         ((buf2[1] & 0xFFL) << 48) |
		         ((buf2[2] & 0xFFL) << 40) |
		         ((buf2[3] & 0xFFL) << 32) |
		         ((buf2[4] & 0xFFL) << 24) |
		         ((buf2[5] & 0xFFL) << 16) |
		         ((buf2[6] & 0xFFL) <<  8) |
		         ((buf2[7] & 0xFFL) <<  0);
		
		System.out.println(l);
		// @formatter:on

		System.out.println(convertToLong(buf));
		System.out.println(convertToLong(buf2));
		
		// byte is between -128 and 127
		int i = -65000;
		System.out.println((byte)(i >> 24));
		System.out.println((byte)(i >> 16));
		System.out.println((byte)(i >> 8));
		System.out.println((byte)(i >> 0));
		byte b = (byte) i;
		
		System.out.println(b);
	}

	public static long convertToLong(byte[] array) {
		ByteBuffer buffer = ByteBuffer.wrap(array);
		return buffer.getLong();
	}
}
