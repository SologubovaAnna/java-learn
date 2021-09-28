/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Конструктор расчета 23+ для стека
 *  Last modified:     September 23, 2021
 **************************************************************************** */
class ParsePost {
    private StackResult arr;
    private String input;

    public ParsePost(String s) {
        input = s;
    }

    public int doParse() {
        arr = new StackResult(20);    //обЪект стека
        char ch;
        int j;
        int num1, num2, inter;
        for (j = 0; j < input.length(); j++) {  //для каждого эл
            ch = input.charAt(j);      // чтение символа
            arr.display(" " + ch + " ");             //выведим что прочитали для диагностики
            if (ch >= '0' && ch <= '9') {         //если это число от0 до 9
                arr.push((int) (ch - '0'));    //занести в стек
            } else {                        //есди это оператор
                num2 = arr.pop();         //извлекаем операнды
                num1 = arr.pop();         //извлекаем 2-й операнд
                //вывполнение арифметиеской операции
                switch (ch) {
                    case '+':
                        inter = num1 + num2;
                        break;
                    case '-':
                        inter = num1 - num2;
                        break;
                    case '*':
                        inter = num1 * num2;
                        break;
                    case '/':
                        inter = num1 / num2;
                        break;
                    default:
                        inter = 0;
                }
                arr.push(inter);     //занесение промежуточного результата в стек
            }
        }
        inter = arr.pop();   //получение результата
        return inter;
    }

}
