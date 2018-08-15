package com.nickperov.stud.sort.algorithms;

public class ShakerSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length - 1;
		int startPos;
		int flag;

		boolean direction = true;

		for (int i = 0; i < size; i++) {
			flag = 0;
			startPos = i;
			for (int k = 0; k < 2; k++) {
				for (int j = startPos; j < size - i; j++) {
					if (direction && (this.list[j] > this.list[j + 1])) {
						final int temp = this.list[j];
						this.list[j] = this.list[j + 1];
						this.list[j + 1] = temp;
						flag = 1;
					} else if (!direction && (this.list[size - j] < this.list[size - j - 1])) {
						final int temp = this.list[size - j];
						this.list[size - j] = this.list[size - j - 1];
						this.list[size - j - 1] = temp;
						flag = 1;
					}
				}
				if (flag == 0) {
					break;
				}
				direction = !direction;
				startPos++;
			}
		}
	}
}