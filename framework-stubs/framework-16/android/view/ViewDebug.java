package android.view;

public class ViewDebug {
    @java.lang.Deprecated
    public static final boolean TRACE_HIERARCHY = false;
    @java.lang.Deprecated
    public static final boolean TRACE_RECYCLER = false;
    public static final boolean DEBUG_DRAG = false;
    public static final boolean DEBUG_POSITIONING = false;
    public static final java.lang.String REMOTE_COMMAND_DUMP_ENCODED = "DUMP_ENCODED";
    public ViewDebug() {}
    public static long getViewInstanceCount() { return 0L; }
    public static long getViewRootImplCount() { return 0L; }
    @java.lang.Deprecated
    public static void trace(android.view.View p0, android.view.ViewDebug.RecyclerTraceType p1, int... p2) {}
    @java.lang.Deprecated
    public static void startRecyclerTracing(java.lang.String p0, android.view.View p1) {}
    @java.lang.Deprecated
    public static void stopRecyclerTracing() {}
    @java.lang.Deprecated
    public static void trace(android.view.View p0, android.view.ViewDebug.HierarchyTraceType p1) {}
    @java.lang.Deprecated
    public static void startHierarchyTracing(java.lang.String p0, android.view.View p1) {}
    @java.lang.Deprecated
    public static void stopHierarchyTracing() {}
    static void dispatchCommand(android.view.View p0, java.lang.String p1, java.lang.String p2, java.io.OutputStream p3) throws java.io.IOException {}
    public static android.view.View findView(android.view.View p0, java.lang.String p1) { return null; }
    public static void profileViewAndChildren(android.view.View p0, java.io.BufferedWriter p1) throws java.io.IOException {}
    public static void captureLayers(android.view.View p0, java.io.DataOutputStream p1) throws java.io.IOException {}
    public static void outputDisplayList(android.view.View p0, android.view.View p1) {}
    @java.lang.Deprecated
    @android.annotation.Nullable
    public static java.lang.AutoCloseable startRenderingCommandsCapture(android.view.View p0, java.util.concurrent.Executor p1, java.util.function.Function<android.graphics.Picture, java.lang.Boolean> p2) { return null; }
    @android.annotation.Nullable
    public static java.lang.AutoCloseable startRenderingCommandsCapture(android.view.View p0, java.util.concurrent.Executor p1, java.util.concurrent.Callable<java.io.OutputStream> p2) { return null; }
    public static void capture(android.view.View p0, java.io.OutputStream p1, android.view.View p2) throws java.io.IOException {}
    @java.lang.Deprecated
    public static void dump(android.view.View p0, boolean p1, boolean p2, java.io.OutputStream p3) throws java.io.IOException {}
    public static void dumpv2(android.view.View p0, java.io.ByteArrayOutputStream p1) throws java.lang.InterruptedException {}
    public static void dumpTheme(android.view.View p0, java.io.OutputStream p1) throws java.io.IOException {}
    public static java.lang.String intToString(java.lang.Class<?> p0, java.lang.String p1, int p2) { return null; }
    public static java.lang.String flagsToString(java.lang.Class<?> p0, java.lang.String p1, int p2) { return null; }
    static java.lang.Object resolveId(android.content.Context p0, int p1) { return null; }
    public static void dumpCapturedView(java.lang.String p0, java.lang.Object p1) {}
    public static byte[] invokeViewMethod(android.view.View p0, java.lang.String p1, java.nio.ByteBuffer p2) throws android.view.ViewDebug.ViewMethodInvocationSerializationException { return null; }
    public static void setLayoutParameter(android.view.View p0, java.lang.String p1, int p2) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {}
    public static void deserializeMethodParameters(java.lang.Object[] p0, java.lang.Class<?>[] p1, java.nio.ByteBuffer p2) throws android.view.ViewDebug.ViewMethodInvocationSerializationException {}
    public static byte[] serializeReturnValue(java.lang.Class<?> p0, java.lang.Object p1) throws android.view.ViewDebug.ViewMethodInvocationSerializationException, java.io.IOException { return null; }

    public static interface CanvasProvider {
        public android.graphics.Canvas getCanvas(android.view.View p0, int p1, int p2);
        public android.graphics.Bitmap createBitmap();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface CapturedViewProperty {
        public boolean retrieveReturn() default false;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface ExportedProperty {
        public boolean resolveId() default false;
        public android.view.ViewDebug.IntToString[] mapping() default {};
        public android.view.ViewDebug.IntToString[] indexMapping() default {};
        public android.view.ViewDebug.FlagToString[] flagMapping() default {};
        public boolean deepExport() default false;
        public java.lang.String prefix() default "";
        public java.lang.String category() default "";
        public boolean formatToHexString() default false;
        public boolean hasAdjacentMapping() default false;
    }

    private static class FieldPI<T extends java.lang.annotation.Annotation> extends android.view.ViewDebug.PropertyInfo<T, java.lang.reflect.Field> {
        FieldPI(java.lang.reflect.Field p0, java.lang.Class<T> p1) { super(null, null, null); }
        public java.lang.Object invoke(java.lang.Object p0) throws java.lang.Exception { return null; }
    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface FlagToString {
        public int mask();
        public int equals();
        public java.lang.String name();
        public boolean outputIf() default true;
    }

    public static class HardwareCanvasProvider implements android.view.ViewDebug.CanvasProvider {
        public HardwareCanvasProvider() {}
        public android.graphics.Canvas getCanvas(android.view.View p0, int p1, int p2) { return null; }
        public android.graphics.Bitmap createBitmap() { return null; }
    }

    public static interface HierarchyHandler {
        public void dumpViewHierarchyWithProperties(java.io.BufferedWriter p0, int p1);
        public android.view.View findHierarchyView(java.lang.String p0, int p1);
    }

    @java.lang.Deprecated
    public static enum HierarchyTraceType {
        INVALIDATE,
        INVALIDATE_CHILD,
        INVALIDATE_CHILD_IN_PARENT,
        REQUEST_LAYOUT,
        ON_LAYOUT,
        ON_MEASURE,
        DRAW,
        BUILD_CACHE;
    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface IntToString {
        public int from();
        public java.lang.String to();
    }

    private static class MethodPI<T extends java.lang.annotation.Annotation> extends android.view.ViewDebug.PropertyInfo<T, java.lang.reflect.Method> {
        MethodPI(java.lang.reflect.Method p0, java.lang.Class<T> p1) { super(null, null, null); }
        public java.lang.Object invoke(java.lang.Object p0) throws java.lang.Exception { return null; }
    }

    private static class PictureCallbackHandler implements java.lang.AutoCloseable, android.graphics.HardwareRenderer.PictureCapturedCallback, java.lang.Runnable {
        public void close() {}
        public void onPictureCaptured(android.graphics.Picture p0) {}
        public void run() {}
    }

    private static abstract class PropertyInfo<T extends java.lang.annotation.Annotation, R extends java.lang.reflect.AccessibleObject & java.lang.reflect.Member> {
        public final R member = null;
        public final T property = null;
        public final java.lang.String name = null;
        public final java.lang.Class<?> returnType = null;
        public java.lang.String entrySuffix;
        public java.lang.String valueSuffix;
        PropertyInfo(java.lang.Class<T> p0, R p1, java.lang.Class<?> p2) {}
        public abstract java.lang.Object invoke(java.lang.Object p0) throws java.lang.Exception;
        static <T extends java.lang.annotation.Annotation> android.view.ViewDebug.PropertyInfo<T, ?> forMethod(java.lang.reflect.Method p0, java.lang.Class<T> p1) { return null; }
        static <T extends java.lang.annotation.Annotation> android.view.ViewDebug.PropertyInfo<T, ?> forField(java.lang.reflect.Field p0, java.lang.Class<T> p1) { return null; }
    }

    @java.lang.Deprecated
    public static enum RecyclerTraceType {
        NEW_VIEW,
        BIND_VIEW,
        RECYCLE_FROM_ACTIVE_HEAP,
        RECYCLE_FROM_SCRAP_HEAP,
        MOVE_TO_SCRAP_HEAP,
        MOVE_FROM_ACTIVE_TO_SCRAP_HEAP;
    }

    public static class SoftwareCanvasProvider implements android.view.ViewDebug.CanvasProvider {
        public SoftwareCanvasProvider() {}
        public android.graphics.Canvas getCanvas(android.view.View p0, int p1, int p2) { return null; }
        public android.graphics.Bitmap createBitmap() { return null; }
    }

    private static class StreamingPictureCallbackHandler implements java.lang.AutoCloseable, android.graphics.HardwareRenderer.PictureCapturedCallback, java.lang.Runnable {
        public void close() {}
        public void onPictureCaptured(android.graphics.Picture p0) {}
        public void run() {}
    }

    public static class ViewMethodInvocationSerializationException extends java.lang.Exception {
        ViewMethodInvocationSerializationException(java.lang.String p0) { super(); }
    }

    static interface ViewOperation {
        default public void pre() {}
        public void run();
    }
}
