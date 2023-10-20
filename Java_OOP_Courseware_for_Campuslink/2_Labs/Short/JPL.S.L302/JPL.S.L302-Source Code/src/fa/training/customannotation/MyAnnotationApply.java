/**
 * 
 */
package fa.training.customannotation;

/**
 * Show how to apply MyAnnotation
 * 
 * @author hoabt2
 *
 */
public class MyAnnotationApply {
	
	@MyAnnotation(value = 100)
	public void greeting() {
		System.out.println("Greeting() from MyAnnotationApply");
	}
}
