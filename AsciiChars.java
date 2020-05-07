public class AsciiChars {
    
    public static void printNumbers(){
        
        for (int i = 48; i <= 57; i++) {
            System.out.println("ASCII Value of " + (char)i + " = " + i);
            
        }
        System.out.println();
    }

    public static void printLowerCase(){
        for (int j = 97; j <= 122; j++){
            
            System.out.println("The ASCII value of " + (char)j + " = " + j);
        }
        System.out.println();
    }

    public static void printUpperCase(){
        for (int k = 65; k <= 90; k++){
            System.out.println("The ASCII value of " + (char)k + " = " + k);
        }
        System.out.println();
    }
}