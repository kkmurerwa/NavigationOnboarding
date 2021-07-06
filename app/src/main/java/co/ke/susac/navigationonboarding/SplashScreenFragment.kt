package co.ke.susac.navigationonboarding

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class SplashScreenFragment : Fragment(R.layout.fragment_splash_screen) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        object : CountDownTimer(1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // Do nothing
            }

            override fun onFinish() {
                Navigation.findNavController(view).navigate(R.id.splash_screen_to_view_pager)
            }
        }.start()
    }
}