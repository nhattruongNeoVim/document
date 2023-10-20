/**
 * 
 */
package fa.training.customannotation;

/**
 * @author hoabt2
 *
 */
public class AnnotationMarker {

	public void method1() {
		System.out.println("method1 is invoked.");
	}

	@MyMarker
	public void method2() {
		System.out.println("method2 is invoked.");
	}

	public void method3() {
		System.out.println("method3 is invoked.");
	}

	@MyMarker
	public void method4() {
		System.out.println("method4 is invoked.");
	}
}
