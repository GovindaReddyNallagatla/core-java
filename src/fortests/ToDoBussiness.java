package fortests;

import java.util.ArrayList;
import java.util.List;

public class ToDoBussiness {

    public ToDoService toDoService;

    public ToDoBussiness(ToDoService toDoService){this.toDoService=toDoService;}

    public List<String> getHibernateTodos(String user){
        List<String> allTodos = toDoService.getAllTodos(user);
        List<String> hibernateTodos = new ArrayList<>();

        for(String todo:allTodos)
            if(todo.contains("Hibernate")) hibernateTodos.add(todo);

        return hibernateTodos;
    }

    public void deleteTodosNotHibernate(String user){
        List<String> allTodos = toDoService.getAllTodos(user);

        for(String todo:allTodos)
            if(!todo.contains("Hibernate")) toDoService.deleteTodos(todo);
    }
}
