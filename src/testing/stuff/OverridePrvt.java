/**
 * 
 */
package testing.stuff;

import testing.stuff.Base.Derived2;

/**
 * @author Vladimir_Saev
 *
 */
public class OverridePrvt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base base = new Base();
		Derived2 der = base.new Derived2();

//		der.fun();

		// base.fun() calls Outer's fun (No run-time polymorphism).
		base = der;
//		base.fun();

	}
}
