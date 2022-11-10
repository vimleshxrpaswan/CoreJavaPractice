public class ArrayDemo2D {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={2,4,6,8};
        int c[]={5,6,7,8};

        int d[][]={ {1,2,3,4},
                    {2,4,6,8},
                    {5,6,7,8}


        };
        for (int k[] : d)
        {
            for (int l : k){
//        for (int i=0;i<d.length;i++)
//        {
//            for (int j=0;j<d[i].length;j++)
//            {
                System.out.print(" " + l);
            }
            System.out.println();

    }
} }
