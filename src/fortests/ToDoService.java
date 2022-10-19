package fortests;

import java.util.List;

public interface ToDoService {

    public List<String> getAllTodos(String user);
    public void deleteTodos(String todo);
}
