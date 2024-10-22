import retrofit2.http.GET
import retrofit2.Call

interface MedicationApi {
    @GET("medications")
    fun getMedications(): Call<List<Medication>>
}