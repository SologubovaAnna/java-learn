/*
Игра камень ножницы бумага
 */

public class PaperBrok {
    public static String rps(String p1, String p2) {
        String res = "";
        String rock = "rock";  //камень
        String sc = "scissors"; //ножницы
        String pap = "paper";  //бумага


        if (p1.equals(rock)) {

            switch (p2) {
                case "rock":
                    res = "Draw!";
                    break;
                case "scissors":
                    res = "Player 1 won!";
                    break;
                case "paper":
                    res = "Player 2 won!";
                    break;
                default:
                    res = "default!";
                    break;

            }
            System.out.println(res);
            return res;
        } else if (p1.equals(sc)) {

            switch (p2) {
                case "rock":
                    res = "Player 2 won!";
                    break;
                case "scissors":
                    res = "Draw!";
                    break;
                case "paper":
                    res = "Player 1 won!";
                    break;
                default:
                    res = "default!";
                    break;

            }
            System.out.println(res);
            return res;
        } else if (p1.equals(pap)) {
            switch (p2) {
                case "rock":
                    res = "Player 1 won!";
                    break;
                case "scissors":
                    res = "Player 2 won!";
                    break;
                case "paper":
                    res = "Draw!";
                    break;
                default:
                    res = "default!";
                    break;

            }
            System.out.println(res);
            return res;
        }

        return res;

    }

    public static void main(String[] args) {
        PaperBrok b = new PaperBrok();
        System.out.println("rock");
        b.rps("rock", "paper");
        b.rps("rock", "rock");
        b.rps("rock", "scissors");

        System.out.println("paper");
        b.rps("paper", "paper");
        b.rps("paper", "rock");
        b.rps("paper", "scissors");

        System.out.println("scissors");
        b.rps("scissors", "paper");
        b.rps("scissors", "rock");
        b.rps("scissors", "scissors");
    }
}
