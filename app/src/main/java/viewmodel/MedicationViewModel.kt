class MedicationViewModel(private val repository: MedicationRepository) : ViewModel() {
    val medications = liveData(Dispatchers.IO) {
        val data = repository.getMedications().execute().body() // Executa a requisição da API
        emit(data ?: emptyList<Medication>()) // Emite a lista para a UI
    }

    fun addMedication(medication: Medication) = liveData(Dispatchers.IO) {
        val response = repository.addMedication(medication).execute()
        emit(response.body())
    }
}