class Solution {
    public int addDigits(int num) {
        // brute force approach  

        if(num < 10){
            return num;
        } 

        // while(num >= 10){

        //     int sum = 0;

        //     while(num > 0){
        //         int digit = num % 10;
        //         sum = sum + digit;
        //         num = num / 10;
        //     }

        //     num = sum;
        // }

        // return num;


        //+===================================================
        

        // o(1)  run time... OPTIMAL

         return 1 + (num -1) % 9;


    }
}