package com.example.layoutapp.screen

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.layoutapp.ui.theme.Pink80
import com.example.layoutapp.ui.theme.Pink40
import com.example.layoutapp.ui.theme.Purple80
import com.example.layoutapp.ui.theme.PurpleGrey40

@Preview
@Composable
fun MyConstraintLayout(){
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PurpleGrey40)
    ) {

        val (boxA, boxB, boxC) = createRefs()

        //BoxA
        Box(
            modifier = Modifier.size(100.dp) // dp pour les dimensions, sp pour la police de texte
                .background(color = Pink80)
                .constrainAs(ref = boxA){
                    top.linkTo(anchor = parent.top)
                    bottom.linkTo(anchor = parent.bottom)
                    start.linkTo(anchor = parent.start)
                    end.linkTo(anchor = parent.end)
                }
        )
        //BoxB
        Box(
            modifier = Modifier.size(100.dp) // dp pour les dimensions, sp pour la police de texte
                .background(color = Pink40)
                .constrainAs(ref = boxB){
                    bottom.linkTo(anchor = parent.bottom)
                    start.linkTo(anchor = parent.start)
                    end.linkTo(anchor = parent.end)
                }
        )
        //BoxC
        Box(
            modifier = Modifier.size(100.dp) // dp pour les dimensions, sp pour la police de texte
                .background(color = Purple80)
                .constrainAs(ref = boxC){
                    top.linkTo(anchor = boxA.bottom)
                    bottom.linkTo(anchor = boxB.top)
                    start.linkTo(anchor = parent.start)
                    end.linkTo(anchor = parent.end)
                }
        )
    }
}