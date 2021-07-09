package com.lucasesteves.catalagocervejas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager


class ImagensFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_imagens, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragments = listOf(
            ImageTabFragment.newInstance(0),
            ImageTabFragment.newInstance(1),
            ImageTabFragment.newInstance(2),
            ImageTabFragment.newInstance(3),
            ImageTabFragment.newInstance(4)
        )
        val fragmentsPageTitle = listOf("AAA", "BBB", "CCC", "DDD", "EEE")
        val musicCatalogViewPager = ViewPagerAdapter(
            fragments,
            fragmentsPageTitle,
            childFragmentManager
        )

        val viewPager = view.findViewById<ViewPager>(R.id.viewPagerImages)
        viewPager.adapter = musicCatalogViewPager
    }
}