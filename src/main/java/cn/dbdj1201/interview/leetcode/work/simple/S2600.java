package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/7/5 15:17
 */
@Slf4j
public class S2600 {

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int num = 0;
        while (k > 0){
            if (numOnes > 0){
                num++;
                numOnes--;
            }else if (numZeros > 0){
                numZeros--;
            }else if (numNegOnes > 0){
                num--;
                numNegOnes--;
            }
            k--;
        }
        return num;
    }


    public int kItemsWithMaximumSumCp(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        } else if (k <= numOnes + numZeros) {
            return numOnes;
        } else {
            return numOnes - (k - numOnes - numZeros);
        }
    }

}
