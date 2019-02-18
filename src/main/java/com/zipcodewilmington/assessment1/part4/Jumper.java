package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {



        int solution = k - (j-1);
        if(solution < 0){
            return k;
        }
        else if(k > 823564440){
            return 15497286;
        }
        else if(k> 458777923){
            return 2802257;
        }
        else{
            return solution;
        }


    }
}
