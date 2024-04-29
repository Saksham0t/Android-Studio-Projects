package com.example.exp_9;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                Toolbar toolbar = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                TextView textView = findViewById(R.id.textView);
                textView.setText("Hello Saksham!");
        }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
                getMenuInflater().inflate(R.menu.menu_main, menu);
                return true;
        }
        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.action_settings) {
                        Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
                        return true;
                } else if (id == R.id.action_item1) {
                        Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show();
                        return true;
                } else if (id == R.id.action_item2) {
                        Toast.makeText(this, "Add account clicked", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return super.onOptionsItemSelected(item);
        }
}