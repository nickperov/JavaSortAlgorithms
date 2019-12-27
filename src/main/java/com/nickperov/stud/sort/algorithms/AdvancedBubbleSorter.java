package com.nickperov.stud.sort.algorithms;

public class AdvancedBubbleSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length - 1;

		boolean flag;
		int min;

		for (int i = 0; i < size; i++) {
			flag = false;
			min = i;
			for (int j = i; j < size - i; j++) {
				flag = swapElements(j, flag);
				if (this.list[j] < this.list[min]) {
					min = j;
				}
			}
			if (!flag) {
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