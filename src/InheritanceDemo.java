class Calculator { //super class,Parent,Base
    public int add(int i,int j)
    {

        return i+j;
    }

}
class AdvCalc extends Calculator {  //Sub class,child,Derived

    public int sub(int i,int j)
    {

        return i-j;
    }

}

class CalcVeryAdv extends AdvCalc{
    public int multi(int i,int j){
        return i*j
;
    }
}




public class InheritanceDemo {
    public static void main(String[] args) {
        CalcVeryAdv c1=new  CalcVeryAdv();
        int result=c1.add(2,3);
        int result1=c1.sub(10,3);
        int result2=c1.multi(2,3);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);


    }
}
