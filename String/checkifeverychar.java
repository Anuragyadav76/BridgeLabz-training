package String;

public class checkifeverychar {
    public static void main(String[] args) {
        String str = "hello";
        boolean allLowerCase = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLowerCase(ch)) {
                allLowerCase = false;
                break;
            }
        }

        if (allLowerCase) {
            System.out.println("All characters are lowercase.");
        } else {
            System.out.println("Not all characters are lowercase.");
        }
    }
    
}
