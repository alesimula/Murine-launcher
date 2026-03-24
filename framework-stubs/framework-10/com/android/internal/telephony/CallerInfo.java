package com.android.internal.telephony;

public class CallerInfo {
    private static final java.lang.String TAG = "CallerInfo";
    private static final boolean VDBG = Boolean.valueOf(false);
    public static final long USER_TYPE_CURRENT = 0L;
    public static final long USER_TYPE_WORK = 1L;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String name;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String phoneNumber;
    public java.lang.String normalizedNumber;
    public java.lang.String geoDescription;
    public java.lang.String cnapName;
    public int numberPresentation;
    public int namePresentation;
    public boolean contactExists;
    public java.lang.String phoneLabel;
    @android.annotation.UnsupportedAppUsage
    public int numberType;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String numberLabel;
    public int photoResource;
    @android.annotation.UnsupportedAppUsage
    public long contactIdOrZero;
    public boolean needUpdate;
    public android.net.Uri contactRefUri;
    public java.lang.String lookupKey;
    public android.content.ComponentName preferredPhoneAccountComponent;
    public java.lang.String preferredPhoneAccountId;
    public long userType;
    public android.net.Uri contactDisplayPhotoUri;
    public android.net.Uri contactRingtoneUri;
    public boolean shouldSendToVoicemail;
    public android.graphics.drawable.Drawable cachedPhoto;
    public android.graphics.Bitmap cachedPhotoIcon;
    public boolean isCachedPhotoCurrent;
    private boolean mIsEmergency;
    private boolean mIsVoiceMail;
    @android.annotation.UnsupportedAppUsage
    public CallerInfo() {}
    public static com.android.internal.telephony.CallerInfo getCallerInfo(android.content.Context p0, android.net.Uri p1, android.database.Cursor p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static com.android.internal.telephony.CallerInfo getCallerInfo(android.content.Context p0, android.net.Uri p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static com.android.internal.telephony.CallerInfo getCallerInfo(android.content.Context p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static com.android.internal.telephony.CallerInfo getCallerInfo(android.content.Context p0, java.lang.String p1, int p2) { return null; }
    static com.android.internal.telephony.CallerInfo doSecondaryLookupIfNecessary(android.content.Context p0, java.lang.String p1, com.android.internal.telephony.CallerInfo p2) { return null; }
    public boolean isEmergencyNumber() { return false; }
    public boolean isVoiceMailNumber() { return false; }
    com.android.internal.telephony.CallerInfo markAsEmergency(android.content.Context p0) { return null; }
    com.android.internal.telephony.CallerInfo markAsVoiceMail() { return null; }
    com.android.internal.telephony.CallerInfo markAsVoiceMail(int p0) { return null; }
    private static java.lang.String normalize(java.lang.String p0) { return null; }
    private static int getColumnIndexForPersonId(android.net.Uri p0, android.database.Cursor p1) { return 0; }
    public void updateGeoDescription(android.content.Context p0, java.lang.String p1) {}
    public static java.lang.String getGeoDescription(android.content.Context p0, java.lang.String p1) { return null; }
    private static java.lang.String getCurrentCountryIso(android.content.Context p0, java.util.Locale p1) { return null; }
    protected static java.lang.String getCurrentCountryIso(android.content.Context p0) { return null; }
    public java.lang.String toString() { return null; }
}
