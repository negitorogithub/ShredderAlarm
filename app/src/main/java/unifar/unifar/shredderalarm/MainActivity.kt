package unifar.unifar.shredderalarm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.omise.android.ui.CreditCardActivity
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showCreditCardForm()
    }

    private fun showCreditCardForm() {
        val intent = Intent(this, CreditCardActivity::class.java)
        intent.putExtra(CreditCardActivity.EXTRA_PKEY, OMISE_PKEY)
        startActivityForResult(intent, REQUEST_CC)
    }

    companion object {
        private const val OMISE_PKEY = "pkey_test_123"
        private const val REQUEST_CC = 100
    }
}
