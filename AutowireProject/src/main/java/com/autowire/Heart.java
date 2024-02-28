package com.autowire;

public class Heart {

	private String numOfHeart;
	private String nameOfAnimal;

	public String getNumOfHeart() {
		return numOfHeart;
	}

	public void setNumOfHeart(String numOfHeart) {
		this.numOfHeart = numOfHeart;
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public void showHeart() {
		System.out.println("Heart is pumping");
		System.out.println("name of animal is ::"+ nameOfAnimal);
	}

}
