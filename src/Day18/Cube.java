//Program to demonstrate Functional Interface

package Day18;

@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}