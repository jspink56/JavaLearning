package com.synbin.javalearning;
// Created by John on 06-Nov-17


public class Demo {

	// variables - mutable (can be changed)
	static int lives = 3;
	static String playerName = "John";
	static boolean gameOver;                // false by default

	static final int LEVEL_COUNT = 4;		// immutable (constant), cannot be changed

	public static void main(String[] args) {

		System.out.println("player " + playerName + " has " + lives + " lives left");

		lives += 2;
		playerName += " Spink";
		System.out.println("player " + playerName + " has " + lives + " lives left");
		System.out.println("gameOver = " + gameOver);

		System.out.println("player " + playerName + " needs to complete " + LEVEL_COUNT + " levels");

		gameOver = true;
		System.out.println("gameOver = " + gameOver);
	}
}
