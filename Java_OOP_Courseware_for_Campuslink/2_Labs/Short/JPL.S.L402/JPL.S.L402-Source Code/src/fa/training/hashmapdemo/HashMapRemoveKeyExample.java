/**
 * 
 */
package fa.training.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Examples of how to remove key from HashMap
 * 
 * @author hoabt2
 *
 */
public class HashMapRemoveKeyExample {

	/**
	 * Remove keys from HashMap
	 * 
	 */
	public void removeKeys() {
		
		System.out.println("removeKeys() !!!");
		
		Map<String, String> husbandWifeMapping = new HashMap<>();
		husbandWifeMapping.put("Jack", "Marie");
		husbandWifeMapping.put("Chris", "Lisa");
		husbandWifeMapping.put("Steve", "Jennifer");

		System.out.println("Husband-Wife Mapping : " + husbandWifeMapping);

		// Remove a key from the HashMap
		// Ex - Unfortunately, Chris got divorced. Let's remove him from the mapping
		String husband = "Chris";
		String wife = husbandWifeMapping.remove(husband);

		System.out.println("Couple (" + husband + " => " + wife + ") got divorced");
		System.out.println("New Mapping : " + husbandWifeMapping);

		// Remove a key from the HashMap only if it is mapped to the given value
		// Ex - Divorce "Jack" only if He is married to "Linda"
		boolean isRemoved = husbandWifeMapping.remove("Jack", "Linda");
		System.out.println("Did Jack get removed from the mapping? : " + isRemoved);

		// remove() returns null if the mapping was not found for the supplied key
		wife = husbandWifeMapping.remove("David");
		if (wife == null) {
			System.out.println("Looks like David is not married to anyone");
		} else {
			System.out.println("Removed David and his wife from the mapping");
		}
	}
}
