package com.nickperov.stud.sort.algorithms;

public class StupidSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {

		final int size = this.list.length - 1;
		int i = 0;
		while (i < size) {
			if (this.list[i] > this.list[i + 1]) {
				final int temp = this.list[i];
				this.list[i] = this.list[i + 1];
				this.list[i + 1] = temp;
				i = 0;
			} else {
				i++;
			}
		}
	}
}