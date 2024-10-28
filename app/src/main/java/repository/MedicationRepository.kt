class MedicationRepository(private val medicationApi: MedicationApi) {
    fun getMedications() = medicationApi.getMedications()
    fun addMedication(medication: Medication) = medicationApi.addMedication(medication)
}
