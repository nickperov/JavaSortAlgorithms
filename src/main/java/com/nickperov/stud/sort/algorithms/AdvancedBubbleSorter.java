package com.nickperov.stud.sort.algorithms;

public class AdvancedBubbleSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length - 1;

		int flag;
		int min;

		for (int i = 0; i < size; i++) {
			flag = 0;
			min = i;
			for (int j = i; j < size - i; j++) {
				if (this.list[j] > this.list[j + 1]) {
					final int temp = this.list[j];
					this.list[j] = this.list[j + 1];
					this.list[j + 1] = temp;
					flag = 1;
				}
				if (this.list[j] < this.list[min]) {
					min = j;
				}
			}
			if (flag == 0) {
				break;
			}

			if (min != i) {
				final int temp = this.list[i];
				this.list[i] = this.list[min];
				this.list[min] = temp;
			}
		}
	}
}