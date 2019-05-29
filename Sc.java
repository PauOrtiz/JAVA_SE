
import java.util.*; 
import java.util.stream.Stream; 

class Sc { 
	private static <T> void getStream(List<T> list) 
	{ 
		Stream<T> stream = list.stream(); 
		Iterator<T> it = stream.iterator(); 
		while (it.hasNext()) { 
			System.out.print(it.next() + " "); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		List<String> list = new ArrayList<>(); 
		list.add("Stream"); 
		list.add("de"); 
		list.add("Colecciones"); 
		getStream(list); 
	} 
} 
