package cmd.ushiramaru.todid.data

import androidx.room.TypeConverter
import cmd.ushiramaru.todid.data.model.Priority

class Converter {
    @TypeConverter
    fun fromPriority(priority: Priority) : String{
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }
}