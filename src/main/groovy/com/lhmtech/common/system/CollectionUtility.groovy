package com.lhmtech.common.system

/**
 * Created by lihe on 16-4-13.
 */
final class CollectionUtility {
    public static double[] take(int n, double[] source){
        if (n>=source.length){
            return source;
        }
        if (n==0) {
            return new double[0];
        }

        double[] target = new double[n];
        System.arraycopy(source, 0, target, 0, n);
        return target;
    }

    public static double getLast(double[] indicatorValues)
    {
        if (indicatorValues == null || indicatorValues.length == 0)
            return 0;
        return indicatorValues[indicatorValues.length - 1];
    }

    public static boolean almostEqual(double left, double right)
    {
        double delta = Math.abs(left - right);
        double baseLine = Math.min(Math.abs(left), Math.abs(right));
        return delta/baseLine < 0.015 || delta < 0.005;
    }

    public static double averageOfLargeArray(source) {
        double prevAvg = 0.0d
        for (int i = 0; i < source.length; i++) {
            double  delta = source[i] - prevAvg
            double  avgDelta = delta/(i+1)
            prevAvg = prevAvg + avgDelta
        }
        return prevAvg
    }

    def static partition(list, size) {
        def partitions = []
        int partitionCount = list.size() / size

        partitionCount.times { partitionNumber ->
            def start = partitionNumber * size
            def end = start + size - 1
            partitions << list[start..end]
        }
        if (list.size() % size) partitions << list[partitionCount * size..-1]
        return partitions
    }
}

