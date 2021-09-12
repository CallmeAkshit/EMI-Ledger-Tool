package com.assignment.models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LumpSum {

    private HashMap<Integer,Float> EMILumpSumMap;

    LumpSum()
    {
        EMILumpSumMap = new HashMap<Integer,Float>();
    }

    public void addLumpSum(int emiNo, float lumpsAmount)
    {
        this.EMILumpSumMap.put(emiNo,lumpsAmount);
    }

    public float sumPaidTillEMI(int emiNo)
    {
        float sum = 0;
        Iterator<Map.Entry<Integer, Float>> itr = EMILumpSumMap.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, Float> entry = itr.next();
            if (entry.getKey() <= emiNo) {
                sum += entry.getValue();
            }
        }
        return sum;
    }
}
