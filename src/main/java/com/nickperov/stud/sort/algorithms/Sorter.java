package com.nickperov.stud.sort.algorithms;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Sorter {

	int[] list;
	long stTime;
	SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss.SSS");


	void startTrace() {
		final Date startTime = new Date();
		this.stTime = startTime.getTime();
		System.out.println("Start " + this.getClass().getName() + " start time: " + this.df.format(startTime));
	}

	void finishTrace() {
		final Date finisTime = new Date();
		final long fnTime = finisTime.getTime();
		final long timeDelta = fnTime - this.stTime;
		System.out.println(
				"Finish " + this.getClass().getName() + " finish time: " + this.df.format(finisTime) + "; time elapsed: " + timeDelta
						+ " Ms");
	}

	public void setSourse(final int[] list) {
		this.list = list;
	}

	public int[] getResult() {
		return this.list;
	}

	public void sort(final boolean trace) {
		startTrace();
		makeSort(trace);
		finishTrace();
	}

	public void makeSort(final boolean trace) {

	}

	boolean swapElements(final int j, final boolean prevFlag) {
		return swapElements(j, 1, prevFlag);
	}

	boolean swapElements(final int j, final int gap, final boolean prevFlag) {
		if (this.list[j] > this.list[j + gap]) {
			final int temp = this.list[j];
			this.list[j] = this.list[j + gap];
			this.list[j + gap] = temp;
			return true;
		}
		return prevFlag;
	}
}