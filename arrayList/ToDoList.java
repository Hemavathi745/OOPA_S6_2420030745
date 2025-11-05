package arrayList;
import java.util.*;

public class ToDoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Buy groceries");
        tasks.add("Finish homework");
        tasks.add("Call mom");
        System.out.println("Task at index 1: " + tasks.get(1));
        tasks.remove("Finish homework");
        Collections.sort(tasks);
        System.out.println("Sorted To-Do List: " + tasks);
        System.out.println("Is the to-do list empty? " + tasks.isEmpty());

	}

}
