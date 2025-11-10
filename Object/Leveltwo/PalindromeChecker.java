package Object.Leveltwo;

class PalindromeChecker {
    String text;

    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "madam";
        p.displayResult();
    }
}

