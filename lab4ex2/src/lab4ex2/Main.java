package lab4ex2;

public class Main {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.readNumbers();
        System.out.println("Sum: " + c1.getSum());

        String jsonString = "{\"n1\": 10, \"n2\": 20}";
        
        //se comporta ca si C1 ca idee
        C1 adapter = new C2Adapter(jsonString);
        System.out.println("Sum: " + adapter.getSum());
    }
}
