package com.ghost.PredefinedFunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 
 * @author akshayp Predefine Functional Interface - Function. Takes 2 Parameter
 *         once as input and one as output- Method apply(T). 
 *         Function Chaining
 *         Function1.andThen(Function2).apply() : Function1 will get execute
 *         first and then Function 2; 
 *         Function1.compose(Function2).apply() :
 *         Function2 will get execute first and then Function 1;
 *
 */
public class FunctionTest {

	public static void main(String[] args) {

		/************** Square Function Start ***********************/
		// T : Input Parameter
		// R: Output Parameter
		// Function<T, R>
		Function<Integer, Integer> F1 = I -> I * I;
		System.out.println("Square " + F1.apply(5));

		/************** Square Function End ***********************/

		/**************
		 * Length/Upparcase of String Function Start
		 ***********************/

		Function<String, Integer> F2 = S -> S.length();
		System.out.println("Length " + F2.apply("Ghost"));

		Function<String, String> F3 = S -> S.toUpperCase();
		System.out.println("Upparcase " + F3.apply("ghost"));

		/************** Length/Upparcase of String Function End ***********************/

		/************** Student Grade Function Start ***********************/

		Student[] studentList = { new Student("Ghost", 30, 85), new Student("ABC", 29, 65), new Student("yyy", 28, 55),
				new Student("TTT", 27, 40), new Student("Xxx", 25, 30) };

		Function<Student, String> F4 = S -> {

			if (S.getMarks() > 80)
				return "A[DISTINCTION]";
			else if (S.getMarks() > 60)
				return "FC";
			else if (S.getMarks() > 50)
				return "SC";
			else if (S.getMarks() > 35)
				return "TC";
			else
				return "Failed";
		};

		// Show Student with grade who get marks >60
		Predicate<Student> P = S -> S.getMarks() > 60;

		for (Student student : studentList) {

			if (P.test(student)) {
				System.out.println("Name " + student.getName());
				System.out.println("Marks" + student.getMarks());
				System.out.println("Grade " + F4.apply(student));
				System.out.println("");
			}
		}
		/************** Student Grade Function End ***********************/

		// Function Chaining
		// Function1.andThen(Function2).apply() : Function1 will get execute first and
		// then Function 2;
		// Function1.compose(Function2).apply() : Function2 will get execute first and
		// then Function 1;
		Function<Integer, Integer> F6 = I -> 2 * I;

		Function<Integer, Integer> F7 = I -> I * I * I;

		System.out.println("Function Chain " + F6.andThen(F7).apply(2));
		System.out.println("Function Chain " + F6.compose(F7).apply(2));
	}
}
