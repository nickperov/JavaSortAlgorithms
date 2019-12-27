package com.nickperov.stud.sort.algorithms;

public class BubbleSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length - 1;
		boolean flag;

		for (int i = 0; i < size; i++) {
			flag = false;
			for (int j = 0; j < size - i; j++) {
				flag = swapElements(j, flag);
			}
			if (!flag) {
				break;
			}
		}
	}
}