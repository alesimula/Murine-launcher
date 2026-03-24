package com.android.internal.protolog;

public interface IProtoLogConfigurationService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.protolog.IProtoLogConfigurationService";
    public void registerClient(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs p1) throws android.os.RemoteException;
    public void registerGroups(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterGroupsArgs p1) throws android.os.RemoteException;
    public void unregisterClient(com.android.internal.protolog.IProtoLogClient p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.protolog.IProtoLogConfigurationService {
        public Default() {}
        public void registerClient(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs p1) throws android.os.RemoteException {}
        public void registerGroups(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterGroupsArgs p1) throws android.os.RemoteException {}
        public void unregisterClient(com.android.internal.protolog.IProtoLogClient p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static class RegisterClientArgs implements android.os.Parcelable {
        public java.lang.String[] groups;
        public boolean[] groupsDefaultLogcatStatus;
        public java.lang.String viewerConfigFile;
        public static final android.os.Parcelable.Creator<com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs> CREATOR = null;
        public RegisterClientArgs() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class RegisterGroupsArgs implements android.os.Parcelable {
        public java.lang.String[] groups;
        public boolean[] groupsDefaultLogcatStatus;
        public static final android.os.Parcelable.Creator<com.android.internal.protolog.IProtoLogConfigurationService.RegisterGroupsArgs> CREATOR = null;
        public RegisterGroupsArgs() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.protolog.IProtoLogConfigurationService {
        static final int TRANSACTION_registerClient = 1;
        static final int TRANSACTION_registerGroups = 2;
        static final int TRANSACTION_unregisterClient = 3;
        public Stub() { super(); }
        public static com.android.internal.protolog.IProtoLogConfigurationService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.protolog.IProtoLogConfigurationService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerClient(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterClientArgs p1) throws android.os.RemoteException {}
            public void registerGroups(com.android.internal.protolog.IProtoLogClient p0, com.android.internal.protolog.IProtoLogConfigurationService.RegisterGroupsArgs p1) throws android.os.RemoteException {}
            public void unregisterClient(com.android.internal.protolog.IProtoLogClient p0) throws android.os.RemoteException {}
        }
    }
}
