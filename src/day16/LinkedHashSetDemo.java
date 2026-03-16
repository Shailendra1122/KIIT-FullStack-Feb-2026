package day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetDemo {
public static void main(String[] args)		//maintain order and no duplicates
{

	Set<String> names=new LinkedHashSet();
	names.add("Alice");
	names.add("Tom");
	names.add("Frank");
	names.add("David");
	names.add(null);
	
	System.out.println(names);

	
	
	}
}
