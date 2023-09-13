package revengerfitness.simplequotesappt14.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import revengerfitness.simplequotesappt14.models.Quote

@Composable
fun QuoteListScreen(data:Array<Quote>,onClick:()->Unit){
    Column {
        Text(text = "Quotes app",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp,24.dp).fillMaxWidth(1f), style = MaterialTheme.typography.titleMedium, fontFamily = FontFamily.Cursive)
        QuoteList(data = data) {
            onClick
        }
    }
}