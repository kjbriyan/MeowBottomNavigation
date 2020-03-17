package com.example.meowbottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment(OrderFragment.newIntance())
        navigation.add(MeowBottomNavigation.Model(1,R.drawable.iconorderactv))
        navigation.add(MeowBottomNavigation.Model(2,R.drawable.iconchat))
        navigation.add(MeowBottomNavigation.Model(3,R.drawable.iconpromoactv))
        navigation.add(MeowBottomNavigation.Model(4,R.drawable.iconsubmitactv))
        navigation.add(MeowBottomNavigation.Model(5,R.drawable.iconaccount))

        navigation.setOnClickMenuListener{
            when(it.id){
                1 -> setFragment(OrderFragment.newIntance())
                2 -> setFragment(ChatFragment.newIntance())
                3 -> setFragment(PromoFragment.newIntance())
                4 -> setFragment(SubmitFragment.newIntance())
                5 -> setFragment(AcountFragment.newIntance())

                else -> " "
            }
        }
        navigation.show(1)
    }

    fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.framelayout, fragment, "MainActivity")
            .commit()
    }
}



