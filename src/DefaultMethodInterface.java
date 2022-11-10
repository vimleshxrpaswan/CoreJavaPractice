interface Demo {
    void abc();

    static void show() {
        System.out.println("Hiii");
    }


    public class DefaultMethodInterface {
        public static void main(String[] args) {
            Demo.show();
        }
    }
}
