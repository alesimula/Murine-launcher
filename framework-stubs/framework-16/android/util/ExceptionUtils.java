package android.util;

public class ExceptionUtils {
    public ExceptionUtils() {}
    public static java.lang.RuntimeException wrap(java.io.IOException p0) { return null; }
    public static void maybeUnwrapIOException(java.lang.RuntimeException p0) throws java.io.IOException {}
    public static java.lang.String getCompleteMessage(java.lang.String p0, java.lang.Throwable p1) { return null; }
    public static java.lang.String getCompleteMessage(java.lang.Throwable p0) { return null; }
    public static <E extends java.lang.Throwable> void propagateIfInstanceOf(java.lang.Throwable p0, java.lang.Class<E> p1) throws E {}
    public static <E extends java.lang.Exception> java.lang.RuntimeException propagate(java.lang.Throwable p0, java.lang.Class<E> p1) throws E { return null; }
    public static java.lang.RuntimeException propagate(java.lang.Throwable p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.Throwable getRootCause(java.lang.Throwable p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.Throwable appendCause(java.lang.Throwable p0, java.lang.Throwable p1) { return null; }
}
