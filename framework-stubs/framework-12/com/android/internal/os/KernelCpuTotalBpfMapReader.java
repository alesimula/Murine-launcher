package com.android.internal.os;

public final class KernelCpuTotalBpfMapReader {
    private KernelCpuTotalBpfMapReader() {}
    public static long[] read() { return null; }
    private static native long[] readInternal();
}
