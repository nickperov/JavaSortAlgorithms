package com.nickperov.stud.sort.algorithms;

public class OddEventSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length - 1;
		boolean flag;

		do {
			flag = false;
			for (int k = 0; k < 2; k++) {
				for (int j = k; j < size; j += 2) {
					flag = swapElements(j, flag);
				}
			}
		} while (flag);
	}
}
