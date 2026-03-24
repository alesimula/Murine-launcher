package com.android.net.module.util;

public class BinderUtils {
    public BinderUtils() {}
    public static final <T extends java.lang.Exception> void withCleanCallingIdentity(com.android.net.module.util.BinderUtils.ThrowingRunnable<T> p0) throws T {}

    @java.lang.FunctionalInterface
    public static interface ThrowingRunnable<T extends java.lang.Exception> {
        public void run() throws T;
    }
}
