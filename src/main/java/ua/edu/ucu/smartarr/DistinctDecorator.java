package ua.edu.ucu.smartarr;

import ua.edu.ucu.Student;

import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray sa) {
        super(sa);
        removingDuplicates(sa);
    }

    private void removingDuplicates(SmartArray sa) {
        Object[] tempArr = Arrays.copyOf(sa.toArray(), sa.size());
        int resultSize = sa.size();

        for (int i = 0; i < resultSize; i ++) {
            for (int j = i+1; j < resultSize; j ++) {
                if (tempArr[i].equals(tempArr[j])) {
                    tempArr[j] = tempArr[resultSize-1];
                    resultSize -= 1;
                    j -= 1;
                }
            }
        }

        Object[] resultArray = Arrays.copyOf(tempArr, resultSize);
        this.smartArray = new BaseArray(resultArray);
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return "removing duplicated elements";
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
