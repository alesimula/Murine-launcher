package android.telecom;

public abstract class CallScreeningService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.CallScreeningService";
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
        public void screenCall(com.android.internal.telecom.ICallScreeningAdapter p0, android.telecom.ParcelableCall p1) {}
    }

    public static class ParcelableCallResponse implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.telecom.CallScreeningService.ParcelableCallResponse> CREATOR = null;
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
