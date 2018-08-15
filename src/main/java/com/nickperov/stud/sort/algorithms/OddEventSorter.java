package com.nickperov.stud.sort.algorithms;

public class OddEventSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length - 1;
		int flag;

		while (true) {
			flag = 0;
			for (int k = 0; k < 2; k++) {
				for (int j = k; j < size; j += 2) {
					if (this.list[j] > this.list[j + 1]) {
						final int temp = this.list[j];
						this.list[j] = this.list[j + 1];
						this.list[j + 1] = temp;
						flag = 1;
					}
				}
			}
			if (flag == 0) {
				break;
			}
		}
	}
}
