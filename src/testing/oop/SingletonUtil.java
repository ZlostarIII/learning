package testing.oop;

/**
 * @author Vladimir_Saev
 *	
 *	-XX:+PrintCompilation
	-verbose:gc
	-XX:+PrintGCDetails
	-XX:-PrintGCTimeStamps
 */
public class SingletonUtil {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Singleton.getInst().show();
		
		System.out.println(Runtime.getRuntime().totalMemory());
	}
	
}
