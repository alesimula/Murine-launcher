package com.android.internal.os;

@java.lang.Deprecated
public class HandlerCaller {
    final android.os.Looper mMainLooper = null;
    final android.os.Handler mH = null;
    final com.android.internal.os.HandlerCaller.Callback mCallback = null;
    public HandlerCaller(android.content.Context p0, android.os.Looper p1, com.android.internal.os.HandlerCaller.Callback p2, boolean p3) {}
    public android.os.Handler getHandler() { return null; }
    public void executeOrSendMessage(android.os.Message p0) {}
    public void sendMessageDelayed(android.os.Message p0, long p1) {}
    public boolean hasMessages(int p0) { return false; }
    public void removeMessages(int p0) {}
    public void removeMessages(int p0, java.lang.Object p1) {}
    public void sendMessage(android.os.Message p0) {}
    public com.android.internal.os.SomeArgs sendMessageAndWait(android.os.Message p0) { return null; }
    public android.os.Message obtainMessage(int p0) { return null; }
    public android.os.Message obtainMessageBO(int p0, boolean p1, java.lang.Object p2) { return null; }
    public android.os.Message obtainMessageBOO(int p0, boolean p1, java.lang.Object p2, java.lang.Object p3) { return null; }
    public android.os.Message obtainMessageO(int p0, java.lang.Object p1) { return null; }
    public android.os.Message obtainMessageI(int p0, int p1) { return null; }
    public android.os.Message obtainMessageII(int p0, int p1, int p2) { return null; }
    public android.os.Message obtainMessageIO(int p0, int p1, java.lang.Object p2) { return null; }
    public android.os.Message obtainMessageIIO(int p0, int p1, int p2, java.lang.Object p3) { return null; }
    public android.os.Message obtainMessageIIOO(int p0, int p1, int p2, java.lang.Object p3, java.lang.Object p4) { return null; }
    public android.os.Message obtainMessageIOO(int p0, int p1, java.lang.Object p2, java.lang.Object p3) { return null; }
    public android.os.Message obtainMessageIOOO(int p0, int p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4) { return null; }
    public android.os.Message obtainMessageIIOOO(int p0, int p1, int p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5) { return null; }
    public android.os.Message obtainMessageIIOOOO(int p0, int p1, int p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6) { return null; }
    public android.os.Message obtainMessageOO(int p0, java.lang.Object p1, java.lang.Object p2) { return null; }
    public android.os.Message obtainMessageOOO(int p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) { return null; }
    public android.os.Message obtainMessageOOOO(int p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4) { return null; }
    public android.os.Message obtainMessageOOOOO(int p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5) { return null; }
    public android.os.Message obtainMessageOOOOII(int p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, int p5, int p6) { return null; }
    public android.os.Message obtainMessageIIII(int p0, int p1, int p2, int p3, int p4) { return null; }
    public android.os.Message obtainMessageIIIIII(int p0, int p1, int p2, int p3, int p4, int p5, int p6) { return null; }
    public android.os.Message obtainMessageIIIIO(int p0, int p1, int p2, int p3, int p4, java.lang.Object p5) { return null; }

    public static interface Callback {
        public void executeMessage(android.os.Message p0);
    }

    class MyHandler extends android.os.Handler {
        MyHandler(com.android.internal.os.HandlerCaller p0, android.os.Looper p1, boolean p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
