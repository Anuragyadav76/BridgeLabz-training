public class NullPointer {

    
    static void generateException() {
        String text = null;
        System.out.println(text.length()); 
    }

    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        
        handleException();
    }
}

