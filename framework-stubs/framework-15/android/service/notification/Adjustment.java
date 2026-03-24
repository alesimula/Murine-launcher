package android.service.notification;

@android.annotation.SystemApi
public final class Adjustment implements android.os.Parcelable {
    @android.annotation.SystemApi
    public static final java.lang.String KEY_PEOPLE = "key_people";
    public static final java.lang.String KEY_SNOOZE_CRITERIA = "key_snooze_criteria";
    public static final java.lang.String KEY_GROUP_KEY = "key_group_key";
    public static final java.lang.String KEY_USER_SENTIMENT = "key_user_sentiment";
    public static final java.lang.String KEY_CONTEXTUAL_ACTIONS = "key_contextual_actions";
    public static final java.lang.String KEY_TEXT_REPLIES = "key_text_replies";
    public static final java.lang.String KEY_IMPORTANCE = "key_importance";
    public static final java.lang.String KEY_IMPORTANCE_PROPOSAL = "key_importance_proposal";
    public static final java.lang.String KEY_SENSITIVE_CONTENT = "key_sensitive_content";
    public static final java.lang.String KEY_RANKING_SCORE = "key_ranking_score";
    @android.annotation.SystemApi
    public static final java.lang.String KEY_NOT_CONVERSATION = "key_not_conversation";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.notification.Adjustment> CREATOR = null;
    @android.annotation.SystemApi
    public Adjustment(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, java.lang.CharSequence p3, int p4) {}
    public Adjustment(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, java.lang.CharSequence p3, android.os.UserHandle p4) {}
    @android.annotation.SystemApi
    protected Adjustment(android.os.Parcel p0) {}
    @android.annotation.NonNull
    public java.lang.String getPackage() { return null; }
    @android.annotation.NonNull
    public java.lang.String getKey() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getExplanation() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getSignals() { return null; }
    @android.annotation.SystemApi
    public int getUser() { return 0; }
    @android.annotation.NonNull
    public android.os.UserHandle getUserHandle() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void setIssuer(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getIssuer() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Keys {
    }
}
