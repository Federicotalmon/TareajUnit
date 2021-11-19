import java.lang.Math;

public class Functions {

    /**
     * Calulates the value of Y when Y = mx + n
     */
    public int linearFunction(int m, int n ,int x){
        return m*x + n;
    }

    /**
     * Calulates the value of Y when Y = ax^2 + bx + n
     */
    public double quadraticFunction(int a , int b, int c , int x){
        return (Math.pow(x,2)*a + b*x + c);
    }

    /**
     * this function returns the roots of a quadratic function
     * if roots are complex, I consider them as [-1,-1]
     * if there is just one root (r), the function returns [r,r]
     * if there are two roots (r1,r2), the function returns[r1,r2]
     */
    public double[] getRoots (int a , int b, int c){
        double raiz = b*b-4*a*c;
        double [] raices= new double[2];
        if(Math.pow(b,2)<4*a*c) {
            raices[0]=-1;
            raices[1]=-1;
        }
        else{
            raices[0]= (-b + Math.sqrt(raiz))/(2*a);
            raices[1]= (-b - Math.sqrt(raiz))/(2*a);
        }

        return raices;
    }

    /**
     * Calculates the absolute value of the function Y = ax.
     */

    public double AbsoluteValue(double a, double x){
        double ret;
        if (x<0) x =-1*x;
        return a*x;
    }



}
