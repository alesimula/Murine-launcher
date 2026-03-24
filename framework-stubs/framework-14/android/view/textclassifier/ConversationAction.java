package android.view.textclassifier;

public final class ConversationAction implements android.os.Parcelable {
    public static final java.lang.String TYPE_VIEW_CALENDAR = "view_calendar";
    public static final java.lang.String TYPE_VIEW_MAP = "view_map";
    public static final java.lang.String TYPE_TRACK_FLIGHT = "track_flight";
    public static final java.lang.String TYPE_OPEN_URL = "open_url";
    public static final java.lang.String TYPE_SEND_SMS = "send_sms";
    public static final java.lang.String TYPE_CALL_PHONE = "call_phone";
    public static final java.lang.String TYPE_SEND_EMAIL = "send_email";
    public static final java.lang.String TYPE_TEXT_REPLY = "text_reply";
    public static final java.lang.String TYPE_CREATE_REMINDER = "create_reminder";
    public static final java.lang.String TYPE_SHARE_LOCATION = "share_location";
    public static final java.lang.String TYPE_ADD_CONTACT = "add_contact";
    public static final java.lang.String TYPE_COPY = "copy";
    public static final android.os.Parcelable.Creator<android.view.textclassifier.ConversationAction> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String getType() { return null; }
    public android.app.RemoteAction getAction() { return null; }
    public float getConfidenceScore() { return 0.0f; }
    public java.lang.CharSequence getTextReply() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.view.textclassifier.ConversationAction.Builder toBuilder() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        public android.view.textclassifier.ConversationAction.Builder setAction(android.app.RemoteAction p0) { return null; }
        public android.view.textclassifier.ConversationAction.Builder setTextReply(java.lang.CharSequence p0) { return null; }
        public android.view.textclassifier.ConversationAction.Builder setConfidenceScore(float p0) { return null; }
        public android.view.textclassifier.ConversationAction.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.view.textclassifier.ConversationAction build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActionType {
    }
}
