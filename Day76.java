// Implement Pow

class Solution {
    double power(double b, int e) {
        // code here
        if(e==0){
            return 1.0;
        }
        double half = power(b,e/2);
        if(e%2==0){
            return half*half;
        }
        else {
            if(e>0){
                return b*half*half;
            }
            else {
                return (half*half)/b;
            }
        }
    }
}