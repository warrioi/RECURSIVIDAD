public class Ejercisios {
    public static int factorial(int n){
        int factorial;

        if (n == 1){
            //caso base
            factorial = n;

        }else {
            factorial = n * factorial(n-1);
        }
        return factorial;
    }
    /*

    Maximo comun divisor (mcd), algoritmo
    a = 412
    b = 184

     */
    public static int mcd(int a,int b){
        int mcd;
        if (a == b){
            mcd = b;
        }else {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            mcd=mcd(a , b );
        }
        return mcd;
    }
}
