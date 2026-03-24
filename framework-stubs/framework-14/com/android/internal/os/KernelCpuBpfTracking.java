package com.android.internal.os;

public final class KernelCpuBpfTracking {
    public static native boolean isSupported();
    public static boolean startTracking() { return false; }
    public static long[] getFreqs() { return null; }
    static native long[] getFreqsInternal();
    public static int[] getFreqsClusters() { return null; }
    public static int getClusters() { return 0; }
}
