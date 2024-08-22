import java.sql.Date

data class Donor(val name:String,
                 val address:String,
                 val bloodGroup: String,
                 val id:Int,
                 val last_donate_date:Int
    )
