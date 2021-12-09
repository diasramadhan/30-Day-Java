package code.service;

import code.entity.Todolist;
import code.repository.TodolistRepository;

public class TodoListServiceImpl implements TodolistService{

    public TodolistRepository todolistRepository;

    public TodoListServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodoList() {
        Todolist[] model = todolistRepository.getAll();

        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        Todolist todolist = new Todolist(todo);
        todolistRepository.add(todolist);
        System.out.println("SUKSES MENAMBAHKAN TODO : " + todo);
    }

    @Override
    public void removeTodolist(Integer number) {
        boolean success = todolistRepository.remove(number);
        if (success){
            System.out.println("SUKSES MENGHAPUS TODOLIST NO : " + number);
        }else {
            System.out.println("GAGAL MENGHAPUS TODOLIST NO : " + number);
        }
    }
}
