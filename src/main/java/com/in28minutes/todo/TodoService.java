package com.in28minutes.todo;

import java.util.TreeMap;

public class TodoService {

    // changed from HashMap to TreeMap, which automatically sorts todos by keys
    private static TreeMap<Integer, String> todos = new TreeMap<>(); 
    //  private static List<Todo> todos = new ArrayList<>();
    
    static {
        todos.put(1, "Learn web app development");
        todos.put(2, "Learn Spring MVC");
        todos.put(3, "Learn Spring REST services");
        
//        todos.add(new Todo("Learn web app development", 0));
//        todos.add(new Todo("Learn Spring MVC", 1));
//        todos.add(new Todo("Learn Spring REST services", 2));
    }
    
    public TreeMap<Integer, String> retrieveTodos() { 
        return todos;                   
    }
       
    public TreeMap<Integer, String> addTodo(int id, String name) {
        todos.put(id, name);
        return todos;
    }
        
    public TreeMap<Integer, String> deleteTodo(int id) {
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
