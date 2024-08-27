package com.example.app1sorteio;

import android.os.Bundle;
import android.view.View; // Import View class
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		EdgeToEdge.enable(this);setContentView(R.layout.activity_main);
		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
			Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
			return insets;
		});
	}

	public void alterarText(View view) {
		TextView texto = findViewById(R.id.textView); // Now you can find the TextView
		texto.setText("Numero sorteado "+randonNumber());
	}

	private String randonNumber() {
		int numero = (int) (Math.random() * 100);
		return String.valueOf(numero);
	}
}