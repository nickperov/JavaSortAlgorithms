package com.nickperov.stud.sort.algorithms;

public class CombSorter extends Sorter {

	private final double factor = 1.247330950103979d;

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length;
		int i;
		int gap = size;
		int flag;
		while (true) {
			flag = 0;
			i = 0;
			if (gap > 1) {
				gap = (int) (gap / this.factor);
			}
			while (i + gap < size) {
				if (this.list[i] > this.list[i + gap]) {
					final int temp = this.list[i];
					this.list[i] = this.list[i + gap];
					this.list[i + gap] = temp;
					flag = 1;
				}
				i++;
			}
			if (gap == 1 && flag == 0) {
				break;
			}
		}
	}
}