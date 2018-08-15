package com.nickperov.stud.sort.algorithms;

public class BubbleSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length - 1;
		int flag;

		for (int i = 0; i < size; i++) {
			flag = 0;
			for (int j = 0; j < size - i; j++) {
				if (this.list[j] > this.list[j + 1]) {
					final int temp = this.list[j];
					this.list[j] = this.list[j + 1];
					this.list[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
	}
}