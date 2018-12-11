package com.example.iranga.fat_to_fit;

import android.os.Bundle;

/**
 * Created by rangana on 4/6/2017.
 */
public class ActivityOne {
    private int contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_one);

}

    public void setContentView(int contentView) {
        this.contentView = contentView;
    }
}
