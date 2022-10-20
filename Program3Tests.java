package dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Program3Tests {

	@Test
	void testFinalAlgorithm1() {
		Problem3 ob = new Problem3();
		int[] arr = { 0, 1, 5, 8, 14, 18, 44, 81, 89, 99, 102 };
		assertEquals(2, ob.finalAlgorithm(arr, 10, 20));
	}

	@Test
	void testFinalAlgorithm2() {
		Problem3 ob = new Problem3();
		int[] arr = { 1, 3, 5, 7, 9 };
		assertEquals(3, ob.finalAlgorithm(arr, 3, 7));
	}

	@Test
	void testFinalAlgorithm3() {
		Problem3 ob = new Problem3();
		int[] arr = { 2, 4, 6, 7, 8, 15, 19 };
		assertEquals(2, ob.finalAlgorithm(arr, 4, 6));
	}

	@Test
	void testFinalAlgorithm4() {
		Problem3 ob = new Problem3();
		int[] arr = { 0, 4, 6, 9, 12, 16, 17, 19, 25, 50 };
		assertEquals(3, ob.finalAlgorithm(arr, 12, 18));
	}
	@Test
	void testFinalAlgorithm5() {
		Problem3 ob = new Problem3();
		int[] arr = {  4, 6, 9, 12, 16, 17, 19, 25, 50 };
		assertEquals(6, ob.finalAlgorithm(arr, 0, 18));
	}
	@Test
	void testFinalAlgorithm6() {
		Problem3 ob = new Problem3();
		int[] arr = { 0, 4, 6, 9, 12, 16, 17, 19, 25, 50 };
		assertEquals(6, ob.finalAlgorithm(arr, 12, 52));
	}
	@Test
	void testFinalAlgorithm7() {
		Problem3 ob = new Problem3();
		int[] arr = { 4, 6, 9, 12, 16, 17, 19, 25, 50 };
		assertEquals(9, ob.finalAlgorithm(arr, 0, 76));
	}
	@Test
	void testFinalAlgorithm8() {
		Problem3 ob = new Problem3();
		int[] arr = { 4, 6, 9, 12, 16, 17, 19, 25, 50 };
		assertEquals(2, ob.finalAlgorithm(arr, 13, 17));
	}
	@Test
	void testFinalAlgorithm9() {
		Problem3 ob = new Problem3();
		int[] arr = {  9, 12, 16, 17, 19, 25, 50 };
		assertEquals(0, ob.finalAlgorithm(arr, 1, 3));
	}
}
