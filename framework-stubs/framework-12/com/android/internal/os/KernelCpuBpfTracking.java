package com.android.internal.os;

public final class KernelCpuBpfTracking {
    private static boolean sTracking;
    private static long[] sFreqs;
    private static int[] sFreqsClusters;
    private KernelCpuBpfTracking() {}
    public static native boolean isSupported();
    public static boolean startTracking() { return false; }
    private static native boolean startTrackingInternal();
    public static long[] getFreqs() { return null; }
    static native long[] getFreqsInternal();
    public static int[] getFreqsClusters() { return null; }
    private static native int[] getFreqsClustersInternal();
    public static int getClusters() { return 0; }
}
