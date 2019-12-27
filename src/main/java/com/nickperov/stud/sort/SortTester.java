package com.nickperov.stud.sort;

import com.nickperov.stud.sort.algorithms.Sorter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortTester {

	private static List<Sorter> sorters;

	private enum sorterTypes {
		//StupidSorter,
		BubbleSorter,
		ShakerSorter,
		SelectionSorter,
		AdvancedBubbleSorter,
		OddEventSorter,
		CombSorter,
		GnomSorter,
		InsertionSorter,
		ShellSorter
	}


	public static void main(final String[] args) {

		final boolean trace = false;
		final int[] list = generateList(100000);

		if (trace) {
			System.out.println("Unsorted array");
			for (final int i : list) {
				System.out.println(i);
			}
		}

		createSorters();

		for (final Sorter st : sorters) {
			st.setSourse(list.clone());
			st.sort(trace);
			final int[] sortedList = st.getResult();

			// Validation
			makeValidation(list.clone(), sortedList.clone());

			if (trace) {
				System.out.println("Sorted array");
				for (final int i : sortedList) {
					System.out.println(i);
				}
			}
		}
	}

	private static void makeValidation(final int[] origList, final int[] sortedList) {

		if (origList == null && sortedList == null) {
			System.out.println("Null array!!!");
			return;
		}

		if (origList.length != sortedList.length) {
			System.out.println("Wrong length!!!");
			System.out.println("Original array: " + origList.length);
			System.out.println("Sorted array: " + sortedList.length);
			return;
		}

		for (int k = 0; k < sortedList.length - 1; k++) {
			if (sortedList[k] > sortedList[k + 1]) {
				System.out.println("Error in sorted array!!!");
				System.out.println("Element[" + k + "]: " + sortedList[k] + " > Element[" + (k + 1) + "]: " + sortedList[k + 1]);
				return;
			}
		}

		for (int k = 0; k < origList.length; k++) {
			int i = 0;
			boolean flag = false;
			while (i < sortedList.length) {
				if (sortedList[i] == origList[k]) {
					sortedList[i] = -1;
					flag = true;
					break;
				}
				i++;
			}
			if (!flag) {
				System.out.println("Element not found in sorted array!!!");
				System.out.println("Element[" + k + "]: " + origList[k]);
			}
		}

		System.out.println("Validation successful");
	}

	private static int[] generateList(final int size) {

		System.out.println("Creating of array size: " + size);

		final int[] list = new int[size];
		final Random random = new Random();
		for (int i = 0; i < size; i++) {
			list[i] = random.nextInt(10000);
		}

		return list;
	}


	private static void createSorters() {
		sorters = new ArrayList<>();
		Class<?> sorterClass;
		Constructor<?> sortConstr;
		for (final sorterTypes st : sorterTypes.values()) {
			try {
				sorterClass = Class.forName("com.nickperov.stud.sort.algorithms." + st.name());
				sortConstr = sorterClass.getConstructor();
				final Sorter sorter = (Sorter) sortConstr.newInstance();
				sorters.add(sorter);
			} catch (final ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
					| IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}