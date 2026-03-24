package android.app.ondeviceintelligence.utils;

public class BinderUtils {
    public BinderUtils() {}
    public static final <T extends java.lang.Exception> void withCleanCallingIdentity(android.app.ondeviceintelligence.utils.BinderUtils.ThrowingRunnable<T> p0) throws T {}
    public static final <T extends java.lang.Object, E extends java.lang.Exception> T withCleanCallingIdentity(android.app.ondeviceintelligence.utils.BinderUtils.ThrowingSupplier<T, E> p0) throws E { return null; }

    @java.lang.FunctionalInterface
    public static interface ThrowingRunnable<T extends java.lang.Exception> {
        public void run() throws T;
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingSupplier<T extends java.lang.Object, E extends java.lang.Exception> {
        public T get() throws E;
    }
}
