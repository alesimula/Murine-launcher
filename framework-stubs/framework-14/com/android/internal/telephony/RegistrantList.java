package com.android.internal.telephony;

public class RegistrantList {
    java.util.ArrayList registrants;
    public RegistrantList() {}
    public synchronized void add(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public synchronized void addUnique(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public synchronized void add(com.android.internal.telephony.Registrant p0) {}
    public synchronized void removeCleared() {}
    public synchronized void removeAll() {}
    public synchronized int size() { return 0; }
    public synchronized java.lang.Object get(int p0) { return null; }
    public void notifyRegistrants() {}
    public void notifyException(java.lang.Throwable p0) {}
    public void notifyResult(java.lang.Object p0) {}
    public void notifyRegistrants(android.os.AsyncResult p0) {}
    public synchronized void remove(android.os.Handler p0) {}
}
