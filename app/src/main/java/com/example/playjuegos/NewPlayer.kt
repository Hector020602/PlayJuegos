package com.example.playjuegos

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.playjuegos.ui.theme.NaranjaDiferennte

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewPlayer() {
    var newPlayerName by rememberSaveable { mutableStateOf("") }
    var newPlayerApellido by rememberSaveable { mutableStateOf("") }
    var newPlayerNickname by rememberSaveable { mutableStateOf("") }
    var newTelefono by rememberSaveable { mutableStateOf("") }
    var newEmail by rememberSaveable { mutableStateOf("") }

    var errorName by rememberSaveable { mutableStateOf("") }
    errorName = "*Obligatorio"
    var errorNickname by rememberSaveable { mutableStateOf("") }
    errorName = "*Obligatorio"

    Column(
    ) {
        Row {
            Image(painter = painterResource(id = R.drawable.account), modifier = Modifier.size(60.dp),
                contentDescription = "Nombre")
            Spacer(modifier = Modifier.size(40.dp))
            TextField(value = newPlayerName, onValueChange = {newPlayerName = it},label = { Text(text = "Nombre")}, shape = RoundedCornerShape(20.dp,20.dp,0.dp,0.dp))

        }
        Spacer(modifier = Modifier.size(20.dp))
        Row {
            Text(text = errorName)
        }

        Row {
            Spacer(modifier = Modifier.size(100.dp))
            TextField(value = newPlayerApellido, onValueChange = {newPlayerApellido = it},label = { Text(text = "Apellidos")}, shape = RoundedCornerShape(20.dp,20.dp,0.dp,0.dp))
        }
        Row {
            Spacer(modifier = Modifier.size(100.dp))
            TextField(value = newPlayerNickname, onValueChange = {newPlayerNickname}, label = { Text(text = "Nickname")}, shape = RoundedCornerShape(20.dp,20.dp,0.dp,0.dp))
        }
        Row {
            Spacer(modifier = Modifier.size(70.dp))

            Image(
                painter = painterResource(id = R.drawable.android),
                modifier = Modifier.size(100.dp),
                contentDescription = "Android"
            )
            Spacer(modifier = Modifier.size(70.dp))
            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(NaranjaDiferennte)) {
                Text(text = "Change")
            }
        }
        Spacer(modifier = Modifier.size(20.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.camera),modifier = Modifier.size(60.dp),
                contentDescription = "Telefono")
            Spacer(modifier = Modifier.size(40.dp))
            TextField(value = newTelefono, onValueChange = {newTelefono = it},label = { Text(text = "Telefono")}, shape = RoundedCornerShape(20.dp,20.dp,0.dp,0.dp))
        }
        Spacer(modifier = Modifier.size(20.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.email),modifier = Modifier.size(60.dp),
                contentDescription = "Correo")
            Spacer(modifier = Modifier.size(40.dp))
            TextField(value = newEmail, onValueChange = {newEmail = it},label = { Text(text = "Email")}, shape = RoundedCornerShape(20.dp,20.dp,0.dp,0.dp))
        }
        Spacer(modifier = Modifier.size(30.dp))
        
        Row {
            Spacer(modifier = Modifier.size(120.dp))
            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(NaranjaDiferennte)) {
                Text(text = "Add new player")
                
            }
        }


    }


}

