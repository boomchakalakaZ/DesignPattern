/*
 * 	11/30/2018
 * 	Purpose is to learn to implement from class diagram with patterns.
 */

package Iteration2;

public class SaveEvaluationConcrete implements SaveInterface {
	
	public void save() {
		System.out.println(SaveInterface.saveMsg + " in SaveEvaluationConcrete");
	}

}
