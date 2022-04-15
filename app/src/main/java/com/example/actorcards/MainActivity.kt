package com.example.actorcards

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actorcards.ui.theme.ActorCardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FullContent()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ActorCardsTheme {
        Row(modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        }
        FullContent()
    }
}
@Composable
private fun FullContent()
{
    Column() {
        ListItem(name = "Vin Diezel", profession = "Family", image = (R.drawable.diezel))
        ListItem(name = "Snoop Dogg", profession = "Musician", image = (R.drawable.snoopy_doopi))
        ListItem(name = "Ryan Gosling", profession = "Actor", image = (R.drawable.gosling))
        ListItem(name = "Jason Statham", profession = "Actor", image = (R.drawable.statham))
        ListItem(name = "Dwayn Johnson", profession = "Scala", image = (R.drawable.johnson))
        ListItem(name = "NoName", profession = "No work", image = (R.drawable.bomz))
    }
}
@Composable
private fun ListItem(name: String, profession: String, image:Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.padding(10.dp))
        {
            Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
               Image(
                    painter = painterResource(id = image),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column() {
                    Text(text = name)
                    Text(text = profession)
                }
            }
        }
    }
}



