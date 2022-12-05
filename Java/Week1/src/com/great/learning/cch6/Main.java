package com.great.learning.cch6;

public class Main {

	public static void main(String[] args) {
		// create boxes using the various
		// constructors
		ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7);
		ThreeDimensionShape shape2 = new ThreeDimensionShape();
		ThreeDimensionShape shape3 = new ThreeDimensionShape(8);
		double volume;
		// get volume of first box
		volume = shape1.volume();
		System.out.println(" Volume of shape1 is " + volume);
		// get volume of second box
		volume = shape2.volume();
		System.out.println(" Volume of shape2 is " + volume);
		// get volume of cube
		volume = shape3.volume();
		System.out.println(" Volume of shape3 is " + volume);

	}

}
