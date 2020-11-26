package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    MyComparator comparator;
    public SortDecorator(SmartArray sa, MyComparator mc) {
        super(sa);
        this.comparator = mc;
        comparing();
    }

    private void comparing() {
        Object[] tempArray = this.smartArray.toArray();
        Arrays.sort(tempArray, this.comparator);
        this.smartArray = new BaseArray(tempArray);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "sorting";
    }

    @Override
    public int size() {
        return this.smartArray.size();
    }
}
