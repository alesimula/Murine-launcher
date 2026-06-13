package app.murinelauncher.widget.accessibility

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import com.android.launcher3.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class AlertDialogSheet : BottomSheetDialogFragment() {

    override fun getTheme(): Int =
        com.android.settingslib.widget.theme.R.style.Theme_SettingsLib_BottomSheetDialog

    private var onAcceptListener: (() -> Unit)? = null

    fun setOnAcceptListener(listener: () -> Unit) {
        onAcceptListener = listener
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.alert_dialog_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = requireArguments()
        view.findViewById<TextView>(R.id.title).text = args.getString(ARG_TITLE)
        view.findViewById<TextView>(R.id.description).text = args.getString(ARG_MESSAGE)

        view.findViewById<Button>(R.id.ok_button).setOnClickListener {
            onAcceptListener?.invoke()
            dismiss()
        }
        view.findViewById<Button>(R.id.cancel_button).setOnClickListener {
            dismiss()
        }
    }

    companion object {
        private const val ARG_TITLE = "title"
        private const val ARG_MESSAGE = "message"

        @JvmStatic @JvmOverloads
        fun show(activity: FragmentActivity, title: String, message: String, isCancelable: Boolean = true, onAccept: Runnable): AlertDialogSheet {
            val sheet = AlertDialogSheet()
            sheet.arguments = Bundle().apply {
                putString(ARG_TITLE, title)
                putString(ARG_MESSAGE, message)
            }
            sheet.isCancelable = isCancelable
            sheet.setOnAcceptListener { onAccept.run() }
            sheet.show(activity.supportFragmentManager, "AlertDialogSheet")
            return sheet
        }
    }
}
