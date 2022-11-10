
@FunctionalInterface
interface abc{  //can have only one method
    void show();

}
class Implementor implements abc{

    @Override
    public void show() {

    }
}







public class InterfaceDemo {
    public static void main(String[] args) {
        abc obj = new Implementor();
        obj.show();

    }
}
