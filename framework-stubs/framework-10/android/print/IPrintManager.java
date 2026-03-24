package android.print;

public interface IPrintManager extends android.os.IInterface {
    public java.util.List<android.print.PrintJobInfo> getPrintJobInfos(int p0, int p1) throws android.os.RemoteException;
    public android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId p0, int p1, int p2) throws android.os.RemoteException;
    public android.os.Bundle print(java.lang.String p0, android.print.IPrintDocumentAdapter p1, android.print.PrintAttributes p2, java.lang.String p3, int p4, int p5) throws android.os.RemoteException;
    public void cancelPrintJob(android.print.PrintJobId p0, int p1, int p2) throws android.os.RemoteException;
    public void restartPrintJob(android.print.PrintJobId p0, int p1, int p2) throws android.os.RemoteException;
    public void addPrintJobStateChangeListener(android.print.IPrintJobStateChangeListener p0, int p1, int p2) throws android.os.RemoteException;
    public void removePrintJobStateChangeListener(android.print.IPrintJobStateChangeListener p0, int p1) throws android.os.RemoteException;
    public void addPrintServicesChangeListener(android.print.IPrintServicesChangeListener p0, int p1) throws android.os.RemoteException;
    public void removePrintServicesChangeListener(android.print.IPrintServicesChangeListener p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.printservice.PrintServiceInfo> getPrintServices(int p0, int p1) throws android.os.RemoteException;
    public void setPrintServiceEnabled(android.content.ComponentName p0, boolean p1, int p2) throws android.os.RemoteException;
    public void addPrintServiceRecommendationsChangeListener(android.printservice.recommendation.IRecommendationsChangeListener p0, int p1) throws android.os.RemoteException;
    public void removePrintServiceRecommendationsChangeListener(android.printservice.recommendation.IRecommendationsChangeListener p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.printservice.recommendation.RecommendationInfo> getPrintServiceRecommendations(int p0) throws android.os.RemoteException;
    public void createPrinterDiscoverySession(android.print.IPrinterDiscoveryObserver p0, int p1) throws android.os.RemoteException;
    public void startPrinterDiscovery(android.print.IPrinterDiscoveryObserver p0, java.util.List<android.print.PrinterId> p1, int p2) throws android.os.RemoteException;
    public void stopPrinterDiscovery(android.print.IPrinterDiscoveryObserver p0, int p1) throws android.os.RemoteException;
    public void validatePrinters(java.util.List<android.print.PrinterId> p0, int p1) throws android.os.RemoteException;
    public void startPrinterStateTracking(android.print.PrinterId p0, int p1) throws android.os.RemoteException;
    public android.graphics.drawable.Icon getCustomPrinterIcon(android.print.PrinterId p0, int p1) throws android.os.RemoteException;
    public void stopPrinterStateTracking(android.print.PrinterId p0, int p1) throws android.os.RemoteException;
    public void destroyPrinterDiscoverySession(android.print.IPrinterDiscoveryObserver p0, int p1) throws android.os.RemoteException;
    public boolean getBindInstantServiceAllowed(int p0) throws android.os.RemoteException;
    public void setBindInstantServiceAllowed(int p0, boolean p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.print.IPrintManager {
        private static final java.lang.String DESCRIPTOR = "android.print.IPrintManager";
        static final int TRANSACTION_getPrintJobInfos = 1;
        static final int TRANSACTION_getPrintJobInfo = 2;
        static final int TRANSACTION_print = 3;
        static final int TRANSACTION_cancelPrintJob = 4;
        static final int TRANSACTION_restartPrintJob = 5;
        static final int TRANSACTION_addPrintJobStateChangeListener = 6;
        static final int TRANSACTION_removePrintJobStateChangeListener = 7;
        static final int TRANSACTION_addPrintServicesChangeListener = 8;
        static final int TRANSACTION_removePrintServicesChangeListener = 9;
        static final int TRANSACTION_getPrintServices = 10;
        static final int TRANSACTION_setPrintServiceEnabled = 11;
        static final int TRANSACTION_addPrintServiceRecommendationsChangeListener = 12;
        static final int TRANSACTION_removePrintServiceRecommendationsChangeListener = 13;
        static final int TRANSACTION_getPrintServiceRecommendations = 14;
        static final int TRANSACTION_createPrinterDiscoverySession = 15;
        static final int TRANSACTION_startPrinterDiscovery = 16;
        static final int TRANSACTION_stopPrinterDiscovery = 17;
        static final int TRANSACTION_validatePrinters = 18;
        static final int TRANSACTION_startPrinterStateTracking = 19;
        static final int TRANSACTION_getCustomPrinterIcon = 20;
        static final int TRANSACTION_stopPrinterStateTracking = 21;
        static final int TRANSACTION_destroyPrinterDiscoverySession = 22;
        static final int TRANSACTION_getBindInstantServiceAllowed = 23;
        static final int TRANSACTION_setBindInstantServiceAllowed = 24;
        public Stub() { super(); }
        public static android.print.IPrintManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.print.IPrintManager p0) { return false; }
        public static android.print.IPrintManager getDefaultImpl() { return null; }

        private static class Proxy implements android.print.IPrintManager {
            private android.os.IBinder mRemote;
            public static android.print.IPrintManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.print.PrintJobInfo> getPrintJobInfos(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.os.Bundle print(java.lang.String p0, android.print.IPrintDocumentAdapter p1, android.print.PrintAttributes p2, java.lang.String p3, int p4, int p5) throws android.os.RemoteException { return null; }
            public void cancelPrintJob(android.print.PrintJobId p0, int p1, int p2) throws android.os.RemoteException {}
            public void restartPrintJob(android.print.PrintJobId p0, int p1, int p2) throws android.os.RemoteException {}
            public void addPrintJobStateChangeListener(android.print.IPrintJobStateChangeListener p0, int p1, int p2) throws android.os.RemoteException {}
            public void removePrintJobStateChangeListener(android.print.IPrintJobStateChangeListener p0, int p1) throws android.os.RemoteException {}
            public void addPrintServicesChangeListener(android.print.IPrintServicesChangeListener p0, int p1) throws android.os.RemoteException {}
            public void removePrintServicesChangeListener(android.print.IPrintServicesChangeListener p0, int p1) throws android.os.RemoteException {}
            public java.util.List<android.printservice.PrintServiceInfo> getPrintServices(int p0, int p1) throws android.os.RemoteException { return null; }
            public void setPrintServiceEnabled(android.content.ComponentName p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void addPrintServiceRecommendationsChangeListener(android.printservice.recommendation.IRecommendationsChangeListener p0, int p1) throws android.os.RemoteException {}
            public void removePrintServiceRecommendationsChangeListener(android.printservice.recommendation.IRecommendationsChangeListener p0, int p1) throws android.os.RemoteException {}
            public java.util.List<android.printservice.recommendation.RecommendationInfo> getPrintServiceRecommendations(int p0) throws android.os.RemoteException { return null; }
            public void createPrinterDiscoverySession(android.print.IPrinterDiscoveryObserver p0, int p1) throws android.os.RemoteException {}
            public void startPrinterDiscovery(android.print.IPrinterDiscoveryObserver p0, java.util.List<android.print.PrinterId> p1, int p2) throws android.os.RemoteException {}
            public void stopPrinterDiscovery(android.print.IPrinterDiscoveryObserver p0, int p1) throws android.os.RemoteException {}
            public void validatePrinters(java.util.List<android.print.PrinterId> p0, int p1) throws android.os.RemoteException {}
            public void startPrinterStateTracking(android.print.PrinterId p0, int p1) throws android.os.RemoteException {}
            public android.graphics.drawable.Icon getCustomPrinterIcon(android.print.PrinterId p0, int p1) throws android.os.RemoteException { return null; }
            public void stopPrinterStateTracking(android.print.PrinterId p0, int p1) throws android.os.RemoteException {}
            public void destroyPrinterDiscoverySession(android.print.IPrinterDiscoveryObserver p0, int p1) throws android.os.RemoteException {}
            public boolean getBindInstantServiceAllowed(int p0) throws android.os.RemoteException { return false; }
            public void setBindInstantServiceAllowed(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.print.IPrintManager {
        public Default() {}
        public java.util.List<android.print.PrintJobInfo> getPrintJobInfos(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.print.PrintJobInfo getPrintJobInfo(android.print.PrintJobId p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.os.Bundle print(java.lang.String p0, android.print.IPrintDocumentAdapter p1, android.print.PrintAttributes p2, java.lang.String p3, int p4, int p5) throws android.os.RemoteException { return null; }
        public void cancelPrintJob(android.print.PrintJobId p0, int p1, int p2) throws android.os.RemoteException {}
        public void restartPrintJob(android.print.PrintJobId p0, int p1, int p2) throws android.os.RemoteException {}
        public void addPrintJobStateChangeListener(android.print.IPrintJobStateChangeListener p0, int p1, int p2) throws android.os.RemoteException {}
        public void removePrintJobStateChangeListener(android.print.IPrintJobStateChangeListener p0, int p1) throws android.os.RemoteException {}
        public void addPrintServicesChangeListener(android.print.IPrintServicesChangeListener p0, int p1) throws android.os.RemoteException {}
        public void removePrintServicesChangeListener(android.print.IPrintServicesChangeListener p0, int p1) throws android.os.RemoteException {}
        public java.util.List<android.printservice.PrintServiceInfo> getPrintServices(int p0, int p1) throws android.os.RemoteException { return null; }
        public void setPrintServiceEnabled(android.content.ComponentName p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void addPrintServiceRecommendationsChangeListener(android.printservice.recommendation.IRecommendationsChangeListener p0, int p1) throws android.os.RemoteException {}
        public void removePrintServiceRecommendationsChangeListener(android.printservice.recommendation.IRecommendationsChangeListener p0, int p1) throws android.os.RemoteException {}
        public java.util.List<android.printservice.recommendation.RecommendationInfo> getPrintServiceRecommendations(int p0) throws android.os.RemoteException { return null; }
        public void createPrinterDiscoverySession(android.print.IPrinterDiscoveryObserver p0, int p1) throws android.os.RemoteException {}
        public void startPrinterDiscovery(android.print.IPrinterDiscoveryObserver p0, java.util.List<android.print.PrinterId> p1, int p2) throws android.os.RemoteException {}
        public void stopPrinterDiscovery(android.print.IPrinterDiscoveryObserver p0, int p1) throws android.os.RemoteException {}
        public void validatePrinters(java.util.List<android.print.PrinterId> p0, int p1) throws android.os.RemoteException {}
        public void startPrinterStateTracking(android.print.PrinterId p0, int p1) throws android.os.RemoteException {}
        public android.graphics.drawable.Icon getCustomPrinterIcon(android.print.PrinterId p0, int p1) throws android.os.RemoteException { return null; }
        public void stopPrinterStateTracking(android.print.PrinterId p0, int p1) throws android.os.RemoteException {}
        public void destroyPrinterDiscoverySession(android.print.IPrinterDiscoveryObserver p0, int p1) throws android.os.RemoteException {}
        public boolean getBindInstantServiceAllowed(int p0) throws android.os.RemoteException { return false; }
        public void setBindInstantServiceAllowed(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
