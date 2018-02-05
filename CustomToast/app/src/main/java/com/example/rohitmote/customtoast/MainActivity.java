package com.example.rohitmote.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button toastButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater inflater= getLayoutInflater();
        toastButton= findViewById(R.id.toast_Button);
        View view=inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.toast_layout));

        ImageView image = view.findViewById(R.id.toast_image);
        image.setImageResource(R.drawable.github);

        TextView text= view.findViewById(R.id.toast_text);
        text.setText("This is Custom Toast");
        final Toast toast = new Toast(getApplicationContext());
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);


        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toast.getView()!=null) {
                    toast.show();

                }
            }
        });


    }
}
