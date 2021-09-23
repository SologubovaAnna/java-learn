/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор2 для перестановки букв в слове
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class Reverser {
    private String input;    //входная строка
    private String output;   //выходная строка

    public Reverser(String in) {    //конструктор
        input = in;
    }

    public String doRev() {  //перестановка букв
        int stackSize = input.length();   //определение размера стека
        Stack array = new Stack(stackSize);   //создание стека
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);  //чтение символов из входного потока
            array.push(ch);               //вставка в стек символов
        }
        output = "";
        while (!array.isEmpty()) {    //пока стек не пуст
            char ch = array.pop();    //извлечение символа из стека
            output = output + ch;    // присоединение к выходной строке
        }
        return output;
    }

}
