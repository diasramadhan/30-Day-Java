package code;

import java.util.Scanner;

public class AplikasiTodolist {

    public static String[] data = new String[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AplikasiTodolist.viewShowTodolist();
    }

    /**
     * Menampilkan todolist
     */
    public static void showTodolist(){
        System.out.println("=== TODOLIST ===");
        for (int i = 0; i < data.length; i++) {
            var todo = data[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * cek data todolist apakah sudah penuh
     * @return apakah data penuh
     */
    public static boolean isfull(){
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                //data basih tersedia
                isFull = false;
                break;
            }
        }
        return isFull;
    }
    public static void resizeIfFull(){
        if (isfull()){
            var temp = data;
            data = new String[data.length * 2];

            //logic pengisian data
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }
    /**
     * menambahkan todo ke list
     * @param todo
     */
    public static void addTodolist(String todo){
        resizeIfFull();

        //tambahkan ke data array yang kosong
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                data[i] = todo;
                break;
            }
        }
    }

    public static boolean removeTodolist(Integer number){
        if (number-1 == data.length){
            return false;
        }else if (data[number-1] == null ){
            return false;
        }else {
            for (int i = number-1; i < data.length; i++) {
                if (i == data.length-1){
                    data[i] = null;
                }else {
                    data[i] = data[i+1];
                }
            }
            return true;
        }
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi " + name);
    }

    /**
     * view menu aplikasi todolist
     */
    public static void viewShowTodolist(){
        while (true){
            showTodolist();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var pilih = input("Pilih");
            if (pilih.equalsIgnoreCase("1")){
                //view add todo
                viewAddTodo();
            }else if (pilih.equalsIgnoreCase("2")){
                //view remove todo
                viewRemoveTodo();
            }else if (pilih.equalsIgnoreCase("x")){
                System.exit(0);
            }else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    /**
     * view menambahkan todolist
      */
    public static void viewAddTodo(){
        System.out.println("Menambahkan Todolist");

        var todo = input("Todo (x jika batal)");

        if (todo.equalsIgnoreCase("x")){
            //batal
        }else {
            addTodolist(todo);
        }
    }

    /**
     * view menghapus todolist
     */
    public static void viewRemoveTodo(){
        System.out.println("Menghapus Todo");
        var delete = input("Nomor yang dihapus (x jika batal) ");

        if (delete.equalsIgnoreCase("x")){
            //batal
        }else {
            boolean success = removeTodolist(Integer.valueOf(delete));
            if (success){
                System.out.println("Berhasil menghapus todo no."+ delete);
            }else {
                System.out.println("Gagal menghapus todolist no."+ delete);
            }
        }
    }
}
