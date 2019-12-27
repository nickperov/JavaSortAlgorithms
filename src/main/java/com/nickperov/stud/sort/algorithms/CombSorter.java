package com.nickperov.stud.sort.algorithms;

public class CombSorter extends Sorter {

	private final double factor = 1.247330950103979d;

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length;
		int i;
		int gap = size;
		boolean flag;
		do {
			flag = false;
			i = 0;
			if (gap > 1) {
				gap = (int) (gap / this.factor);
			}
			while (i + gap < size) {
				flag = swapElements(i, gap, flag);
				i++;
			}
		} while (gap != 1 || flag);
	}
}