package github.com.Tito74.NewTodo;

import github.com.Tito74.NewTodo.model.Todo;
import github.com.Tito74.NewTodo.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @Autowired
    TodoRepo repo;

    @PostMapping("/create")
    public void addTodoTask(@RequestBody Todo todo){
        System.out.println(todo);
        repo.save(todo);
    }


}
