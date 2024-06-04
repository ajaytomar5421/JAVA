public class HELLO{
    // static public void main(string[] args)   valid
    // public static void main(string... args)  valid
    // static public void main(string args[])   valid
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}