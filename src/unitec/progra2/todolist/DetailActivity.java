package unitec.progra2.todolist;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Debe validarse si el dispositivo se ha cambiado para el modo
		// landscape
		// Si sí, se finaliza la actividad y se recarga la actividad inicial
		if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
			finish();
			return;
		}

		setContentView(R.layout.details_activity_layout);

		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			String s = extras.getString("value");
			TextView view = (TextView) findViewById(R.id.todoDescription);
			view.setText(s);
		}
	}
}
