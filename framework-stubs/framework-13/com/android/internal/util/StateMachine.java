package com.android.internal.util;

public class StateMachine {
    public static final boolean HANDLED = true;
    public static final boolean NOT_HANDLED = false;
    protected StateMachine(java.lang.String p0) {}
    protected StateMachine(java.lang.String p0, android.os.Looper p1) {}
    protected StateMachine(java.lang.String p0, android.os.Handler p1) {}
    protected void onPreHandleMessage(android.os.Message p0) {}
    protected void onPostHandleMessage(android.os.Message p0) {}
    public final void addState(com.android.internal.util.State p0, com.android.internal.util.State p1) {}
    public final void addState(com.android.internal.util.State p0) {}
    public final void removeState(com.android.internal.util.State p0) {}
    public final void setInitialState(com.android.internal.util.State p0) {}
    public final android.os.Message getCurrentMessage() { return null; }
    public final com.android.internal.util.IState getCurrentState() { return null; }
    public final void transitionTo(com.android.internal.util.IState p0) {}
    public final void transitionToHaltingState() {}
    public final void deferMessage(android.os.Message p0) {}
    protected void unhandledMessage(android.os.Message p0) {}
    protected void haltedProcessMessage(android.os.Message p0) {}
    protected void onHalting() {}
    protected void onQuitting() {}
    public final java.lang.String getName() { return null; }
    public final void setLogRecSize(int p0) {}
    public final void setLogOnlyTransitions(boolean p0) {}
    public final int getLogRecSize() { return 0; }
    public final int getLogRecMaxSize() { return 0; }
    public final int getLogRecCount() { return 0; }
    public final com.android.internal.util.StateMachine.LogRec getLogRec(int p0) { return null; }
    public final java.util.Collection<com.android.internal.util.StateMachine.LogRec> copyLogRecs() { return null; }
    public void addLogRec(java.lang.String p0) {}
    protected boolean recordLogRec(android.os.Message p0) { return false; }
    protected java.lang.String getLogRecString(android.os.Message p0) { return null; }
    protected java.lang.String getWhatToString(int p0) { return null; }
    public final android.os.Handler getHandler() { return null; }
    public final android.os.Message obtainMessage() { return null; }
    public final android.os.Message obtainMessage(int p0) { return null; }
    public final android.os.Message obtainMessage(int p0, java.lang.Object p1) { return null; }
    public final android.os.Message obtainMessage(int p0, int p1) { return null; }
    public final android.os.Message obtainMessage(int p0, int p1, int p2) { return null; }
    public final android.os.Message obtainMessage(int p0, int p1, int p2, java.lang.Object p3) { return null; }
    public void sendMessage(int p0) {}
    public void sendMessage(int p0, java.lang.Object p1) {}
    public void sendMessage(int p0, int p1) {}
    public void sendMessage(int p0, int p1, int p2) {}
    public void sendMessage(int p0, int p1, int p2, java.lang.Object p3) {}
    public void sendMessage(android.os.Message p0) {}
    public void sendMessageDelayed(int p0, long p1) {}
    public void sendMessageDelayed(int p0, java.lang.Object p1, long p2) {}
    public void sendMessageDelayed(int p0, int p1, long p2) {}
    public void sendMessageDelayed(int p0, int p1, int p2, long p3) {}
    public void sendMessageDelayed(int p0, int p1, int p2, java.lang.Object p3, long p4) {}
    public void sendMessageDelayed(android.os.Message p0, long p1) {}
    protected final void sendMessageAtFrontOfQueue(int p0) {}
    protected final void sendMessageAtFrontOfQueue(int p0, java.lang.Object p1) {}
    protected final void sendMessageAtFrontOfQueue(int p0, int p1) {}
    protected final void sendMessageAtFrontOfQueue(int p0, int p1, int p2) {}
    protected final void sendMessageAtFrontOfQueue(int p0, int p1, int p2, java.lang.Object p3) {}
    protected final void sendMessageAtFrontOfQueue(android.os.Message p0) {}
    protected final void removeMessages(int p0) {}
    protected final void removeDeferredMessages(int p0) {}
    protected final boolean hasDeferredMessages(int p0) { return false; }
    protected final boolean hasMessages(int p0) { return false; }
    protected final boolean isQuit(android.os.Message p0) { return false; }
    public final void quit() {}
    public final void quitNow() {}
    public boolean isDbg() { return false; }
    public void setDbg(boolean p0) {}
    public void start() {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public java.lang.String toString() { return null; }
    protected void logAndAddLogRec(java.lang.String p0) {}
    protected void log(java.lang.String p0) {}
    protected void logd(java.lang.String p0) {}
    protected void logv(java.lang.String p0) {}
    protected void logi(java.lang.String p0) {}
    protected void logw(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    protected void loge(java.lang.String p0, java.lang.Throwable p1) {}

    public static class LogRec {
        LogRec(com.android.internal.util.StateMachine p0, android.os.Message p1, java.lang.String p2, com.android.internal.util.IState p3, com.android.internal.util.IState p4, com.android.internal.util.IState p5) {}
        public void update(com.android.internal.util.StateMachine p0, android.os.Message p1, java.lang.String p2, com.android.internal.util.IState p3, com.android.internal.util.IState p4, com.android.internal.util.IState p5) {}
        public long getTime() { return 0L; }
        public long getWhat() { return 0L; }
        public java.lang.String getInfo() { return null; }
        public com.android.internal.util.IState getState() { return null; }
        public com.android.internal.util.IState getDestState() { return null; }
        public com.android.internal.util.IState getOriginalState() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class LogRecords {
        synchronized void setSize(int p0) {}
        synchronized void setLogOnlyTransitions(boolean p0) {}
        synchronized boolean logOnlyTransitions() { return false; }
        synchronized int size() { return 0; }
        synchronized int count() { return 0; }
        synchronized void cleanup() {}
        synchronized com.android.internal.util.StateMachine.LogRec get(int p0) { return null; }
        synchronized void add(com.android.internal.util.StateMachine p0, android.os.Message p1, java.lang.String p2, com.android.internal.util.IState p3, com.android.internal.util.IState p4, com.android.internal.util.IState p5) {}
    }

    private static class SmHandler extends android.os.Handler {
        public final void handleMessage(android.os.Message p0) {}

        private class HaltingState extends com.android.internal.util.State {
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        private class QuittingState extends com.android.internal.util.State {
            public boolean processMessage(android.os.Message p0) { return false; }
        }

        private class StateInfo {
            com.android.internal.util.State state;
            com.android.internal.util.StateMachine.SmHandler.StateInfo parentStateInfo;
            boolean active;
            public java.lang.String toString() { return null; }
        }
    }
}
