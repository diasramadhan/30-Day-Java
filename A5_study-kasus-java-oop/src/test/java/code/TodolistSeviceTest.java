package code;

import code.entity.Todolist;
import code.repository.TodolistRepository;
import code.repository.TodolistRepositoryImpl;
import code.service.TodoListServiceImpl;
import code.service.TodolistService;
import org.junit.jupiter.api.Test;

public class TodolistSeviceTest {

    @Test
    void testShowTodolist() {
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        todolistRepository.data[0] = new Todolist("Belajar Java Dasar");
        todolistRepository.data[1] = new Todolist("Belajar Database");
        todolistRepository.data[2] = new Todolist("Belajar OOP ");

        TodolistService todolistService = new TodoListServiceImpl(todolistRepository);
        todolistService.showTodoList();
    }

    @Test
    void testAddTodoList() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodoListServiceImpl(todolistRepository);
        todolistService.addTodoList("Belajar Java Dasar");
        todolistService.addTodoList("Belajar Java Generic");
        todolistService.addTodoList("Belajar Java OOP");

        todolistService.showTodoList();
    }

    @Test
    void testRemoveTodoList() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodoListServiceImpl(todolistRepository);
        todolistService.addTodoList("Belajar Java Dasar");
        todolistService.addTodoList("Belajar Java Generic");
        todolistService.addTodoList("Belajar Java OOP");

        todolistService.showTodoList();
        todolistService.removeTodolist(5);
        todolistService.removeTodolist(1);
        todolistService.showTodoList();
    }
}
