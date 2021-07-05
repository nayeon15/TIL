package test_210702;
interface B{
    public int run (int x, int y);
}

public class A {
    public static void main(String[] args) {

        B b = (x, y)-> {return x+y;};
        System.out.println(b.run(5, 7));

        b = (x, y) -> x+y;
        System.out.println(b.run(5, 5));

        b= (x, y) -> sum(x, y);
        System.out.println(b.run(3, 2));
    }
    public static int sum (int x, int y){
        return x+y;
    }
}
