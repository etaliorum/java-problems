public class Palindrome {
    public String plndr;
    char[] stringtochar;

    public Palindrome(String palindrome) {
        plndr = palindrome;
    }

    public boolean isPalindrom() {
        int fromBegin = 0;
        stringtochar = plndr.replaceAll("[^A-Za-z1-9]+", "").toLowerCase().toCharArray();
        int fromEnd = stringtochar.length - 1;
        boolean ispalindrom = true;

        while (fromBegin < fromEnd) {
            if(stringtochar[fromBegin] != stringtochar[fromEnd]){
                ispalindrom = false;
            }
            fromBegin++;
            fromEnd--;
        }
        return ispalindrom;
    }
}
