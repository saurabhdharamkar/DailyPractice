
@FunctionalInterface
interface Saurabh{
    abstract int m1();

        }




public class Functional {
    public static void main(String[] args) {
        Saurabh s=()->{
            System.out.println("Hii");
            return 0;
        };
        s.m1();
    }

}
