package com.lakshay.SpringAop.Service;

import com.lakshay.SpringAop.Annotation.TimeTrackingAnnotation;
import com.lakshay.SpringAop.Repository.ArrayDataRepository;
import com.sun.jdi.request.DuplicateRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ArrayService {

    @Autowired
    private ArrayDataRepository arrayDataRepository;

    @TimeTrackingAnnotation
    public int getMax() {
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Arrays.stream(arrayDataRepository.getArrayData()).max().orElse(0);
    }

    public void getException(){
        throw new RuntimeException("Something went wrong");
    }

}
