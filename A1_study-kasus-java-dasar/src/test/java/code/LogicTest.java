package code;

import org.junit.jupiter.api.Test;

public class LogicTest {
    @Test
    void testAddTodo() {
        AplikasiTodolist.data[0] = "Dias Nur Ramadhan";
        AplikasiTodolist.data[1] = "Noermala Riska Agustin";

        AplikasiTodolist.addTodolist("Dima Ramadhan Syah");

        for (int i = 1; i < 10; i++) {
            AplikasiTodolist.addTodolist(String.valueOf(i));
        }
        AplikasiTodolist.showTodolist();
    }

    @Test
    void testCekDataPenuh() {
        AplikasiTodolist.data[0] = "Dias Nur Ramadhan";
        AplikasiTodolist.data[1] = "Noermala Riska Agustin";

        AplikasiTodolist.addTodolist("Dima Ramadhan Syah");

        for (int i = 1; i < 10; i++) {
            AplikasiTodolist.addTodolist(String.valueOf(i));
        }
        AplikasiTodolist.showTodolist();
        System.out.println(AplikasiTodolist.data.length);
    }

    @Test
    void removeTodolist() {
        AplikasiTodolist.data[0] = "Dias Nur Ramadhan";
        AplikasiTodolist.data[1] = "Noermala Riska Agustin";

        AplikasiTodolist.addTodolist("Dima Ramadhan Syah");
        AplikasiTodolist.showTodolist();
        AplikasiTodolist.removeTodolist(1);
        AplikasiTodolist.showTodolist();
    }

    @Test
    void testInput() {
        AplikasiTodolist.input("Dias");
    }
}
