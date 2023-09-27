package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {

	 ArrayList<Integer> numberList = new ArrayList<Integer>();
	
	public ArrayListAssignment()
	{
		numberList.add(9);
	    numberList.add(16);
	    numberList.add(18);
	    numberList.add(36);
	    numberList.add(12);
	    numberList.add(36);
	    numberList.add(42);
	    numberList.add(87);
	    numberList.add(57);
	    numberList.add(97);
	}
	// Task 2
	public  void displayArrayList(ArrayList<Integer> lst)
	{
		
		for(Integer num : lst)
		{
			System.out.print(num + " ");
		}
	}
	// Task 3
	public  void addElement(int num)
	{
		numberList.add(num);
	}
	// Task 4
	public  void removeElement(int num)
	{
		numberList.remove(Integer.valueOf(num));
	}
	// Task 5
	public  void reverseArrayList()
	{
		 Collections.reverse(numberList);
	}
	// Task 6
    public  int findSum(ArrayList<Integer> lst)
	{
    	int sum = 0;
    	for(Integer num : lst)
		{
			sum += num;
		}
    	return sum;
			
	}
    // Task 7
    public  int findMaximum(ArrayList<Integer> lst)
    {
    	if(lst.isEmpty())
    	{   
    	  return -1;
    	}
    		
    	int maximum = lst.get(0);
    	for(Integer num : lst)
    	{
    		if(num > maximum)
    		{
    			maximum = num;
    		}
    	}
    		return maximum;
    	
    }
   // Task 7
    public  int findMinimum(ArrayList<Integer> lst)
    {
    	if(lst.isEmpty())
    	{   
    	  return -1;
    	}
    	
    	int minimum = lst.get(0);
    	for(Integer num : lst)
		{
			if(num < minimum)
			{
				minimum = num;
			}
		}
    	return minimum;
    }
    // Task 8 
    public void sortArrayList()
    {
    	Collections.sort(numberList);
    }
    // Task 10
    public int findElement(int num)
    {
    	return numberList.indexOf(num);
    }
    
    //  Task 11
    public void removeDuplicates() {
		ArrayList<Integer> uniqelemets = new ArrayList<>();
		for(Integer num : numberList) {
			if(!uniqelemets.contains(num)) {
				uniqelemets.add(num);
			}
		}
		numberList = uniqelemets;
	}
	
	
	
	//Task 12  
	public List<Integer> getSublist(int start, int end){
		return numberList.subList(start, end);
	}
    
    // Task 13
    public boolean isEmptyArrayList()
    {	
    	return numberList.isEmpty();
    }
    // Task 14
    public void replaceElement(int oldValue,int newValue)
    {
    	Collections.replaceAll(numberList, oldValue, newValue);
    }
    // Task 15
    public int countOccurrences(int val)
    {
    	return Collections.frequency(numberList, val);
    }
    // Task 16
    public void clearArrayList()
    {
    	numberList.clear();
    }
    // Task 17
    public int getArrayListSize()
    {
    	return numberList.size();
    }
    // Task 18
    public ArrayList<Integer> copyArrayList()
    {
    	ArrayList<Integer> cloneArrList = (ArrayList<Integer>) numberList.clone();
        return cloneArrList;
    }
    // Task 19
    public double findAverage()
    {
    	int sum = findSum(numberList);
    	
    	if(sum > 0)
    	{
    		double avg =(double)sum/numberList.size();
    		return avg;
    	}
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListAssignment obj = new ArrayListAssignment();
		
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		obj.addElement(21);
		System.out.println("Task 3");
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		obj.removeElement(21);
		System.out.println("Task 4");
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		System.out.println("Task 5");
		obj.reverseArrayList();
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		System.out.println("Task 6  : " + obj.findSum(obj.numberList) );
		
		System.out.println("Task 7 : " + obj.findMaximum(obj.numberList) );
		
		System.out.println("Task 7  : " + obj.findMinimum(obj.numberList) );
	
		System.out.println("Task 8 ");
		obj.sortArrayList();
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		System.out.println("Task 10  : " + obj.findElement(15) );
		System.out.println("Task 10 : " + obj.findElement(43) );
		

		System.out.println("TAsk 11");
		System.out.println(obj.getSublist(3, 6));
		
		System.out.println("Task 12");
		
		obj.removeDuplicates();
		
		System.out.println("Task 13  : " + obj.isEmptyArrayList() );
	
		obj.addElement(16);
	
		System.out.println("Task 14  : ");
		obj.replaceElement(16, 12);
		obj.displayArrayList(obj.numberList);
		System.out.println();
		
		System.out.println("Task 15  : " + obj.countOccurrences(87) );
		
//		System.out.println(" Task 16 : ");
//		obj.clearArrayList();
//		obj.displayArrayList(obj.numberList);
		
		System.out.println("Task 17  : " + obj.getArrayListSize() );
		System.out.println("Task 18 : " + obj.copyArrayList() );
		System.out.println("Task 18  : " + obj.findAverage() );
		
		
		
	}

}
