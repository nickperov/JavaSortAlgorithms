package com.nickperov.stud.sort.algorithms;

public class SelectionSorter extends Sorter {

	@Override
	public void makeSort(final boolean trace) {
		final int size = this.list.length;
		int counter = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (this.list[i] > this.list[j]) {
					counter++;
					if (trace) {
						System.out.println("Change " + i + " (" + this.list[i] + ") <-> " + j + " (" + this.list[j] + ")");
					}
					final int temp = this.list[i];
					this.list[i] = this.list[j];
					this.list[j] = temp;
				}
			}
		}
		if (trace) {
			System.out.println("Counter: " + counter);
		}
	}
}
