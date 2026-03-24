package android.content.pm;

@android.annotation.SystemApi
public final class SuspendDialogInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = null;
    private static final java.lang.String XML_ATTR_ICON_RES_ID = "iconResId";
    private static final java.lang.String XML_ATTR_TITLE_RES_ID = "titleResId";
    private static final java.lang.String XML_ATTR_DIALOG_MESSAGE_RES_ID = "dialogMessageResId";
    private static final java.lang.String XML_ATTR_DIALOG_MESSAGE = "dialogMessage";
    private static final java.lang.String XML_ATTR_BUTTON_TEXT_RES_ID = "buttonTextResId";
    private static final java.lang.String XML_ATTR_BUTTON_ACTION = "buttonAction";
    private final int mIconResId = 0;
    private final int mTitleResId = 0;
    private final int mDialogMessageResId = 0;
    private final java.lang.String mDialogMessage = null;
    private final int mNeutralButtonTextResId = 0;
    private final int mNeutralButtonAction = 0;
    public static final int BUTTON_ACTION_MORE_DETAILS = 0;
    public static final int BUTTON_ACTION_UNSUSPEND = 1;
    public static final android.os.Parcelable.Creator<android.content.pm.SuspendDialogInfo> CREATOR = null;
    public int getIconResId() { return 0; }
    public int getTitleResId() { return 0; }
    public int getDialogMessageResId() { return 0; }
    public java.lang.String getDialogMessage() { return null; }
    public int getNeutralButtonTextResId() { return 0; }
    public int getNeutralButtonAction() { return 0; }
    public void saveToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public static android.content.pm.SuspendDialogInfo restoreFromXml(org.xmlpull.v1.XmlPullParser p0) { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private SuspendDialogInfo(android.os.Parcel p0) {}
    SuspendDialogInfo(android.content.pm.SuspendDialogInfo.Builder p0) {}

    public static final class Builder {
        private int mDialogMessageResId;
        private java.lang.String mDialogMessage;
        private int mTitleResId;
        private int mIconResId;
        private int mNeutralButtonTextResId;
        private int mNeutralButtonAction;
        public Builder() {}
        public android.content.pm.SuspendDialogInfo.Builder setIcon(int p0) { return null; }
        public android.content.pm.SuspendDialogInfo.Builder setTitle(int p0) { return null; }
        public android.content.pm.SuspendDialogInfo.Builder setMessage(java.lang.String p0) { return null; }
        public android.content.pm.SuspendDialogInfo.Builder setMessage(int p0) { return null; }
        public android.content.pm.SuspendDialogInfo.Builder setNeutralButtonText(int p0) { return null; }
        public android.content.pm.SuspendDialogInfo.Builder setNeutralButtonAction(int p0) { return null; }
        public android.content.pm.SuspendDialogInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ButtonAction {
    }
}
