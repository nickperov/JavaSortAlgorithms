package com.nickperov.stud.sort.algorithms;

public class GnomSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length - 1;
		int i = 0;
		int pos = 0;
		while (i < size) {

			if (this.list[i] > this.list[i + 1]) {
				if (pos == 0) {
					pos = i;
				}

				final int temp = this.list[i];
				this.list[i] = this.list[i + 1];
				this.list[i + 1] = temp;
				if (i != 0) {
					i--;
				} else {
					i = pos + 1;
				}
			} else {
				i++;
			}
		}
	}
}