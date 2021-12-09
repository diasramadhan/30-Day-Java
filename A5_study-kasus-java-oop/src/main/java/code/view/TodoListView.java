package code.view;

import code.service.TodolistService;
import code.util.InputUtil;

public class TodoListView {

     private TodolistService todolistService;

    public TodoListView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void showTodoList (){
        while (true){
            todolistService.showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. TAMBAH");
            System.out.println("2. HAPUS");
            System.out.println("x. KELUAR");

            var input = InputUtil.input("Pilih");

            if (input.equals("1")){
                addTodoList();
            }else if (input.equals("2")){
                removeTodolist();
            }else if (input.equalsIgnoreCase("x")){
                //keluar
                break;
            }else {
                System.out.println("Pilihan Tidak Dimengerti");
            }
        }
    }

    public void addTodoList(){
        System.out.println("MENAMBAHKAN TODOLIST");

        var todo = InputUtil.input("Todo (x jika batal)");

        if (todo.equalsIgnoreCase("x")){
            //batal
        }else {
            todolistService.addTodoList(todo);
        }
    }

    public void removeTodolist(){
        System.out.println("MENGHAPUS TODOLIST");

        var number = InputUtil.input("Nomor yang dihapus (x jika batal)");

        if (number.equalsIgnoreCase("x")){
            //batal
        }else {
            todolistService.removeTodolist(Integer.valueOf(number));
        }
    }

}
