class E {
    public void show(){
        System.out.println("in E");
    }

}
class  F extends E{
    @Override
    public void show(){
        System.out.println("in F");
    }

}



public class OverridingDemo {
    public static void main(String[] args) {
        F obj3=new F();
        obj3.show();

    }

}
