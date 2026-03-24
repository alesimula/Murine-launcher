package com.google.android.mms.util;

public final class PduCache extends com.google.android.mms.util.AbstractCache<android.net.Uri, com.google.android.mms.util.PduCacheEntry> {
    private static final java.lang.String TAG = "PduCache";
    private static final boolean DEBUG = false;
    private static final boolean LOCAL_LOGV = false;
    private static final int MMS_ALL = 0;
    private static final int MMS_ALL_ID = 1;
    private static final int MMS_INBOX = 2;
    private static final int MMS_INBOX_ID = 3;
    private static final int MMS_SENT = 4;
    private static final int MMS_SENT_ID = 5;
    private static final int MMS_DRAFTS = 6;
    private static final int MMS_DRAFTS_ID = 7;
    private static final int MMS_OUTBOX = 8;
    private static final int MMS_OUTBOX_ID = 9;
    private static final int MMS_CONVERSATION = 10;
    private static final int MMS_CONVERSATION_ID = 11;
    private static final android.content.UriMatcher URI_MATCHER = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> MATCH_TO_MSGBOX_ID_MAP = null;
    private static com.google.android.mms.util.PduCache sInstance;
    private final java.util.HashMap<java.lang.Integer, java.util.HashSet<android.net.Uri>> mMessageBoxes = null;
    private final java.util.HashMap<java.lang.Long, java.util.HashSet<android.net.Uri>> mThreads = null;
    private final java.util.HashSet<android.net.Uri> mUpdating = null;
    private PduCache() { super(); }
    public static final synchronized com.google.android.mms.util.PduCache getInstance() { return null; }
    public synchronized boolean put(android.net.Uri p0, com.google.android.mms.util.PduCacheEntry p1) { return false; }
    public synchronized void setUpdating(android.net.Uri p0, boolean p1) {}
    public synchronized boolean isUpdating(android.net.Uri p0) { return false; }
    public synchronized com.google.android.mms.util.PduCacheEntry purge(android.net.Uri p0) { return null; }
    private com.google.android.mms.util.PduCacheEntry purgeSingleEntry(android.net.Uri p0) { return null; }
    public synchronized void purgeAll() {}
    private android.net.Uri normalizeKey(android.net.Uri p0) { return null; }
    private void purgeByMessageBox(java.lang.Integer p0) {}
    private void removeFromThreads(android.net.Uri p0, com.google.android.mms.util.PduCacheEntry p1) {}
    private void purgeByThreadId(long p0) {}
    private void removeFromMessageBoxes(android.net.Uri p0, com.google.android.mms.util.PduCacheEntry p1) {}
}
