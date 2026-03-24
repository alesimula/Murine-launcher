package com.google.android.mms.util;

public final class PduCache extends com.google.android.mms.util.AbstractCache<android.net.Uri, com.google.android.mms.util.PduCacheEntry> {
    public static final synchronized com.google.android.mms.util.PduCache getInstance() { return null; }
    public synchronized boolean put(android.net.Uri p0, com.google.android.mms.util.PduCacheEntry p1) { return false; }
    public synchronized void setUpdating(android.net.Uri p0, boolean p1) {}
    public synchronized boolean isUpdating(android.net.Uri p0) { return false; }
    public synchronized com.google.android.mms.util.PduCacheEntry purge(android.net.Uri p0) { return null; }
    public synchronized void purgeAll() {}
}
