import java.util.*;
import java.util.stream.*;

public class FindDuplicateInArr
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int[] arr = {1,23,4,2,44,24,1,32,44,23};
		System.out.println(duplicates(arr));
	}
	
	public static Set<Integer> duplicates(int[] nums) {
	    List<Integer> l = Arrays.stream(nums)
	    .boxed()
	    .collect(Collectors.toList());
	    
	    return l.stream().filter(e -> Collections.frequency(l, e) > 1)
	    .collect(Collectors.toSet());
	}
}