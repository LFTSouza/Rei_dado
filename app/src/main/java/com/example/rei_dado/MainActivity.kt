package com.example.rei_dado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.rei_dado.ui.theme.ButtonColor
import com.example.rei_dado.ui.theme.Rei_dadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Rei_dadoTheme(dynamicColor = false) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Body()
                }
            }
        }
    }
}


@Composable
fun Body( modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        Text(
            text = "Hora de rolar os dados!",
            fontSize = 30.sp,
            fontFamily = setFontFamily,
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.1.em,
            color = Color.White,
            modifier = modifier.padding(bottom = 20.dp)
            )

        Image(
            painter = painterResource(R.drawable.king_dice),
            contentDescription = "King Dice"
        )

        Button(
            onClick = {onclick()},
            colors = ButtonDefaults.buttonColors(
                containerColor = ButtonColor
            )
            ){
        Text("Jogar dados")
        }
    }
}

private fun onclick(){
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Rei_dadoTheme {
        Body()
    }
}

val setFontFamily = FontFamily(
    Font(R.font.dont_deal_with_deamon, FontWeight.Normal)
)
