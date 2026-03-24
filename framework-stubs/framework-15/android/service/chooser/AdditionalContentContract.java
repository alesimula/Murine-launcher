package android.service.chooser;

@android.annotation.FlaggedApi("android.service.chooser.chooser_payload_toggling")
public interface AdditionalContentContract {

    public static interface Columns {
        public static final java.lang.String URI = "uri";
    }

    public static interface CursorExtraKeys {
        public static final java.lang.String POSITION = "position";
    }

    public static interface MethodNames {
        public static final java.lang.String ON_SELECTION_CHANGED = "onSelectionChanged";
    }
}
