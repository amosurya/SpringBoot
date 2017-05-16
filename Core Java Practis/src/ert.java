import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ert {


		int i[] = {0};
		public static void main(String args[]) 
		{
		    CopyOnWriteArrayList<String> arrayList= new CopyOnWriteArrayList<>();
		    arrayList.add("aaaa");
		    arrayList.add("abbb");
		    arrayList.add("ccc");
		    arrayList.add("dd");
		    arrayList.add("affs");


		    Iterator<String> failSafeIterator = arrayList.iterator();
	        while(failSafeIterator.hasNext()){
	            System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
	            failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
	        }


		}
		public static void change_i(int i[]) 
		{
		      int j[] = {2};
		      i = j;
		}	
	        
	    
	

}
