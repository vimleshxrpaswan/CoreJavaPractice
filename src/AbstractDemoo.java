class Printer{
    public void show(Number i){
        System.out.println(i);

    }
    public void show(Double d){
        System.out.println(d);
    }
}




public class AbstractDemoo {
    public static void main(String[] args) {
        Printer p=new Printer();
        p.show(5.5);

    }
}
