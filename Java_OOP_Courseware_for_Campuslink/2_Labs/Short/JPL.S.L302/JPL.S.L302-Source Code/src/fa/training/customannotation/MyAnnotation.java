/**
 * 
 */
package fa.training.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Create a custom annotation
 * 
 * @author hoabt2
 *
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
public @interface MyAnnotation {
	int value();
}
