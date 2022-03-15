package Practice;

public class Test2 {

    public static void main(String[] args) {

        //Integer DT
        int a =10;
        int b= 10;
        int c =10;

        int sum = a+b+c;
        System.out.println(sum);

        //float DT
        float aa = 10.88f;
        float bb= 20.8f;
        float sumF = aa+bb;

        System.out.println(sumF);

        //double DT
        double x = 32.8976;
        double y = 45.8976;
        double sumD = x+y;
        System.out.println(sumD);


        //Boolean DT
        boolean ab = true;
        System.out.println("boolean value: "+ ab);

        //Character DT
        char mn = 'A';
        System.out.println("char value: " + mn);

        // String DT

        String str = "HimaBindu123";
        System.out.println("String value: "+str);

        //METHOD NEED TO BE CALLED FOR EXECUTION
        //TO CALL NON STATIC METHOD: need to create an object and call the method with objectName.methodName()

        Test2 objAB= new Test2();
        objAB.add();
        objAB.multiply();

        //TO CALL STATIC METHOD: no need of object creation, call the methodname directly
        subtract();
        division();

        // TO CALL A NON VOID METHOD

        System.out.println("Non void method result with a return type: " + objAB.sum());

        System.out.println("String method result: " + objAB.str());

        System.out.println("Boolean method result: " + objAB.boolMethod());

        System.out.println("Float method result: " + objAB.floatMethod());

    }

    // NON STATIC METHOD

    public void add(){

        int m= 20;
        int n= 45;
        int sum = m+n;
        System.out.println("Add method result: "+sum);

    }

    //STATIC METHOD

    public static void subtract(){

        int m= 20;
        int n= 45;
        int subt = n-m;
        System.out.println("Subtract method result: "+subt);
    }


    // NON STATIC METHOD

    public void multiply(){

        int m= 20;
        int n= 4;
        int mult = m*n;
        System.out.println("multiply method result: "+mult);

    }

    //STATIC METHOD

    public static void division(){

        int m= 20;
        int n= 5;
        int div = m/n;
        System.out.println("division method result: "+div);
    }


    // NON VOID METHOD
    public int sum(){

        int v= 10;
        int u= 40;
        int sumOftwo = v+u;
        return sumOftwo;
    }


    // NON VOID METHOD
    public String str(){


        String xyz = "Hello! ";
        String abc ="Have a Good Day";

        return xyz + abc;
    }


    public Boolean boolMethod()
    {
        Boolean abc = false;
        return abc;
    }


    public float floatMethod(){

        float m= (float) 20.897;
        float n= (float) 45.66;
        float sum = m+n;

        return sum;
    }


}
