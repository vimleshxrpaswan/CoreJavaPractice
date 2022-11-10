//int,float,double
//Integer




public class WrapperDemo {
    public static void main(String[] args) {
        int i=5; //Primitive datatype
        Integer ii= i;
        int j=ii.intValue();  //unboxing/unwrapping
        Integer value =i;  //AutoBoxing
        int k = value;  //autounboxing
        System.out.println(ii);

    }
}
