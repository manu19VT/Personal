import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = MaterialTheme.colorScheme.background) {
                NombreYControl()
            }
        }
    }
}

@Composable
fun NombreYControl() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Manuel Antonio Villa Torres",
            fontSize = 34.sp,           // más grande
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1565C0)   // color (azul)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "22130838",
            fontSize = 20.sp,           // más pequeño
            color = Color.DarkGray
        )
    }
}

