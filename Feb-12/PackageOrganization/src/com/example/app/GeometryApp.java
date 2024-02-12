package com.example.app;

import com.example.geometry.Circle;

public class GeometryApp{
	public static void main(String[] args) {
//		GeometryApp g = new GeometryApp();
		Circle c = new Circle(5);
		System.out.println(c.getRadius());
	}
}
