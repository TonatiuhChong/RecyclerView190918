package com.wehouse.tchong.recyclerview190918;

import android.net.Uri;

public class ListItem {
    private String desc;
    private int Foto;

    public ListItem(String desc, int foto) {
        this.desc = desc;
        Foto = foto;
    }

    public String getDesc() {
        return desc;
    }

    public int getFoto() {
        return Foto;
    }
}
