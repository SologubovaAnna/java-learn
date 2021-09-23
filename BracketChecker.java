/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Сам Конструктор для поиска закрывающих скобок в стеке.
 * при поиске закрывающих скобок (){}[]
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class BracketChecker {
    private String input;   //входная строка

    public BracketChecker(String in) {   //конструктор
        input = in;                      //входная строка = строка
    }

    public void check() {   //поиск закрыв скобок
        int size = input.length();    //размер стека
        StackForScobka arr = new StackForScobka(size);  //создание стека
        for (int j = 0; j < input.length(); j++) {    //последовательное чтение
            char ch = input.charAt(j);    //чтение символа
            switch (ch) {
                case '{':    // Открывающие скобки
                case '[':
                case '(':
                    arr.push(ch);   //занести в стек скобки
                    break;
                case '}':    // Закрывающие скобки
                case ']':
                case ')':
                    if (!arr.isEmpty()) {   //если стек не пуст
                        char chs = arr.pop();   //извлечь и проверить
                        if (
                                (ch == '}' && chs != '{') ||
                                        (ch == ']' && chs != '[') ||
                                        (ch == ')' && chs != '(')
                        ) {
                            System.out.print("Error: " + ch + " at " + j);
                        } else {
                            //преждевременная нехватка элементов
                            System.out.print("No error: " + ch + " at " + j);
                        }
                        break;
                    }
                default:
                    break;  //для других символов действия не выполняется

            }

        }
        if (!arr.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }

    }

}
