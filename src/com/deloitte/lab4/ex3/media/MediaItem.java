package com.deloitte.lab4.ex3.media;

import com.deloitte.lab4.ex3.item.Item;
public abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(int id, String title, int numOfCopies, int runtime) {
        super(id, title, numOfCopies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " mins";
    }
}
