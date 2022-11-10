interface xyz{
    void show();
}




public class InterfaceDemo2 {
    public static void main(String[] args) {
        xyz obj= () -> System.out.println("Im the best");
        obj.show();
    }
}
