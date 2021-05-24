package com.okm1208.datenstruktur.search;

/**
 * @author Nick ( okm1208@gmail.com )
 * @created 2021-05-24
 */
public class BinarySearch {
    public int searchIdx(int[] data, int target){
        int first = 0;
        int last = data.length-1 ;
        int mid;

        while(first <= last){
            mid = (first+last) / 2;
            if( data[mid] == target){
                return mid;
            }else{
                if(data[mid] > target){
                    last = mid -1;
                }else{
                    first = mid +1;
                }
            }

        }
        return -1;
    }
}
