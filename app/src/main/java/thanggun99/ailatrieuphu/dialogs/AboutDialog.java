package thanggun99.ailatrieuphu.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.LinearLayout;

import thanggun99.ailatrieuphu.R;

/**
 * Created by Thanggun99 on 02/11/2016.
 */

public class AboutDialog extends Dialog {
    public AboutDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.about_dialog);
        getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
    }
}
