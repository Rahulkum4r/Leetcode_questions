class Solution {
    public int addDigits(int num) {
        
        int sum =0;
       while(num > 0){
        
        int temp = num % 10 ;
        sum =sum + temp;
        if(sum >= 10){
            int a = sum % 10;
            int b = sum / 10;
            sum = a+ b;
        }
        num = num /10;
        

       }
       return sum;
    }
}