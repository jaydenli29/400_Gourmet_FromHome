package com.example.gourmetfromhome;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;

import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;

public class QRcode_scanner extends AppCompatActivity {

    Button back_home = findViewById(R.id.home);
    Button open_to_scan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode_scanner);
        open_to_scan= findViewById(R.id.scanner);;
        open_to_scan.setOnClickListener(v-> {
           scanCode();
        });
    }

    private void scanCode() {
        ScanOptions options = new ScanOptions();
        options.setPrompt("Volume up to flash on");
        options.setBeepEnabled(true);
        options.setOrientationLocked(true);
        options.setCaptureActivity(captureAct.class);
        barLaunch.launch(options);
    }
    ActivityResultLauncher<ScanOptions> barLaunch = registerForActivityResult(new ScanContract(), result -> {
        if (result.getContents() != null){
            AlertDialog.Builder builder = new AlertDialog.Builder(QRcode_scanner.this);
            builder.setTitle("Result");
            builder.setMessage(result.getContents());
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).show();
        }

    });
}