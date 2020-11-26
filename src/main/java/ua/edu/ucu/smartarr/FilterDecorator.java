package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    MyPredicate predicate;
    public FilterDecorator(SmartArray sa, MyPredicate mp) {
        super(sa);
        this.predicate = mp;
        testPredicate();
    }

    public void testPredicate() {
        Object[] tempArray = this.smartArray.toArray();
        int resultSize = this.smartArray.size();
        for (int i = 0; i < resultSize; i++) {
            if (!this.predicate.test(tempArray[i])) {
                tempArray[i] = tempArray[resultSize-1];
                resultSize -= 1;
                i -= 1;
            }
        }
        Object[] resultArray = Arrays.copyOf(tempArray, resultSize);
        this.smartArray = new BaseArray(resultArray);
    }

    @Override
    public Object[] toArray() {
        return this.smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return this.smartArray.size();
    }
}
