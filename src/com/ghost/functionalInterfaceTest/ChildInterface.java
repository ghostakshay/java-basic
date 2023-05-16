package com.ghost.functionalInterfaceTest;

/**
 * 
 * @author akshayp
 * ChildInterface is FunctionalInterface if is not declare any
 * new abstract method when it extends one functional interface.
 * 
 * Child Interface does not have access for static methods from parent interface.
 * Class implements child interface have access for default methods from parent interface.
 * 
 *Note:
 *@FunctionalInterface - Use to define Interface as FunctionInterface.
 *It should contain only one abstract method.
 *It can contain any number of default and static methods.
 *
 */
@FunctionalInterface
public interface ChildInterface extends ParentInterface {
	
	

}
