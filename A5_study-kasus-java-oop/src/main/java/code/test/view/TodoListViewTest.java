package code.test.view;

import code.repository.TodolistRepository;
import code.repository.TodolistRepositoryImpl;
import code.service.TodoListServiceImpl;
import code.service.TodolistService;
import code.view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        testShowTodolist();
    }
    static void testShowTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodoListServiceImpl(todolistRepository);
        TodoListView todoListView = new TodoListView(todolistService);

        todolistService.addTodoList("Belajar Java Dasar");
        todolistService.addTodoList("Belajar Java OOP");
        todolistService.addTodoList("Belajar Java Generic");
        todoListView.showTodoList();
    }
}
