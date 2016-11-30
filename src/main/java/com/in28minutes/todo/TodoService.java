package com.in28minutes.todo;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class TodoService {

    // changed from HashMap to TreeMap, which automatically sorts todos by keys
    private static TreeMap<Integer, List<String>> todos = new TreeMap<>(); 
    //  private static List<Todo> todos = new ArrayList<>();
    
    static {
        todos.put(1, Arrays.asList("Learn web app development", "Study"));
        todos.put(2, Arrays.asList("Learn Spring MVC", "Study"));
        todos.put(3, Arrays.asList("Dance salsa", "Exercise"));
        
//        todos.add(new Todo("Learn web app development", 0));
//        todos.add(new Todo("Learn Spring MVC", 1));
//        todos.add(new Todo("Learn Spring REST services", 2));
    }
    
    public TreeMap<Integer, List<String>> retrieveTodos() { 
        return todos;                   
    }
       
    public TreeMap<Integer, List<String>> addTodo(int id, String name, String category) {
        todos.put(id, Arrays.asList(name, category));
        return todos;
    }
        
    public TreeMap<Integer, List<String>> deleteTodo(int id) {
        todos.remove(id);
        return todos;
    }
    
//  public List<Todo> retrieveTodos() {
//  return todos;
//}
    
//  public List<Todo> addTodo(Todo todo) {
//  todos.add(todo);
//  return todos;
//}
    
//    public List<Todo> deleteTodo(Todo todo) {
//        todos.remove(todo);
//        return todos;
//    }
}
