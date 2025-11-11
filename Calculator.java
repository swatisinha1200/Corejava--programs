public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator is ready.");
        double x = 10;
        double y = 5;
        char operands='/';
        switch (operands) {
            case '+'->System.out.println(x + y);  
                
            case '-'->System.out.println(x - y);
            case '*'->System.out.println(x * y);
            case '/'->System.out.println(x / y);
            case '%'->System.out.println(x % y);
            default -> System.out.println("Invalid operation");
        }
    }
}
