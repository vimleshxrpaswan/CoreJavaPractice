package exceptionhandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class transversingAnarray {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.add("Ravi"); //adding object in arraylist
        list.add("Rahul");
        list.add("Vimlesh");
        list.add("Vimlesh");
        list.add("Siddhesh");

        //Traversing list through Iterator
        Iterator<String> itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }

    }
}
