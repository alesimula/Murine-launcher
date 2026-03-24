package com.android.internal.listeners;

public interface ListenerExecutor {
    default public <TListener extends java.lang.Object> void executeSafely(java.util.concurrent.Executor p0, java.util.function.Supplier<TListener> p1, com.android.internal.listeners.ListenerExecutor.ListenerOperation<TListener> p2) {}
    default public <TListener extends java.lang.Object, TListenerOperation extends com.android.internal.listeners.ListenerExecutor.ListenerOperation<TListener>> void executeSafely(java.util.concurrent.Executor p0, java.util.function.Supplier<TListener> p1, TListenerOperation p2, com.android.internal.listeners.ListenerExecutor.FailureCallback<TListenerOperation> p3) {}

    public static interface FailureCallback<TListenerOperation extends com.android.internal.listeners.ListenerExecutor.ListenerOperation<?>> {
        public void onFailure(TListenerOperation p0, java.lang.Exception p1);
    }

    public static interface ListenerOperation<TListener extends java.lang.Object> {
        public void operate(TListener p0) throws java.lang.Exception;
        default public void onPreExecute() {}
        default public void onFailure(java.lang.Exception p0) {}
        default public void onPostExecute(boolean p0) {}
        default public void onComplete(boolean p0) {}
    }
}
