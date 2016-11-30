Simple To-Do App in Java EE
===========================
I modified basic project from this Udemy course, with Eclipse IDE:

[Java Servlets and JSP: Build Java EE app in 25 steps](https://www.udemy.com/learn-java-servlets-and-jsp-web-application-in-25-steps)

Ran with Tomcat at [http://localhost:8080](http://localhost:8080). To login, use password `dummy`.

In [TodoService.java](https://github.com/rayning0/java-ee-todo/blob/master/src/main/java/com/in28minutes/todo/TodoService.java), changed [ArrayList](http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html) for `todos` to [TreeMap](http://docs.oracle.com/javase/7/docs/api/java/util/TreeMap.html), instead of [HashMap](http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html). A TreeMap (not HashMap) automatically sorts your hash by keys: [difference between HashMap and TreeMap](http://stackoverflow.com/questions/2444359/what-is-the-difference-between-a-hashmap-and-a-treemap).