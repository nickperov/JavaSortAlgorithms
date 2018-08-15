package com.nickperov.stud.sort.algorithms;

public class InsertionSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length;
		int i = 1;
		int j;

		int temp;

		while (i < size) {
			temp = this.list[i];
			j = i - 1;
			while (j >= 0 && this.list[j] > temp) {
				this.list[j + 1] = this.list[j];
				j--;
			}
			this.list[j + 1] = temp;
			i++;
		}
	}
}
