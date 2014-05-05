package com.limo.pesaperdiemtracker.expenselisting.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.limo.pesaperdiemtracker.R;

public class DescriptionDialog extends Dialog implements
android.view.View.OnClickListener {

private Button cancelButton;
private TextView textview;

public DescriptionDialog(Context mContext, String string) {
super(mContext);
requestWindowFeature(Window.FEATURE_NO_TITLE);
setContentView(R.layout.description_dialog);
textview = (TextView) findViewById(R.id.textview);
cancelButton = (Button) findViewById(R.id.cancel_button);
textview.setText(string);
cancelButton.setOnClickListener(this);
show();
}

@Override
public void onClick(View v) {
if (v.getId() == R.id.cancel_button) {
	dismiss();
}
}
}
