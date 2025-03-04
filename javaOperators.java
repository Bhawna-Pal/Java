public class javaOperators {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Arithmetic Operator  =>  Binary Operator
        int A = 10;
        int B = 5;
        System.out.println("add = " + (A + B));
        System.out.println("subtracts = " + (A - B));
        System.out.println("Multiply = " + (A * B));
        System.out.println("modulo (remainder) = " + (A % B));


        // unary Operator
        //  pre increment
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // post increment 
        a = 10;
        b = a++;
        System.out.println(a);
        System.out.println(b);


        //  pre decrement
        a = 10; 
        b = --a;
        System.out.println(a);
        System.out.println(b);

        //  post decrement
        a = 10;
        b = a--;
        System.out.println(a);
        System.out.println(b);


        // Relational Operator
        System.out.println((A == B));

        System.out.println(A != B);

        System.out.println(A > B);

        System.out.println(A < B);

        System.out.println(A >= B);

        System.out.println(A <= B);

        // Logical Operator

        System.out.println( (3>2) &&  (5>0) );
        System.out.println( (3<2) &&  (4>2) );

        System.out.println( (3<2) ||  (5<0) );
        System.out.println( (3>2) ||  (8>0) );

        System.out.println(!(3>2));
        System.out.println(!(3<2));

        // Assignment Operator

        A = 10;
        // A = A + 10;
        A += 10;

        B = 5;
        // B = B - 5;
        B -= 5;

        System.out.println(A);
        System.out.println(B);
    }
    
}
