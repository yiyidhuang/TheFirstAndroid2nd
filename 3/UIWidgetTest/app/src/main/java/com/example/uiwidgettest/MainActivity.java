package com.example.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Log.d("UIWidgetTest MainActivity", "onClick");
//            }
//        });
//    }
//}
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;

    private ImageView imageView;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstancState) {
        super.onCreate(savedInstancState);
        setContentView(R.layout.activity_main);
        //Button button = findViewById(R.id.button);
        //editText = (EditText) findViewById(R.id.edit_text);
        //imageView = (ImageView) findViewById(R.id.image_view);
        //progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        //button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Log.d("MainActivity", "onClick: button");
                //imageView.setImageResource(R.drawable.img_2);
                //String inputText = editText.getText().toString();
                //Toast.makeText(MainActivity.this, inputText,
                //        Toast.LENGTH_SHORT).show();

                //Circle progress bar
                //if (progressBar.getVisibility() == View.GONE) {
                //    progressBar.setVisibility(View.VISIBLE);
                //} else {
                //    progressBar.setVisibility(View.GONE);
                //}

                //Horizontal progress bar, 100%
                //int progress = progressBar.getProgress();
                //progress = progress + 10;
                //progressBar.setProgress(progress);

                //AlertDialog
                /*AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important.");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();*/

                //ProgressDialog
                //ProgressDialog progressDialog = new

                break;
            default:
                break;
        }
    }
}
