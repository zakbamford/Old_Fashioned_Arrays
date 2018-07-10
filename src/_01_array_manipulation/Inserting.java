package _01_array_manipulation;

public class Inserting {
	public static int[] insertAt(int[] arr, int place, int num) {
		int[] arr2 = new int[arr.length + 1];
		for (int i = 0; i < place; i++) {
			arr2[i] = arr[i];
		}
		arr2[place] = num;
		for (int i = place; i < arr2.length - 1; i++) {
			arr2[i + 1] = arr[i];
		}
		return arr2;
	}

	public static String[] insertAlphabetically(String[] arr, String str) {
		String[] arr2 = new String[arr.length + 1];
		int pos = 0;
		while (str.compareTo(arr[pos]) > 0 && pos < arr.length - 1) {
			pos++;
		}
		if (pos == arr.length - 1)
			pos++;
		arr2[pos] = str;
		for (int i = 0; i < pos; i++) {
			arr2[i] = arr[i];
		}
		for (int i = pos; i < arr2.length - 1; i++) {
			arr2[i + 1] = arr[i];
		}
		return arr2;
	}
}
