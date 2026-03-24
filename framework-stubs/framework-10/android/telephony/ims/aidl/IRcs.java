package android.telephony.ims.aidl;

public interface IRcs extends android.os.IInterface {
    public android.telephony.ims.RcsThreadQueryResultParcelable getRcsThreads(android.telephony.ims.RcsThreadQueryParams p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.ims.RcsThreadQueryResultParcelable getRcsThreadsWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.ims.RcsParticipantQueryResultParcelable getParticipants(android.telephony.ims.RcsParticipantQueryParams p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.ims.RcsParticipantQueryResultParcelable getParticipantsWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.ims.RcsMessageQueryResultParcelable getMessages(android.telephony.ims.RcsMessageQueryParams p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.ims.RcsMessageQueryResultParcelable getMessagesWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.ims.RcsEventQueryResultDescriptor getEvents(android.telephony.ims.RcsEventQueryParams p0, java.lang.String p1) throws android.os.RemoteException;
    public android.telephony.ims.RcsEventQueryResultDescriptor getEventsWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean deleteThread(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int createRcs1To1Thread(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int createGroupThread(int[] p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3) throws android.os.RemoteException;
    public int addIncomingMessage(int p0, android.telephony.ims.RcsIncomingMessageCreationParams p1, java.lang.String p2) throws android.os.RemoteException;
    public int addOutgoingMessage(int p0, android.telephony.ims.RcsOutgoingMessageCreationParams p1, java.lang.String p2) throws android.os.RemoteException;
    public void deleteMessage(int p0, boolean p1, int p2, boolean p3, java.lang.String p4) throws android.os.RemoteException;
    public android.telephony.ims.RcsMessageSnippet getMessageSnippet(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void set1To1ThreadFallbackThreadId(int p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public long get1To1ThreadFallbackThreadId(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int get1To1ThreadOtherParticipantId(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setGroupThreadName(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getGroupThreadName(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setGroupThreadIcon(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException;
    public android.net.Uri getGroupThreadIcon(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setGroupThreadOwner(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getGroupThreadOwner(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setGroupThreadConferenceUri(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException;
    public android.net.Uri getGroupThreadConferenceUri(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void addParticipantToGroupThread(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void removeParticipantFromGroupThread(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int createRcsParticipant(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getRcsParticipantCanonicalAddress(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getRcsParticipantAlias(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setRcsParticipantAlias(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getRcsParticipantContactId(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setRcsParticipantContactId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setMessageSubId(int p0, boolean p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public int getMessageSubId(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void setMessageStatus(int p0, boolean p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public int getMessageStatus(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void setMessageOriginationTimestamp(int p0, boolean p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public long getMessageOriginationTimestamp(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void setGlobalMessageIdForMessage(int p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public java.lang.String getGlobalMessageIdForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void setMessageArrivalTimestamp(int p0, boolean p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public long getMessageArrivalTimestamp(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void setMessageSeenTimestamp(int p0, boolean p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public long getMessageSeenTimestamp(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void setTextForMessage(int p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public java.lang.String getTextForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void setLatitudeForMessage(int p0, boolean p1, double p2, java.lang.String p3) throws android.os.RemoteException;
    public double getLatitudeForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public void setLongitudeForMessage(int p0, boolean p1, double p2, java.lang.String p3) throws android.os.RemoteException;
    public double getLongitudeForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public int[] getFileTransfersAttachedToMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException;
    public int getSenderParticipant(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int[] getMessageRecipients(int p0, java.lang.String p1) throws android.os.RemoteException;
    public long getOutgoingDeliveryDeliveredTimestamp(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setOutgoingDeliveryDeliveredTimestamp(int p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public long getOutgoingDeliverySeenTimestamp(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setOutgoingDeliverySeenTimestamp(int p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public int getOutgoingDeliveryStatus(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setOutgoingDeliveryStatus(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public int storeFileTransfer(int p0, boolean p1, android.telephony.ims.RcsFileTransferCreationParams p2, java.lang.String p3) throws android.os.RemoteException;
    public void deleteFileTransfer(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferSessionId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getFileTransferSessionId(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferContentUri(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException;
    public android.net.Uri getFileTransferContentUri(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferContentType(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getFileTransferContentType(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferFileSize(int p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public long getFileTransferFileSize(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferTransferOffset(int p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public long getFileTransferTransferOffset(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferStatus(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getFileTransferStatus(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferWidth(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getFileTransferWidth(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferHeight(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getFileTransferHeight(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferLength(int p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public long getFileTransferLength(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferPreviewUri(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException;
    public android.net.Uri getFileTransferPreviewUri(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setFileTransferPreviewType(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.lang.String getFileTransferPreviewType(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int createGroupThreadNameChangedEvent(long p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    public int createGroupThreadIconChangedEvent(long p0, int p1, int p2, android.net.Uri p3, java.lang.String p4) throws android.os.RemoteException;
    public int createGroupThreadParticipantJoinedEvent(long p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public int createGroupThreadParticipantLeftEvent(long p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public int createParticipantAliasChangedEvent(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IRcs {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IRcs";
        static final int TRANSACTION_getRcsThreads = 1;
        static final int TRANSACTION_getRcsThreadsWithToken = 2;
        static final int TRANSACTION_getParticipants = 3;
        static final int TRANSACTION_getParticipantsWithToken = 4;
        static final int TRANSACTION_getMessages = 5;
        static final int TRANSACTION_getMessagesWithToken = 6;
        static final int TRANSACTION_getEvents = 7;
        static final int TRANSACTION_getEventsWithToken = 8;
        static final int TRANSACTION_deleteThread = 9;
        static final int TRANSACTION_createRcs1To1Thread = 10;
        static final int TRANSACTION_createGroupThread = 11;
        static final int TRANSACTION_addIncomingMessage = 12;
        static final int TRANSACTION_addOutgoingMessage = 13;
        static final int TRANSACTION_deleteMessage = 14;
        static final int TRANSACTION_getMessageSnippet = 15;
        static final int TRANSACTION_set1To1ThreadFallbackThreadId = 16;
        static final int TRANSACTION_get1To1ThreadFallbackThreadId = 17;
        static final int TRANSACTION_get1To1ThreadOtherParticipantId = 18;
        static final int TRANSACTION_setGroupThreadName = 19;
        static final int TRANSACTION_getGroupThreadName = 20;
        static final int TRANSACTION_setGroupThreadIcon = 21;
        static final int TRANSACTION_getGroupThreadIcon = 22;
        static final int TRANSACTION_setGroupThreadOwner = 23;
        static final int TRANSACTION_getGroupThreadOwner = 24;
        static final int TRANSACTION_setGroupThreadConferenceUri = 25;
        static final int TRANSACTION_getGroupThreadConferenceUri = 26;
        static final int TRANSACTION_addParticipantToGroupThread = 27;
        static final int TRANSACTION_removeParticipantFromGroupThread = 28;
        static final int TRANSACTION_createRcsParticipant = 29;
        static final int TRANSACTION_getRcsParticipantCanonicalAddress = 30;
        static final int TRANSACTION_getRcsParticipantAlias = 31;
        static final int TRANSACTION_setRcsParticipantAlias = 32;
        static final int TRANSACTION_getRcsParticipantContactId = 33;
        static final int TRANSACTION_setRcsParticipantContactId = 34;
        static final int TRANSACTION_setMessageSubId = 35;
        static final int TRANSACTION_getMessageSubId = 36;
        static final int TRANSACTION_setMessageStatus = 37;
        static final int TRANSACTION_getMessageStatus = 38;
        static final int TRANSACTION_setMessageOriginationTimestamp = 39;
        static final int TRANSACTION_getMessageOriginationTimestamp = 40;
        static final int TRANSACTION_setGlobalMessageIdForMessage = 41;
        static final int TRANSACTION_getGlobalMessageIdForMessage = 42;
        static final int TRANSACTION_setMessageArrivalTimestamp = 43;
        static final int TRANSACTION_getMessageArrivalTimestamp = 44;
        static final int TRANSACTION_setMessageSeenTimestamp = 45;
        static final int TRANSACTION_getMessageSeenTimestamp = 46;
        static final int TRANSACTION_setTextForMessage = 47;
        static final int TRANSACTION_getTextForMessage = 48;
        static final int TRANSACTION_setLatitudeForMessage = 49;
        static final int TRANSACTION_getLatitudeForMessage = 50;
        static final int TRANSACTION_setLongitudeForMessage = 51;
        static final int TRANSACTION_getLongitudeForMessage = 52;
        static final int TRANSACTION_getFileTransfersAttachedToMessage = 53;
        static final int TRANSACTION_getSenderParticipant = 54;
        static final int TRANSACTION_getMessageRecipients = 55;
        static final int TRANSACTION_getOutgoingDeliveryDeliveredTimestamp = 56;
        static final int TRANSACTION_setOutgoingDeliveryDeliveredTimestamp = 57;
        static final int TRANSACTION_getOutgoingDeliverySeenTimestamp = 58;
        static final int TRANSACTION_setOutgoingDeliverySeenTimestamp = 59;
        static final int TRANSACTION_getOutgoingDeliveryStatus = 60;
        static final int TRANSACTION_setOutgoingDeliveryStatus = 61;
        static final int TRANSACTION_storeFileTransfer = 62;
        static final int TRANSACTION_deleteFileTransfer = 63;
        static final int TRANSACTION_setFileTransferSessionId = 64;
        static final int TRANSACTION_getFileTransferSessionId = 65;
        static final int TRANSACTION_setFileTransferContentUri = 66;
        static final int TRANSACTION_getFileTransferContentUri = 67;
        static final int TRANSACTION_setFileTransferContentType = 68;
        static final int TRANSACTION_getFileTransferContentType = 69;
        static final int TRANSACTION_setFileTransferFileSize = 70;
        static final int TRANSACTION_getFileTransferFileSize = 71;
        static final int TRANSACTION_setFileTransferTransferOffset = 72;
        static final int TRANSACTION_getFileTransferTransferOffset = 73;
        static final int TRANSACTION_setFileTransferStatus = 74;
        static final int TRANSACTION_getFileTransferStatus = 75;
        static final int TRANSACTION_setFileTransferWidth = 76;
        static final int TRANSACTION_getFileTransferWidth = 77;
        static final int TRANSACTION_setFileTransferHeight = 78;
        static final int TRANSACTION_getFileTransferHeight = 79;
        static final int TRANSACTION_setFileTransferLength = 80;
        static final int TRANSACTION_getFileTransferLength = 81;
        static final int TRANSACTION_setFileTransferPreviewUri = 82;
        static final int TRANSACTION_getFileTransferPreviewUri = 83;
        static final int TRANSACTION_setFileTransferPreviewType = 84;
        static final int TRANSACTION_getFileTransferPreviewType = 85;
        static final int TRANSACTION_createGroupThreadNameChangedEvent = 86;
        static final int TRANSACTION_createGroupThreadIconChangedEvent = 87;
        static final int TRANSACTION_createGroupThreadParticipantJoinedEvent = 88;
        static final int TRANSACTION_createGroupThreadParticipantLeftEvent = 89;
        static final int TRANSACTION_createParticipantAliasChangedEvent = 90;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IRcs asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IRcs p0) { return false; }
        public static android.telephony.ims.aidl.IRcs getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IRcs {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IRcs sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.telephony.ims.RcsThreadQueryResultParcelable getRcsThreads(android.telephony.ims.RcsThreadQueryParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsThreadQueryResultParcelable getRcsThreadsWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsParticipantQueryResultParcelable getParticipants(android.telephony.ims.RcsParticipantQueryParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsParticipantQueryResultParcelable getParticipantsWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsMessageQueryResultParcelable getMessages(android.telephony.ims.RcsMessageQueryParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsMessageQueryResultParcelable getMessagesWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsEventQueryResultDescriptor getEvents(android.telephony.ims.RcsEventQueryParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.telephony.ims.RcsEventQueryResultDescriptor getEventsWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean deleteThread(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public int createRcs1To1Thread(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int createGroupThread(int[] p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public int addIncomingMessage(int p0, android.telephony.ims.RcsIncomingMessageCreationParams p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int addOutgoingMessage(int p0, android.telephony.ims.RcsOutgoingMessageCreationParams p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void deleteMessage(int p0, boolean p1, int p2, boolean p3, java.lang.String p4) throws android.os.RemoteException {}
            public android.telephony.ims.RcsMessageSnippet getMessageSnippet(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void set1To1ThreadFallbackThreadId(int p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
            public long get1To1ThreadFallbackThreadId(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
            public int get1To1ThreadOtherParticipantId(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void setGroupThreadName(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.lang.String getGroupThreadName(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setGroupThreadIcon(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.net.Uri getGroupThreadIcon(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setGroupThreadOwner(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getGroupThreadOwner(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void setGroupThreadConferenceUri(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.net.Uri getGroupThreadConferenceUri(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void addParticipantToGroupThread(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void removeParticipantFromGroupThread(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public int createRcsParticipant(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public java.lang.String getRcsParticipantCanonicalAddress(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getRcsParticipantAlias(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setRcsParticipantAlias(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.lang.String getRcsParticipantContactId(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setRcsParticipantContactId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setMessageSubId(int p0, boolean p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public int getMessageSubId(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void setMessageStatus(int p0, boolean p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public int getMessageStatus(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void setMessageOriginationTimestamp(int p0, boolean p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
            public long getMessageOriginationTimestamp(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
            public void setGlobalMessageIdForMessage(int p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public java.lang.String getGlobalMessageIdForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void setMessageArrivalTimestamp(int p0, boolean p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
            public long getMessageArrivalTimestamp(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
            public void setMessageSeenTimestamp(int p0, boolean p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
            public long getMessageSeenTimestamp(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
            public void setTextForMessage(int p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public java.lang.String getTextForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void setLatitudeForMessage(int p0, boolean p1, double p2, java.lang.String p3) throws android.os.RemoteException {}
            public double getLatitudeForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0.0; }
            public void setLongitudeForMessage(int p0, boolean p1, double p2, java.lang.String p3) throws android.os.RemoteException {}
            public double getLongitudeForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0.0; }
            public int[] getFileTransfersAttachedToMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public int getSenderParticipant(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int[] getMessageRecipients(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public long getOutgoingDeliveryDeliveredTimestamp(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
            public void setOutgoingDeliveryDeliveredTimestamp(int p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
            public long getOutgoingDeliverySeenTimestamp(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
            public void setOutgoingDeliverySeenTimestamp(int p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
            public int getOutgoingDeliveryStatus(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void setOutgoingDeliveryStatus(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public int storeFileTransfer(int p0, boolean p1, android.telephony.ims.RcsFileTransferCreationParams p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public void deleteFileTransfer(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setFileTransferSessionId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.lang.String getFileTransferSessionId(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setFileTransferContentUri(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.net.Uri getFileTransferContentUri(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setFileTransferContentType(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.lang.String getFileTransferContentType(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setFileTransferFileSize(int p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
            public long getFileTransferFileSize(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
            public void setFileTransferTransferOffset(int p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
            public long getFileTransferTransferOffset(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
            public void setFileTransferStatus(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getFileTransferStatus(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void setFileTransferWidth(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getFileTransferWidth(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void setFileTransferHeight(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getFileTransferHeight(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void setFileTransferLength(int p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
            public long getFileTransferLength(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
            public void setFileTransferPreviewUri(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.net.Uri getFileTransferPreviewUri(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setFileTransferPreviewType(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.lang.String getFileTransferPreviewType(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public int createGroupThreadNameChangedEvent(long p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public int createGroupThreadIconChangedEvent(long p0, int p1, int p2, android.net.Uri p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public int createGroupThreadParticipantJoinedEvent(long p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public int createGroupThreadParticipantLeftEvent(long p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public int createParticipantAliasChangedEvent(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements android.telephony.ims.aidl.IRcs {
        public Default() {}
        public android.telephony.ims.RcsThreadQueryResultParcelable getRcsThreads(android.telephony.ims.RcsThreadQueryParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsThreadQueryResultParcelable getRcsThreadsWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsParticipantQueryResultParcelable getParticipants(android.telephony.ims.RcsParticipantQueryParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsParticipantQueryResultParcelable getParticipantsWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsMessageQueryResultParcelable getMessages(android.telephony.ims.RcsMessageQueryParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsMessageQueryResultParcelable getMessagesWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsEventQueryResultDescriptor getEvents(android.telephony.ims.RcsEventQueryParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.telephony.ims.RcsEventQueryResultDescriptor getEventsWithToken(android.telephony.ims.RcsQueryContinuationToken p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean deleteThread(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public int createRcs1To1Thread(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int createGroupThread(int[] p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public int addIncomingMessage(int p0, android.telephony.ims.RcsIncomingMessageCreationParams p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int addOutgoingMessage(int p0, android.telephony.ims.RcsOutgoingMessageCreationParams p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void deleteMessage(int p0, boolean p1, int p2, boolean p3, java.lang.String p4) throws android.os.RemoteException {}
        public android.telephony.ims.RcsMessageSnippet getMessageSnippet(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void set1To1ThreadFallbackThreadId(int p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
        public long get1To1ThreadFallbackThreadId(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public int get1To1ThreadOtherParticipantId(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void setGroupThreadName(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.lang.String getGroupThreadName(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setGroupThreadIcon(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.net.Uri getGroupThreadIcon(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setGroupThreadOwner(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getGroupThreadOwner(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void setGroupThreadConferenceUri(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.net.Uri getGroupThreadConferenceUri(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void addParticipantToGroupThread(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void removeParticipantFromGroupThread(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public int createRcsParticipant(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public java.lang.String getRcsParticipantCanonicalAddress(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getRcsParticipantAlias(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setRcsParticipantAlias(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.lang.String getRcsParticipantContactId(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setRcsParticipantContactId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setMessageSubId(int p0, boolean p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public int getMessageSubId(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void setMessageStatus(int p0, boolean p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public int getMessageStatus(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void setMessageOriginationTimestamp(int p0, boolean p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
        public long getMessageOriginationTimestamp(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
        public void setGlobalMessageIdForMessage(int p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public java.lang.String getGlobalMessageIdForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void setMessageArrivalTimestamp(int p0, boolean p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
        public long getMessageArrivalTimestamp(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
        public void setMessageSeenTimestamp(int p0, boolean p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
        public long getMessageSeenTimestamp(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
        public void setTextForMessage(int p0, boolean p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public java.lang.String getTextForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void setLatitudeForMessage(int p0, boolean p1, double p2, java.lang.String p3) throws android.os.RemoteException {}
        public double getLatitudeForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0.0; }
        public void setLongitudeForMessage(int p0, boolean p1, double p2, java.lang.String p3) throws android.os.RemoteException {}
        public double getLongitudeForMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return 0.0; }
        public int[] getFileTransfersAttachedToMessage(int p0, boolean p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public int getSenderParticipant(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int[] getMessageRecipients(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public long getOutgoingDeliveryDeliveredTimestamp(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
        public void setOutgoingDeliveryDeliveredTimestamp(int p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
        public long getOutgoingDeliverySeenTimestamp(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
        public void setOutgoingDeliverySeenTimestamp(int p0, int p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
        public int getOutgoingDeliveryStatus(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void setOutgoingDeliveryStatus(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public int storeFileTransfer(int p0, boolean p1, android.telephony.ims.RcsFileTransferCreationParams p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public void deleteFileTransfer(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setFileTransferSessionId(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.lang.String getFileTransferSessionId(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setFileTransferContentUri(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.net.Uri getFileTransferContentUri(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setFileTransferContentType(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.lang.String getFileTransferContentType(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setFileTransferFileSize(int p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
        public long getFileTransferFileSize(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public void setFileTransferTransferOffset(int p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
        public long getFileTransferTransferOffset(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public void setFileTransferStatus(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getFileTransferStatus(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void setFileTransferWidth(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getFileTransferWidth(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void setFileTransferHeight(int p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getFileTransferHeight(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void setFileTransferLength(int p0, long p1, java.lang.String p2) throws android.os.RemoteException {}
        public long getFileTransferLength(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public void setFileTransferPreviewUri(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.net.Uri getFileTransferPreviewUri(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setFileTransferPreviewType(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.lang.String getFileTransferPreviewType(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public int createGroupThreadNameChangedEvent(long p0, int p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public int createGroupThreadIconChangedEvent(long p0, int p1, int p2, android.net.Uri p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public int createGroupThreadParticipantJoinedEvent(long p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public int createGroupThreadParticipantLeftEvent(long p0, int p1, int p2, int p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public int createParticipantAliasChangedEvent(long p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}
