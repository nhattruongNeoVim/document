/**
 * 
 */
package fa.training.hashsetdemo.test;

import fa.training.hashsetdemo.HashSetCreationExample;
import fa.training.hashsetdemo.HashSetIterationExample;
import fa.training.hashsetdemo.HashSetRemoveElementExample;
import fa.training.hashsetdemo.HashSetRetrieveElementExample;

/**
 * @author hoabt2
 *
 */
public class TestHashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSetCreationExample hashSetCreation = new HashSetCreationExample();
		HashSetRetrieveElementExample hashSetElements = new HashSetRetrieveElementExample();
		HashSetRemoveElementExample hashSetRemove = new HashSetRemoveElementExample();
		HashSetIterationExample hashSetIterator = new HashSetIterationExample();
		hashSetCreation.createHashSet();
		hashSetElements.retrieveElements();
		hashSetRemove.removeElements();
		hashSetIterator.hashSetIterator();
	}
}
