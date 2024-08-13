import java.util.Calendar
import java.util.Date
import java.util.GregorianCalendar

object SampleData {
    val data1=" This is Data one"
    val data2= "This is Data two"

    fun getDate(diff : Int) : Date{

        val calender= GregorianCalendar()

        calender.add(Calendar.MILLISECOND,diff)

        return calender.time

    }
    val data : List<DataEntry>
        get() {

              val tempList : MutableList<DataEntry> = ArrayList()

            tempList.add(DataEntry(1, getDate(45),data1))
            tempList.add(DataEntry(2, getDate(55),data2))

            return tempList
        }
}