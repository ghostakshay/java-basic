package com.ghost.functionalInterfaceTest;

/**
 * 
 * @author akshayp
 *Note:
 *@FunctionalInterface - Use to define Interface as FunctionInterface.
 *It should contain only one abstract method.
 *It can contain any number of default and static methods.
 *
 */
@FunctionalInterface
public interface ParentInterface {
	
	
	public void demo();
	
	public default void displaydefault() {
	      System.out.println("display default method of Parent Interface");
	   }
	public static void displaystatic() {
	      System.out.println("display static Method from Parent Interface");
	   }

}
