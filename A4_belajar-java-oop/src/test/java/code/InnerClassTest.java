package code;

import org.junit.jupiter.api.Test;

public class InnerClassTest {
    @Test
    void testCompany() {
        Company company = new Company();
        company.setName("Code Okt 19");
        System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        System.out.println(employee.getName());
        employee.setName("Dias Nur Ramadhan");
        System.out.println(employee.getName());

        System.out.println(employee.getCompany());
    }
}
