package com.nickperov.stud.sort.algorithms;

public class ShellSorter extends Sorter {

	private final int[] gapArray = {1750, 701, 301, 132, 57, 23, 10, 4, 1};

	@Override
	public void makeSort(final boolean trace) {

		final int size = this.list.length;
		int i, j, temp;

		for (final int gap : this.gapArray) {

			i = gap;

			while (i < size) {
				temp = this.list[i];
				j = i - gap;
				while (j >= 0 && this.list[j] > temp) {
					this.list[j + gap] = this.list[j];
					j -= gap;
				}
				this.list[j + gap] = temp;
				i++;
			}
		}
	}
}
