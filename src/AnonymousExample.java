class Z
{
    public void show(){
        System.out.println("i am show in A");
    }


}





public class AnonymousExample {
    public static void main(String[] args) {
        Z obj=new Z(){


            public  void show(){
                System.out.println("I am the Best");
            }
        };
        obj.show();

    }
}
