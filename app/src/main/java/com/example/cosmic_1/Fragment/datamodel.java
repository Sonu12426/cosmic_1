package com.example.cosmic_1.Fragment;

public class datamodel {
    int image;
    String header, desc;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String heard) {
        this.header = heard;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public datamodel(int image, String heard, String desc) {
        this.image = image;
        this.header = heard;
        this.desc = desc;

    }
}
