class MedicationRepository(private val medicationApi: MedicationApi) {
    fun getMedications() = medicationApi.getMedications()
}
