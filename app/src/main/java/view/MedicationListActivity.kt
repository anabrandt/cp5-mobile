class MedicationListActivity : AppCompatActivity() {

    private val viewModel: MedicationViewModel by viewModels()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medication_list)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.medications.observe(this, Observer { medications ->
            if (medications != null) {
                recyclerView.adapter = MedicationAdapter(medications)
            }
        })
    }
}
