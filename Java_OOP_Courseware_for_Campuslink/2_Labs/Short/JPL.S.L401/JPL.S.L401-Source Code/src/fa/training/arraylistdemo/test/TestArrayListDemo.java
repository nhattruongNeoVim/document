/**
 * 
 */
package fa.training.arraylistdemo.test;

import fa.training.arraylistdemo.ArrayListAccessElementExample;
import fa.training.arraylistdemo.ArrayListCreationExample;
import fa.training.arraylistdemo.ArrayListRemoveElementExample;

/**
 * @author hoabt2
 *
 */
public class TestArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayListCreationExample elementCreation = new ArrayListCreationExample();
		ArrayListAccessElementExample elementAccess = new ArrayListAccessElementExample();
		ArrayListRemoveElementExample elementRemove = new ArrayListRemoveElementExample();
		elementCreation.createArrayList();
		elementAccess.accessElement();
		elementRemove.removeElements();
	}
}
