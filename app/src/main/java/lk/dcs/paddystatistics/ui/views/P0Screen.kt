package lk.dcs.paddystatistics.ui.views

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import androidx.navigation.NavController
import lk.dcs.paddystatistics.R

@Composable
fun P0Screen(context: Context, navController: NavController) {

    var expanded by remember { mutableStateOf(false) }
    val suggestions = listOf("2022/2023", "2023/2024", "2024/2025", "2025/2026", "2026/2027", "2027/2028", "2028/2029", "2029/2030")
    var selectedText by remember { mutableStateOf("") }

    var textfieldSize by remember { mutableStateOf(Size.Zero)}

    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

//    irrigation
    var expandedI by remember { mutableStateOf(false) }
    val suggestionsI = listOf("Major", "Minor", "Rainfed")
    var selectedTextI by remember { mutableStateOf("") }

    var textfieldSizeI by remember { mutableStateOf(Size.Zero)}

    val iconI = if (expandedI)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bg_main4),
            contentDescription = "bg",
            modifier = Modifier.fillMaxSize().blur(50.dp),
            contentScale = ContentScale.Crop

        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "P0 Records",
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
            )


//            OutlinedTextField(
//                value = "",
//                onValueChange = { /*vm.username.value = it*/ },
//                label = { Text(text = "Year") },
//                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
//                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
//                modifier = Modifier.padding(15.dp).fillMaxWidth()
//            )
//            dropdown start
            OutlinedTextField(
                value = selectedText,
                onValueChange = { selectedText = it },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .onGloballyPositioned { coordinates ->
                        //This value is used to assign to the DropDown the same width
                        textfieldSize = coordinates.size.toSize()
                    },
                label = {Text("Year")},
                trailingIcon = {
                    Icon(icon,"contentDescription",
                        Modifier.clickable { expanded = !expanded })
                }
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .width(with(LocalDensity.current){textfieldSize.width.toDp()})
            ) {
                suggestions.forEach { label ->
                    DropdownMenuItem(onClick = {
                        selectedText = label
                        expanded = false
                    }) {
                        Text(text = label)
                    }
                }
            }

//            dropdown ends

            Text(
                text = "Irrigation System",
                style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Normal)
            )

            OutlinedTextField(
                value = selectedTextI,
                onValueChange = { selectedTextI = it },
                label = { Text(text = "Irrigation Type") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier.padding(15.dp).fillMaxWidth()
                    .onGloballyPositioned { coordinates ->
                        //This value is used to assign to the DropDown the same width
                        textfieldSizeI = coordinates.size.toSize()
                    },
                trailingIcon = {
                    Icon(iconI,"contentDescription",
                        Modifier.clickable { expandedI = !expandedI })
                }
            )
            DropdownMenu(
                expanded = expandedI,
                onDismissRequest = { expandedI = false },
                modifier = Modifier
                    .width(with(LocalDensity.current){textfieldSizeI.width.toDp()})
            ) {
                suggestionsI.forEach { label ->
                    DropdownMenuItem(onClick = {
                        selectedTextI = label
                        expandedI = false
                    }) {
                        Text(text = label)
                    }
                }
            }


            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Acre") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier.padding(15.dp).fillMaxWidth()
            )

            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Reason") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier.padding(15.dp).fillMaxWidth()
            )


            Text(
                text = "Cultivate Land",
                style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Normal)
            )

            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Acre") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier.padding(15.dp).fillMaxWidth()
            )

            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Rood") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier.padding(15.dp).fillMaxWidth()
            )


            OutlinedTextField(
                value = "",
                onValueChange = { /*vm.username.value = it*/ },
                label = { Text(text = "Perches") },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                textStyle = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
                modifier = Modifier.padding(15.dp).fillMaxWidth()
            )

            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
                    .height(50.dp)
                    .width(385.dp),
                onClick = {

                }
            ) {
                Text(
                    text = "Next",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
    }
}