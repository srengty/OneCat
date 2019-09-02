package itc.gic.android.onecat;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class OneCatView extends AppCompatImageView {
    public OneCatView(Context context) {
        super(context);
        init(context,null,0);
    }

    public OneCatView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs,0);
    }

    public OneCatView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }
    private void init(Context context, @Nullable AttributeSet attrs, int defStyleAttr){
        setImageDrawable(context.getDrawable(R.drawable.cat));
    }
}
