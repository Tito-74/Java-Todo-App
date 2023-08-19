package github.com.Tito74.NewTodo.model;

import jakarta.persistence.*;
import jdk.jfr.BooleanFlag;
import lombok.Data;

@Data
@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private Boolean completed = Boolean.FALSE;
}
