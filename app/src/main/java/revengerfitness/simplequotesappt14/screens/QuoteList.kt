package revengerfitness.simplequotesappt14.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import revengerfitness.simplequotesappt14.models.Quote

@Composable
fun QuoteList(data:Array<Quote>,onClick:()->Unit){
    LazyColumn(content ={
        items(data){
            QuoteListItem(quote = it) {
                onClick
            }
        }
    } )
}