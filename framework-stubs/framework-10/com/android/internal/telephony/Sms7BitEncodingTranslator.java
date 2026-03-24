package com.android.internal.telephony;

public class Sms7BitEncodingTranslator {
    private static final java.lang.String TAG = "Sms7BitEncodingTranslator";
    private static final boolean DBG = Boolean.valueOf(false);
    private static boolean mIs7BitTranslationTableLoaded;
    private static android.util.SparseIntArray mTranslationTable;
    private static android.util.SparseIntArray mTranslationTableCommon;
    private static android.util.SparseIntArray mTranslationTableGSM;
    private static android.util.SparseIntArray mTranslationTableCDMA;
    private static final java.lang.String XML_START_TAG = "SmsEnforce7BitTranslationTable";
    private static final java.lang.String XML_TRANSLATION_TYPE_TAG = "TranslationType";
    private static final java.lang.String XML_CHARACTOR_TAG = "Character";
    private static final java.lang.String XML_FROM_TAG = "from";
    private static final java.lang.String XML_TO_TAG = "to";
    public Sms7BitEncodingTranslator() {}
    public static java.lang.String translate(java.lang.CharSequence p0, boolean p1) { return null; }
    private static char translateIfNeeded(char p0, boolean p1) { return 0; }
    private static boolean noTranslationNeeded(char p0, boolean p1) { return false; }
    private static void load7BitTranslationTableFromXml() {}
}
