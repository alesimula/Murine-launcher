package app.murinelauncher.widget

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.util.AttributeSet
import android.widget.Toast
import androidx.preference.Preference
import com.android.launcher3.Utilities

class RestartPreference @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : Preference(context, attrs) {
    override fun onClick() {
        Toast.makeText(context, "\u003E\u2A4A\u003C", Toast.LENGTH_SHORT).show()
        (context as? Activity ?: (context as? ContextWrapper)?.baseContext as? Activity)?.finish()
        Utilities.restart()
    }
}