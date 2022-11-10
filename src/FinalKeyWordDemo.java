class Abc{
//    final int DAY=0; //constant
    public void show(){

        System.out.println("I'm show in Abc class");

    }
}
class Bac extends Abc{
    public void show(){
        System.out.println("I am show method in Bac class");
    }

}







public class FinalKeyWordDemo {
    public static void main(String[] args) {
        Abc a=new Abc();
        Bac bar=new Bac();
        bar.show();
        a.show();

    }
}
