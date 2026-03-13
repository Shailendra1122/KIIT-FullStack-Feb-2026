package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIDemo {

	public static void main(String[] args) {
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		Map<Boolean,List<String>> hashmap=months.stream().collect(Collectors.partitioningBy(month->month.length()>=5));
		//System.out.println(hashmap);
		System.out.println(hashmap.get(true));
		
		
		months.stream().collect(Collectors.partitioningBy(month->month.length()>=5));
		
//		Map<Integer,List<String>> groupByLength=months.stream().collect(Collectors.groupingBy(month->month.length()));
//		Map<Integer,List<String>> groupByLength=months.stream().collect(Collectors.groupingBy(String::length));
		Map<Integer,List<String>> groupByLength=months.stream().collect(Collectors.groupingBy(StreamAPIDemo::getMonthLength));

		System.out.println(groupByLength);
		System.out.println(groupByLength.values());
	}
	
	public static int getMonthLength(String month)
	{
		return month.length();
	}

}
