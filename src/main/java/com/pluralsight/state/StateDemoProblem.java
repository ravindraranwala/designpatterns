package com.pluralsight.state;

public class StateDemoProblem {

	public static void main(String[] args) {
		FanProblem fan = new FanProblem();

		System.out.println(fan);

		fan.pullChain();

		System.out.println(fan);

		fan.pullChain();

		System.out.println(fan);

	}

}
