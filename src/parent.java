public class parent {

    void print(){
        System.out.println("parent");
    }
    public static void main(String[] args) {
        parent p=new child();
        p.print();

    }
}
