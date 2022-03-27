package Assignment1;

public class main {
    public static void main(String[] args) {

        AdminDepartment A1 = new AdminDepartment();
        System.out.println("Welcome to Admin Department");
        System.out.println(A1.departmentName());
        System.out.println(A1.getTodaysWork());
        System.out.println(A1.getWorkDeadline());
        System.out.println(A1.isToadyAHoliday());

        hrDepartment H1 = new hrDepartment();
        System.out.println();
        System.out.println("Welcome to HR Department");
        System.out.println(H1.departmentName());
        System.out.println(H1.getTodaysWork());
        System.out.println(H1.getWorkDeadline());
        System.out.println(H1.doActivity());
        System.out.println(H1.isToadyAHoliday());

        TechDepartment T1 = new TechDepartment();
        System.out.println();
        System.out.println("Welcome to Tech Department");
        System.out.println(T1.departmentName());
        System.out.println(T1.getTodaysWork());
        System.out.println(T1.getWorkDeadline());
        System.out.println(T1.getTechStackInformation());
        System.out.println(T1.isToadyAHoliday());

    }
}
