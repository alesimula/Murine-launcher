package android.service.notification;

@android.annotation.SystemApi
public final class Adjustment implements android.os.Parcelable {
    private final java.lang.String mPackage = null;
    private final java.lang.String mKey = null;
    private final java.lang.CharSequence mExplanation = null;
    private final android.os.Bundle mSignals = null;
    private final int mUser = 0;
    private java.lang.String mIssuer;
    @android.annotation.SystemApi
    public static final java.lang.String KEY_PEOPLE = "key_people";
    public static final java.lang.String KEY_SNOOZE_CRITERIA = "key_snooze_criteria";
    public static final java.lang.String KEY_GROUP_KEY = "key_group_key";
    public static final java.lang.String KEY_USER_SENTIMENT = "key_user_sentiment";
    public static final java.lang.String KEY_CONTEXTUAL_ACTIONS = "key_contextual_actions";
    public static final java.lang.String KEY_TEXT_REPLIES = "key_text_replies";
    public static final java.lang.String KEY_IMPORTANCE = "key_importance";
    public static final android.os.Parcelable.Creator<android.service.notification.Adjustment> CREATOR = null;
    @android.annotation.SystemApi
    public Adjustment(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, java.lang.CharSequence p3, int p4) {}
    public Adjustment(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, java.lang.CharSequence p3, android.os.UserHandle p4) {}
    @android.annotation.SystemApi
    protected Adjustment(android.os.Parcel p0) {}
    public java.lang.String getPackage() { return null; }
    public java.lang.String getKey() { return null; }
    public java.lang.CharSequence getExplanation() { return null; }
    public android.os.Bundle getSignals() { return null; }
    @android.annotation.SystemApi
    public int getUser() { return 0; }
    public android.os.UserHandle getUserHandle() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void setIssuer(java.lang.String p0) {}
    public java.lang.String getIssuer() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Keys {
    }
}
