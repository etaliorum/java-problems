public class Main {

    public static void main(String[] args) {
        String palindrom = "Madam, I'm Adam!";
        char[] charfromarr = palindrom.replaceAll("[^A-Za-z1-9]+", "").toLowerCase().toCharArray();
        Palindrome p = new Palindrome(charfromarr);

        System.out.println(p.isPalindrom());
    }
}
