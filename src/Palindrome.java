public class Palindrome {
    public char[] plndr;

    public Palindrome(char[] palindrom) {
        plndr = palindrom;
    }

    public boolean isPalindrom() {
        int fromBegin = 0;
        int fromEnd = plndr.length - 1;
        boolean ispalindrom = true;

        while (fromBegin < fromEnd) {
            if(plndr[fromBegin] != plndr[fromEnd]){
                ispalindrom = false;
            }
            fromBegin++;
            fromEnd--;
        }
        return ispalindrom;
    }
}
