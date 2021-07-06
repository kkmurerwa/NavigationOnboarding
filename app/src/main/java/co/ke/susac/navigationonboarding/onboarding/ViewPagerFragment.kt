package co.ke.susac.navigationonboarding.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import co.ke.susac.navigationonboarding.R
import co.ke.susac.navigationonboarding.databinding.FragmentViewPagerBinding
import co.ke.susac.navigationonboarding.onboarding.screens.FirstScreen
import co.ke.susac.navigationonboarding.onboarding.screens.SecondScreen
import co.ke.susac.navigationonboarding.onboarding.screens.ThirdScreen

class ViewPagerFragment : Fragment(R.layout.fragment_view_pager) {
    private var binding: FragmentViewPagerBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentViewPagerBinding.bind(view)

//        val view = binding!!.root

        val fragmentList = arrayListOf(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding!!.viewpagerOnboarding.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}