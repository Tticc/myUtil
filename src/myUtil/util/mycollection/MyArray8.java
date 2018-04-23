package myUtil.util.mycollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MyArray8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] k = concatArray(Arrays.asList(new int[] {2,3},new int[] {1,5},new int[] {8,4}));
		IntStream.of(k).forEach(e -> System.out.print(e+","));
		//opmijs
		

	}
	
	/**
	 * concat int array, using java8 grammer.
	 * param listOfArrays is a list of int[] that you want to concat into one array.
	 * @param listOfArrays
	 * @return
	 */
	public static int[] concatArray(List<int[]> listOfArrays) {
		return listOfArrays.stream().flatMapToInt(arr -> IntStream.of(arr)).toArray();
	}

}
