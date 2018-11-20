package com.ossez.lang.tutorial.overview;

/**
 * Java Tutorial Enums
 * 
 * @author YuCheng
 *
 */
class FreshJuice {
	enum FreshJuiceSize {
		SMALL, MEDIUM, LARGE
	}

	FreshJuiceSize size;
}

public class FreshJuiceEnums {
	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size: " + juice.size);
	}
}