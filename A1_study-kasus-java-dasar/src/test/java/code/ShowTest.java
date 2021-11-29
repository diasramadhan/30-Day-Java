package code;

import org.junit.jupiter.api.Test;

public class ShowTest {
    @Test
    void testShowTodo() {
        AplikasiTodolist.data[0] = "Belajar Algoritma";
        AplikasiTodolist.data[1] = "Belajar Basisdata";
        AplikasiTodolist.data[2] = "Belajar Problem Solving";

        AplikasiTodolist.showTodolist();
    }

    @Test
    void testViewShowTodolist() {
        AplikasiTodolist.data[0] = "Belajar Algoritma";
        AplikasiTodolist.data[1] = "Belajar Basisdata";
        AplikasiTodolist.data[2] = "Belajar Problem Solving";

        AplikasiTodolist.viewShowTodolist();
    }
}
