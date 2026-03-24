package com.android.internal.telephony.cat;

public class CatCmdMessage implements android.os.Parcelable {
    com.android.internal.telephony.cat.CommandDetails mCmdDet;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.cat.CatCmdMessage> CREATOR = null;
    CatCmdMessage(com.android.internal.telephony.cat.CommandParams p0) {}
    public CatCmdMessage(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public com.android.internal.telephony.cat.AppInterface.CommandType getCmdType() { return null; }
    public com.android.internal.telephony.cat.Menu getMenu() { return null; }
    public com.android.internal.telephony.cat.Input geInput() { return null; }
    public com.android.internal.telephony.cat.TextMessage geTextMessage() { return null; }
    public com.android.internal.telephony.cat.CatCmdMessage.BrowserSettings getBrowserSettings() { return null; }
    public com.android.internal.telephony.cat.ToneSettings getToneSettings() { return null; }
    public com.android.internal.telephony.cat.CatCmdMessage.CallSettings getCallSettings() { return null; }
    public com.android.internal.telephony.cat.CatCmdMessage.SetupEventListSettings getSetEventList() { return null; }
    public boolean hasIconLoadFailed() { return false; }

    public class BrowserSettings {
        public java.lang.String url;
        public com.android.internal.telephony.cat.LaunchBrowserMode mode;
        public BrowserSettings(com.android.internal.telephony.cat.CatCmdMessage p0) {}
    }

    public final class BrowserTerminationCauses {
        public static final int USER_TERMINATION = 0;
        public static final int ERROR_TERMINATION = 1;
        public BrowserTerminationCauses(com.android.internal.telephony.cat.CatCmdMessage p0) {}
    }

    public class CallSettings {
        public com.android.internal.telephony.cat.TextMessage confirmMsg;
        public com.android.internal.telephony.cat.TextMessage callMsg;
        public CallSettings(com.android.internal.telephony.cat.CatCmdMessage p0) {}
    }

    public final class SetupEventListConstants {
        public static final int USER_ACTIVITY_EVENT = 4;
        public static final int IDLE_SCREEN_AVAILABLE_EVENT = 5;
        public static final int LANGUAGE_SELECTION_EVENT = 7;
        public static final int BROWSER_TERMINATION_EVENT = 8;
        public static final int BROWSING_STATUS_EVENT = 15;
        public SetupEventListConstants(com.android.internal.telephony.cat.CatCmdMessage p0) {}
    }

    public class SetupEventListSettings {
        public int[] eventList;
        public SetupEventListSettings(com.android.internal.telephony.cat.CatCmdMessage p0) {}
    }

    public class SMSSettings {
        public com.android.internal.telephony.cat.TextMessage smsText;
        public com.android.internal.telephony.cat.TextMessage destAddr;
        public SMSSettings(com.android.internal.telephony.cat.CatCmdMessage p0) {}
    }
}
