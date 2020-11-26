package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray{
    Object[] generalArray;
    public BaseArray(Object[] array) {
        this.generalArray = Arrays.copyOf(array, array.length);
    }

    @Override
    public Object[] toArray() {
        return generalArray;
    }

    @Override
    public String operationDescription() {
        return "just base array without decorators";
    }

    @Override
    public int size() {
        return generalArray.length;
    }
}
