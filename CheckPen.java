package com.xworkz.collectionapp.pens;

import com.xworkz.collectionapp.pens.dto.Pen;

public class CheckPen {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Pen pen = new Pen();
		pen.setBrand("Cello");
		pen.setMaterial("Metal");
		pen.setTypeOfPen("BallPen");
		pen.setColor("Blue");
		pen.setPrice(140.0f);
		
		Object obj = pen.clone();
		Pen pen1 = (Pen)obj;
		System.out.println(pen1.toString());
	}
}
