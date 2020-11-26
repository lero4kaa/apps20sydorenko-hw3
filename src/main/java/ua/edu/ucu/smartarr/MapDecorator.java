package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    private MyFunction func;

    public MapDecorator(SmartArray sa, MyFunction mf) {
        super(sa);
        this.func = mf;
        mapping();
    }

    private void mapping() {
        Object[] tempArray = this.smartArray.toArray();
        Object[] resultArray = new Object[tempArray.length];
        int resultSize = this.smartArray.size();
        for (int i = 0; i < resultSize; i++) {
            Object newElement = this.func.apply(tempArray[i]);
            resultArray[i] = newElement;
        }
        this.smartArray = new BaseArray(resultArray);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "apply function to every element of the array";
    }

    @Override
    public int size() {
        return this.smartArray.size();
    }
}
