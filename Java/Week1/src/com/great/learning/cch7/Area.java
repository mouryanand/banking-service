package com.great.learning.cch7;

public class Area {
	final float pi = 22 / 7;
	public float radius, result;

	public static void main(String[] args) {
		Area area = new Area();
		area.radius = 12.2f;
		area.result = area.pi * area.radius * area.radius;
		System.out.println("The are of the circle is: " + area.result + " cm2");
	}
}
