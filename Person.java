/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Класс, используемый для хранения данных
 *  Last modified:     September 16, 2021
 * Запуск программы: C>java ClassDataApp
 **************************************************************************** */
class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {   //конструктор
        lastName = last;
        firstName = first;
        age = a;
    }

    public void displayPersons() {   //вывод данных
        System.out.print("Name: " + lastName);
        System.out.print(". FirstName: " + firstName);
        System.out.println(". Age: " + age);
        //System.out.println("\n");
    }

    public String getLast() {   //получение имени
        return lastName;
    }
}
