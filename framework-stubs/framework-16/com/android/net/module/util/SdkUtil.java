package com.android.net.module.util;

public class SdkUtil {
    public SdkUtil() {}
    public static boolean isAtLeast25Q2() { return false; }

    public static class LateSdk<T extends java.lang.Object> {
        @android.annotation.Nullable
        public final T value = null;
        public LateSdk(T p0) {}
    }
}
