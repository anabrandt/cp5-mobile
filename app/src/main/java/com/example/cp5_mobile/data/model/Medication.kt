package com.example.cp5_mobile.data.model

data class Medication(
    val id: Int,
    val name: String,
    val dosage: String,
    val stock: Int,
    val reminderTime: String // Hora do lembrete
)
