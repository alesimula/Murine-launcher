package com.android.internal.telephony;

public class IccProvider extends android.content.ContentProvider {
    protected static final int ADN = 1;
    protected static final int ADN_SUB = 2;
    protected static final int FDN = 3;
    protected static final int FDN_SUB = 4;
    protected static final int SDN = 5;
    protected static final int SDN_SUB = 6;
    protected static final int ADN_ALL = 7;
    public static final java.lang.String STR_TAG = "tag";
    public static final java.lang.String STR_NUMBER = "number";
    public static final java.lang.String STR_EMAILS = "emails";
    public static final java.lang.String STR_ANRS = "anrs";
    public static final java.lang.String STR_NEW_TAG = "newTag";
    public static final java.lang.String STR_NEW_NUMBER = "newNumber";
    public static final java.lang.String STR_NEW_EMAILS = "newEmails";
    public static final java.lang.String STR_NEW_ANRS = "newAnrs";
    public static final java.lang.String STR_PIN2 = "pin2";
    public IccProvider() { super(); }
    public boolean onCreate() { return false; }
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    public java.lang.String getType(android.net.Uri p0) { return null; }
    public android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) { return null; }
    public int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    public int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }
}
