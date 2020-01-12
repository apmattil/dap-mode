package temp;

class App {
    public static void main(final String[] args) throws InterruptedException {
        System.out.print(123);
        throw new RuntimeException("XXXX");
    }

    static int foo() {
        new App();
        return 10;
    }


    static int bar() {
        new App();
        return 10;
    }
}
