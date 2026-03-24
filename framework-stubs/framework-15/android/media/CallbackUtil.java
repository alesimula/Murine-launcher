package android.media;

class CallbackUtil {
    CallbackUtil() {}
    @android.annotation.Nullable
    static <T extends java.lang.Object> android.media.CallbackUtil.ListenerInfo<T> getListenerInfo(T p0, java.util.ArrayList<android.media.CallbackUtil.ListenerInfo<T>> p1) { return null; }
    static <T extends java.lang.Object> boolean hasListener(T p0, java.util.ArrayList<android.media.CallbackUtil.ListenerInfo<T>> p1) { return false; }
    static <T extends java.lang.Object> boolean removeListener(T p0, java.util.ArrayList<android.media.CallbackUtil.ListenerInfo<T>> p1) { return false; }
    static <T extends java.lang.Object, S extends java.lang.Object> android.util.Pair<java.util.ArrayList<android.media.CallbackUtil.ListenerInfo<T>>, S> addListener(java.lang.String p0, java.util.concurrent.Executor p1, T p2, java.util.ArrayList<android.media.CallbackUtil.ListenerInfo<T>> p3, S p4, java.util.function.Supplier<S> p5, java.util.function.Consumer<S> p6) { return null; }
    static <T extends java.lang.Object, S extends java.lang.Object> android.util.Pair<java.util.ArrayList<android.media.CallbackUtil.ListenerInfo<T>>, S> removeListener(java.lang.String p0, T p1, java.util.ArrayList<android.media.CallbackUtil.ListenerInfo<T>> p2, S p3, java.util.function.Consumer<S> p4) { return null; }
    static <T extends java.lang.Object> void callListeners(java.util.ArrayList<android.media.CallbackUtil.ListenerInfo<T>> p0, java.lang.Object p1, android.media.CallbackUtil.CallbackMethod<T> p2) {}

    static interface CallbackMethod<T extends java.lang.Object> {
        public void callbackMethod(T p0);
    }

    static interface DispatcherStub {
        public void register(boolean p0);
    }

    static class LazyListenerManager<T extends java.lang.Object> {
        LazyListenerManager() {}
        void addListener(java.util.concurrent.Executor p0, T p1, java.lang.String p2, java.util.function.Supplier<android.media.CallbackUtil.DispatcherStub> p3) {}
        void removeListener(T p0, java.lang.String p1) {}
        @android.annotation.SuppressLint("GuardedBy")
        void callListeners(android.media.CallbackUtil.CallbackMethod<T> p0) {}
    }

    static class ListenerInfo<T extends java.lang.Object> {
        @android.annotation.NonNull
        final T mListener = null;
        @android.annotation.NonNull
        final java.util.concurrent.Executor mExecutor = null;
        ListenerInfo(T p0, java.util.concurrent.Executor p1) {}
    }
}
