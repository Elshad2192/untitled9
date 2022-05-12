package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
                // Задание1
                String firstName =" Ivan ";
                String middleName =" Ivanovich ";
                String lastName =" Ivanov ";
                String fullName = lastName +firstName +middleName;
                System.out.println(fullName);
                // Задание2
                String fullNameUp =fullName.toUpperCase();
                System.out.println(" Данные ФИО сотрудника для заполнения отчета " +fullNameUp);

                //Задание 3

                fullName = " Иванов Семён Семёныч";
                String fullNameReplace=fullName.replace("ё", "е");
                System.out.println(" Данные ФИО сотрудника "+fullNameReplace);
            }
        }



