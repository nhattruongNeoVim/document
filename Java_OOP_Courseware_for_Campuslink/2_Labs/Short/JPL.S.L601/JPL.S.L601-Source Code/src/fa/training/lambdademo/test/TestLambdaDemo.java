/**
 * 
 */
package fa.training.lambdademo.test;

import fa.training.lambdademo.FunctionalInterfaceExample;
import fa.training.lambdademo.SortingLambdaExample;

/**
 * @author hoabt2
 *
 */
public class TestLambdaDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortingLambdaExample sortLambda = new SortingLambdaExample();
		FunctionalInterfaceExample funcInterface = new FunctionalInterfaceExample();
		sortLambda.showUserInfoSortByName();
		sortLambda.showUserInfoSortBySalary();
		sortLambda.showUserInfoSortBySalaryReverse();
		funcInterface.calculateSquare();
	}
}
