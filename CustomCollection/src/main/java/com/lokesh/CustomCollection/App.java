package com.lokesh.CustomCollection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyList<Integer> list = new MyList<>();
    	 
        //Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
         
        //Removing elements based on index
        list.remove(2);
        System.out.println(list);
         
        //Get element with index
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println(list.size());
    }
}
