package android.telecom;

public class CallerInfo {
    private static final java.lang.String TAG = "CallerInfo";
    private static final boolean VDBG = Boolean.valueOf(false);
    public static final long USER_TYPE_CURRENT = 0L;
    public static final long USER_TYPE_WORK = 1L;
    private java.lang.String name;
    private java.lang.String phoneNumber;
    public java.lang.String normalizedNumber;
    public java.lang.String geoDescription;
    public java.lang.String cnapName;
    public int numberPresentation;
    public int namePresentation;
    public boolean contactExists;
    public java.lang.String phoneLabel;
    public int numberType;
    public java.lang.String numberLabel;
    public int photoResource;
    private long contactIdOrZero;
    public boolean needUpdate;
    public android.net.Uri contactRefUri;
    public java.lang.String lookupKey;
    public android.content.ComponentName preferredPhoneAccountComponent;
    public java.lang.String preferredPhoneAccountId;
    public long userType;
    private android.net.Uri contactDisplayPhotoUri;
    public android.net.Uri contactRingtoneUri;
    public boolean shouldSendToVoicemail;
    public android.graphics.drawable.Drawable cachedPhoto;
    public android.graphics.Bitmap cachedPhotoIcon;
    public boolean isCachedPhotoCurrent;
    private boolean mIsEmergency;
    private boolean mIsVoiceMail;
    public CallerInfo() {}
    public static android.telecom.CallerInfo getCallerInfo(android.content.Context p0, android.net.Uri p1, android.database.Cursor p2) { return null; }
    public static android.telecom.CallerInfo getCallerInfo(android.content.Context p0, android.net.Uri p1) { return null; }
    public static android.telecom.CallerInfo getCallerInfo(android.content.Context p0, java.lang.String p1) { return null; }
    public static android.telecom.CallerInfo getCallerInfo(android.content.Context p0, java.lang.String p1, int p2) { return null; }
    public java.lang.String getName() { return null; }
    public void setName(java.lang.String p0) {}
    public java.lang.String getPhoneNumber() { return null; }
    public void setPhoneNumber(java.lang.String p0) {}
    public long getContactId() { return 0L; }
    public android.net.Uri getContactDisplayPhotoUri() { return null; }
    public void SetContactDisplayPhotoUri(android.net.Uri p0) {}
    static android.telecom.CallerInfo doSecondaryLookupIfNecessary(android.content.Context p0, java.lang.String p1, android.telecom.CallerInfo p2) { return null; }
    public boolean isEmergencyNumber() { return false; }
    public boolean isVoiceMailNumber() { return false; }
    android.telecom.CallerInfo markAsEmergency(android.content.Context p0) { return null; }
    android.telecom.CallerInfo markAsVoiceMail(android.content.Context p0, int p1) { return null; }
    private static java.lang.String normalize(java.lang.String p0) { return null; }
    private static int getColumnIndexForPersonId(android.net.Uri p0, android.database.Cursor p1) { return 0; }
    public void updateGeoDescription(android.content.Context p0, java.lang.String p1) {}
    public static java.lang.String getGeoDescription(android.content.Context p0, java.lang.String p1) { return null; }
    private static java.lang.String getCurrentCountryIso(android.content.Context p0, java.util.Locale p1) { return null; }
    protected static java.lang.String getCurrentCountryIso(android.content.Context p0) { return null; }
    public java.lang.String toString() { return null; }
}
