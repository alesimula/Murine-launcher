package android.telecom;

public abstract class CallScreeningService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.CallScreeningService";
    private static final int MSG_SCREEN_CALL = 1;
    private final android.os.Handler mHandler = null;
    private com.android.internal.telecom.ICallScreeningAdapter mCallScreeningAdapter;
    public CallScreeningService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
    public abstract void onScreenCall(android.telecom.Call.Details p0);
    public final void respondToCall(android.telecom.Call.Details p0, android.telecom.CallScreeningService.CallResponse p1) {}

    public static class CallResponse {
        public static final int CALL_COMPOSER_ATTACHMENT_PICTURE = 1;
        public static final int CALL_COMPOSER_ATTACHMENT_LOCATION = 2;
        public static final int CALL_COMPOSER_ATTACHMENT_SUBJECT = 4;
        public static final int CALL_COMPOSER_ATTACHMENT_PRIORITY = 8;
        private static final int NUM_CALL_COMPOSER_ATTACHMENT_TYPES = 4;
        private final boolean mShouldDisallowCall = false;
        private final boolean mShouldRejectCall = false;
        private final boolean mShouldSilenceCall = false;
        private final boolean mShouldSkipCallLog = false;
        private final boolean mShouldSkipNotification = false;
        private final boolean mShouldScreenCallViaAudioProcessing = false;
        private final int mCallComposerAttachmentsToShow = 0;
        private CallResponse(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, int p6) {}
        public boolean getDisallowCall() { return false; }
        public boolean getRejectCall() { return false; }
        public boolean getSilenceCall() { return false; }
        public boolean getSkipCallLog() { return false; }
        public boolean getSkipNotification() { return false; }
        public boolean getShouldScreenCallViaAudioProcessing() { return false; }
        public int getCallComposerAttachmentsToShow() { return 0; }
        public android.telecom.CallScreeningService.ParcelableCallResponse toParcelable() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }

        public static class Builder {
            private boolean mShouldDisallowCall;
            private boolean mShouldRejectCall;
            private boolean mShouldSilenceCall;
            private boolean mShouldSkipCallLog;
            private boolean mShouldSkipNotification;
            private boolean mShouldScreenCallViaAudioProcessing;
            private int mCallComposerAttachmentsToShow;
            public Builder() {}
            public android.telecom.CallScreeningService.CallResponse.Builder setDisallowCall(boolean p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse.Builder setRejectCall(boolean p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse.Builder setSilenceCall(boolean p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse.Builder setSkipCallLog(boolean p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse.Builder setSkipNotification(boolean p0) { return null; }
            @android.annotation.SystemApi
            @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_OUTPUT")
            public android.telecom.CallScreeningService.CallResponse.Builder setShouldScreenCallViaAudioProcessing(boolean p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse.Builder setCallComposerAttachmentsToShow(int p0) { return null; }
            public android.telecom.CallScreeningService.CallResponse build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CallComposerAttachmentType {
        }
    }

    private final class CallScreeningBinder extends com.android.internal.telecom.ICallScreeningService.Stub {
        private CallScreeningBinder(android.telecom.CallScreeningService p0) { super(); }
        public void screenCall(com.android.internal.telecom.ICallScreeningAdapter p0, android.telecom.ParcelableCall p1) {}
    }

    public static class ParcelableCallResponse implements android.os.Parcelable {
        private final boolean mShouldDisallowCall = false;
        private final boolean mShouldRejectCall = false;
        private final boolean mShouldSilenceCall = false;
        private final boolean mShouldSkipCallLog = false;
        private final boolean mShouldSkipNotification = false;
        private final boolean mShouldScreenCallViaAudioProcessing = false;
        private final int mCallComposerAttachmentsToShow = 0;
        public static final android.os.Parcelable.Creator<android.telecom.CallScreeningService.ParcelableCallResponse> CREATOR = null;
        private ParcelableCallResponse(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, int p6) {}
        protected ParcelableCallResponse(android.os.Parcel p0) {}
        public android.telecom.CallScreeningService.CallResponse toCallResponse() { return null; }
        public boolean shouldDisallowCall() { return false; }
        public boolean shouldRejectCall() { return false; }
        public boolean shouldSilenceCall() { return false; }
        public boolean shouldSkipCallLog() { return false; }
        public boolean shouldSkipNotification() { return false; }
        public boolean shouldScreenCallViaAudioProcessing() { return false; }
        public int getCallComposerAttachmentsToShow() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
