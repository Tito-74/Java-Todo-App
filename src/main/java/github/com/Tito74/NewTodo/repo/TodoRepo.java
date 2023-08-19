package github.com.Tito74.NewTodo.repo;

import github.com.Tito74.NewTodo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface TodoRepo extends JpaRepository <Todo, Long >{

}
