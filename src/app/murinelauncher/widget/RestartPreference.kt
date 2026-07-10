package app.murinelauncher.widget

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import com.android.launcher3.BuildConfig
import com.android.launcher3.Utilities

class RestartPreference @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : Preference(context, attrs) {
    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        if (BuildConfig.DEBUG) {
            // Long press three times to crash
            var crashCountdown = 3
            holder.itemView.setOnLongClickListener {
                if (crashCountdown == 0) {
                    val testException = object : RuntimeException("You") {}
                    Handler(Looper.getMainLooper()).postDelayed({
                        val recoveryHandler = Thread.getDefaultUncaughtExceptionHandler()
                        if (recoveryHandler == null) throw testException
                        else recoveryHandler.uncaughtException(Thread.currentThread(), testException)
                    }, 250)
                } else {
                    Toast.makeText(context, "${crashCountdown}...", Toast.LENGTH_SHORT).show()
                    crashCountdown--
                }
                true
            }
        }
    }

    override fun onClick() {
        Utilities.uwu(context)
        (context as? Activity ?: (context as? ContextWrapper)?.baseContext as? Activity)?.finish()
        Utilities.restart()
    }
}