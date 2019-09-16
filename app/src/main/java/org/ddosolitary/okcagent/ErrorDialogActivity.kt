package org.ddosolitary.okcagent

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

const val EXTRA_ERROR_MESSAGE = "org.ddosolitary.okcagent.extra.ERROR_MESSAGE"

class ErrorDialogActivity : Activity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_error_dialog)
		findViewById<TextView>(R.id.text_error).text =
			"%s: %s".format(
				getString(R.string.text_error),
				intent.getStringExtra(EXTRA_ERROR_MESSAGE)
			)
	}

	fun onClickOk(@Suppress("UNUSED_PARAMETER") view: View) {
		finish()
	}
}