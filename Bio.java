/*

dna = "GCAT"  перевести в string =>  "GCAU"
 */


public class Bio {
    public String dnaToRna(String dna) {
        String dnu = dna.replaceAll("T", "U");

        System.out.println(dnu);

        return dna;
    }

    public static void main(String[] args) {
        Bio b = new Bio();
        b.dnaToRna("GCAT");
    }
}
