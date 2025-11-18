package com.lakshay.SpringAop.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class ArrayDataRepository {

    public int[] getArrayData(){
        return new int[] {1,2,3,4,5,6,7};
    }
}
