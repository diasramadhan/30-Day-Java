import code.repository.TodolistRepository;
import code.repository.TodolistRepositoryImpl;
import code.service.TodoListServiceImpl;
import code.service.TodolistService;
import code.view.TodoListView;

public class AplikasiTodolist {
    public static void main(String[] args) {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodoListServiceImpl(todolistRepository);
        TodoListView todoListView = new TodoListView(todolistService);
        todoListView.showTodoList();
    }
}
