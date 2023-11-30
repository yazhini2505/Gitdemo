package testNGtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class javastreamlist {
	//@Test
	public void regular()
	{
	
	
	
	ArrayList<String> names=new ArrayList<String>();
	names.add("aaa");
	names.add("bbb");
	names.add("ajhaj");
	names.add("aaa");
	names.add("bbb");
	names.add("ajhaj");
	int count=0;
	for(int i=0;i<names.size();i++)
	{
		String name=names.get(i);
		if(name.startsWith("a"))
		{
			count++;
		}
	}
	System.out.println(count);		
	
	}
	//@Test
	public void regularstream()
	{

		ArrayList<String> names=new ArrayList<String>();
		names.add("aaa");
		names.add("bbb");
		names.add("ajhaj");
		names.add("aaa");
		names.add("bbb");
		names.add("ajhaj");
		//no life for intermediate op if there is no terminal op
		//create stream and use condition
		long c=names.stream().filter(s->s.startsWith("a")).count();
		System.out.println(c);
		//import data into stream
		long d=Stream.of("ohgashdg","jdshd","ss","agj").filter(s->
		{
			s.startsWith("a");
			return true;
		}).count();
		System.out.println(d);
		//print all the elements in the stream
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//display only one reesult
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
	}
	//@Test //to display the names end with i in UPPERCASE
	public void streamap()
	{
		Stream.of("ananya","balaji","nayeli","yazhini","ptiyanka").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
				.forEach(s->System.out.println(s));
		//System.out.println(foo);
		//display all the data in uppercase
		Stream.of("ananya","balaji","nayeli","yazhini","ptiyanka").map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		//print name which have first letter as with uppercase and sorted
		//convert arrays to list  
		List<String> nam=Arrays.asList("ananya","abalaji","anayeli","yazhini","ptiyanka");
		
		nam.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
	//@Test //combine and sort(merge two list)
	public void concattwostrams()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("aaa");
		names.add("bbb");
		names.add("ajhaj");
		names.add("a");
		names.add("bbb");
		names.add("ajhaj");
		
		List<String> nam=Arrays.asList("ananya","abalaji","anayeli","yazhini","ptiyanka");
		//combine stream one and two and sort it
		Stream<String> newstream=Stream.concat(names.stream(),nam.stream());
		//newstream.sorted().forEach(s->System.out.println(s));
		
		//element present return true or false
		boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("a")); 
		//return treu or false
		System.out.println(flag);
		Assert.assertTrue(flag); //pass or fail
		
	}
	@Test
	public void streamcollect()
	{
		//list->modify to stream and do manipulations->results will be back in new list
		List<String> ls=Stream.of("ahjgdh","hghd","jshdhg","bshdha","huiyuh").filter(s->s.endsWith("h")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0)); //print first arguement
		//without list we want only one valuse using limit(1)
		
		
		//assignment 1
		List<Integer> array=Arrays.asList(3,4,5,2,1,5,6,7,9,12,43);
		//print unique number and sorted
		List<Integer> ar1=array.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ar1.get(2)); // to get the particular value using index
	}
	
}
