/* *****************************************************************************
 *  Name:              Anna Sologubova
 *  Coursera User ID:  1234562
 * Перевод десятичных чисел в 2-ичную систему и обратно в десятичную
 *  Last modified:     October 22, 2021
 **************************************************************************** */


class Convert2 {
    public static void main(String[] args) {
        int des = Integer.MAX_VALUE;
        System.out.println("10-tichnoe number " + des + " = 2-ichnoe number = " + to2(des));
        String binary = "1111111111111111111111111111111";
        System.out.println("2-ichnoe number " + binary + "= 10-ichnomy number =" + to10(binary));
    }

    public static String to2(int des) {
        String binary = "";
        if (des <= 0) {   //если des =0 или меньше то не переводим
            return binary;
        }
        while (des != 0) {
            binary = des % 2 + binary;
            des = des / 2;
        }
        return binary;
    }

    public static int to10(String binary) {
        int des = 0;
        if (binary == null) {  // если строка ==0 ничего не делаем
            return des;
        }
        for (int i = 0; i < binary.length(); i++) {
            int index = binary.length() - 1 - i;
            //Character.getNumericValue считывает эл в сторке как int
            //charAt() каждый эл. в строке binary
            int value = Character.getNumericValue(binary.charAt(index));
            des += value * Math.pow(2, i);
        }
        return des;
    }
}
