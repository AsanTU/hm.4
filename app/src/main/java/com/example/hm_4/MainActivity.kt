
import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hm_4.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container, MainFragment()).commit()
    }
}