package android.service.autofill;

public final class SaveInfo implements android.os.Parcelable {
    public static final int SAVE_DATA_TYPE_GENERIC = 0;
    public static final int SAVE_DATA_TYPE_PASSWORD = 1;
    public static final int SAVE_DATA_TYPE_ADDRESS = 2;
    public static final int SAVE_DATA_TYPE_CREDIT_CARD = 4;
    public static final int SAVE_DATA_TYPE_USERNAME = 8;
    public static final int SAVE_DATA_TYPE_EMAIL_ADDRESS = 16;
    public static final int NEGATIVE_BUTTON_STYLE_CANCEL = 0;
    public static final int NEGATIVE_BUTTON_STYLE_REJECT = 1;
    public static final int FLAG_SAVE_ON_ALL_VIEWS_INVISIBLE = 1;
    public static final int FLAG_DONT_SAVE_ON_FINISH = 2;
    public static final int FLAG_DELAY_SAVE = 4;
    private final int mType = 0;
    private final int mNegativeButtonStyle = 0;
    private final android.content.IntentSender mNegativeActionListener = null;
    private final android.view.autofill.AutofillId[] mRequiredIds = null;
    private final android.view.autofill.AutofillId[] mOptionalIds = null;
    private final java.lang.CharSequence mDescription = null;
    private final int mFlags = 0;
    private final android.service.autofill.CustomDescription mCustomDescription = null;
    private final android.service.autofill.InternalValidator mValidator = null;
    private final android.service.autofill.InternalSanitizer[] mSanitizerKeys = null;
    private final android.view.autofill.AutofillId[][] mSanitizerValues = null;
    private final android.view.autofill.AutofillId mTriggerId = null;
    public static final android.os.Parcelable.Creator<android.service.autofill.SaveInfo> CREATOR = null;
    private SaveInfo(android.service.autofill.SaveInfo.Builder p0) {}
    public int getNegativeActionStyle() { return 0; }
    public android.content.IntentSender getNegativeActionListener() { return null; }
    public android.view.autofill.AutofillId[] getRequiredIds() { return null; }
    public android.view.autofill.AutofillId[] getOptionalIds() { return null; }
    public int getType() { return 0; }
    public int getFlags() { return 0; }
    public java.lang.CharSequence getDescription() { return null; }
    public android.service.autofill.CustomDescription getCustomDescription() { return null; }
    public android.service.autofill.InternalValidator getValidator() { return null; }
    public android.service.autofill.InternalSanitizer[] getSanitizerKeys() { return null; }
    public android.view.autofill.AutofillId[][] getSanitizerValues() { return null; }
    public android.view.autofill.AutofillId getTriggerId() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface SaveInfoFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface SaveDataType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface NegativeButtonStyle {
    }

    public static final class Builder {
        private final int mType = 0;
        private int mNegativeButtonStyle;
        private android.content.IntentSender mNegativeActionListener;
        private final android.view.autofill.AutofillId[] mRequiredIds = null;
        private android.view.autofill.AutofillId[] mOptionalIds;
        private java.lang.CharSequence mDescription;
        private boolean mDestroyed;
        private int mFlags;
        private android.service.autofill.CustomDescription mCustomDescription;
        private android.service.autofill.InternalValidator mValidator;
        private android.util.ArrayMap<android.service.autofill.InternalSanitizer, android.view.autofill.AutofillId[]> mSanitizers;
        private android.util.ArraySet<android.view.autofill.AutofillId> mSanitizerIds;
        private android.view.autofill.AutofillId mTriggerId;
        public Builder(int p0, android.view.autofill.AutofillId[] p1) {}
        public Builder(int p0) {}
        public android.service.autofill.SaveInfo.Builder setFlags(int p0) { return null; }
        public android.service.autofill.SaveInfo.Builder setOptionalIds(android.view.autofill.AutofillId[] p0) { return null; }
        public android.service.autofill.SaveInfo.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.service.autofill.SaveInfo.Builder setCustomDescription(android.service.autofill.CustomDescription p0) { return null; }
        public android.service.autofill.SaveInfo.Builder setNegativeAction(int p0, android.content.IntentSender p1) { return null; }
        public android.service.autofill.SaveInfo.Builder setValidator(android.service.autofill.Validator p0) { return null; }
        public android.service.autofill.SaveInfo.Builder addSanitizer(android.service.autofill.Sanitizer p0, android.view.autofill.AutofillId... p1) { return null; }
        public android.service.autofill.SaveInfo.Builder setTriggerId(android.view.autofill.AutofillId p0) { return null; }
        public android.service.autofill.SaveInfo build() { return null; }
        private void throwIfDestroyed() {}
    }
}
