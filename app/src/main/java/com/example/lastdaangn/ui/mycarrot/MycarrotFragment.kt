package com.example.lastdaangn.ui.mycarrot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lastdaangn.databinding.FragmentMycarrotBinding

class MycarrotFragment : Fragment() {

private var _binding: FragmentMycarrotBinding? = null

  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
      binding.scrollview.setOnScrollChangeListener{ v, scrollX, scrollY, oldScrollX, oldScrollY ->
          //스크롤 아래로
          if(scrollY > oldScrollY){
              /*
              val anim = TranslateAnimation(0f, binding.loading.width.toFloat(), 0f, 0f)
              anim.duration = 100
               */
          }
          // 스크롤 위로
          if (scrollY + 5 < oldScrollY) {
              /*
              val anim =
                  TranslateAnimation(binding.toyUploadBtn.width.toFloat() + 1000, 0f, 0f, 0f)
              anim.duration = 100
               */
              binding.btnSetting.visibility = View.VISIBLE
              binding.tvNavMenu.visibility = View.VISIBLE
          }
      }
    return binding.root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}