import retrofit2.http.GET
import retrofit2.Call

interface MedicationApi {
    @GET("medications")
    fun getMedications(): Call<List<Medication>>

    @POST("medications")
    fun addMedication(@Body medication: Medication): Call<Medication>
}
