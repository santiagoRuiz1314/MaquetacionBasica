package com.santiagoruiz.maquetacionbasica

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.santiagoruiz.maquetacionbasica.ui.theme.MaquetacionBasicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetalleProduct() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.mac),
            contentDescription = "Imagen del producto",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Nombre del Producto",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "$99.99",
            fontSize = 28.sp,
            color = Color.Green,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "Descripción del producto con detalles importantes, características y beneficios.",
            modifier = Modifier.padding(top = 8.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Editar",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(weight = 1f)
                    .background(
                        color = Color.Blue,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(top = 10.dp, bottom = 10.dp)
            )
            Text(
                text = "Eliminar",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(weight = 1f)
                    .background(
                        color = Color.Red,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(top = 10.dp, bottom = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun JetpackComposeTutorial() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.android),
            contentDescription = "Imagen tutorial",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier.padding(all = 16.dp)
        )

        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )

        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(all = 16.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PantallaPerfil() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.max),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Juan Pérez",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "Desarrollador Android apasionado por la tecnología y el diseño.",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 4.dp, start = 16.dp, end = 16.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "150", fontWeight = FontWeight.Bold)
                Text(text = "Posts")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "2.3K", fontWeight = FontWeight.Bold)
                Text(text = "Seguidores")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "980", fontWeight = FontWeight.Bold)
                Text(text = "Likes")
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Seguir",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(weight = 1f)
                    .background(
                        color = Color.Blue,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 10.dp, bottom = 10.dp)
            )
            Text(
                text = "Mensaje",
                color = Color.Blue,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(weight = 1f)
                    .border(
                        width = 1.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 10.dp, bottom = 10.dp)
            )
        }

        Text(
            text = "Intereses",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Ciclismo", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
            Text(text = "Programación", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
            Text(text = "UI/UX", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Música", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
            Text(text = "Viajes", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
            Text(text = "Gaming", modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)).padding(start = 12.dp, end = 12.dp, top = 6.dp, bottom = 6.dp))
        }

        Text(
            text = "Proyectos Recientes",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 8.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp))
                .padding(12.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.max),
                contentDescription = "App de Ciclismo",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .padding(start = 12.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "App de Ciclismo",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Text(
                    text = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.",
                    modifier = Modifier.padding(top = 4.dp)
                )
                Text(
                    text = "Ver más",
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 13.dp)
                        .align(Alignment.End)
                        .background(
                            color = Color.Blue,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
                )
            }
        }
    }
}