package revengerfitness.simplequotesappt14

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.google.gson.Gson
import revengerfitness.simplequotesappt14.models.Quote

object DataManager {
    var data = emptyArray<Quote>()
    var isDataLoaded= mutableStateOf(false)
    fun loadAssetsFromFile(context: Context){
val inputStream=context.assets.open("generated.json")
        val size:Int=inputStream.available()
        val buffer=ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json=String(buffer,Charsets.UTF_8)
        val gson=Gson()
        data=gson.fromJson(json,Array<Quote>::class.java)
        isDataLoaded.value=true
    }
}