public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] a=null;
            a[4]=8;

            int i=7;
            int j=0;
            int k=i/j;
            System.out.println("output is" +k);

        }
        catch (ArithmeticException e){
            System.out.println("Error");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        catch (NullPointerException e){
            System.out.println("Error");
        }

        finally {
            System.out.println("Hello");
        }
    }
}
