package com.pro.messenger.resources.beans;

import javax.ws.rs.QueryParam;

/**
 * Created on 30.12.2015.
 */
public class ProfileFilterBean {
    private @QueryParam("profilesFrom") Integer indexFrom;
    private @QueryParam("profilesTo") int indexTo;

    public int getIndexTo() {
        return indexTo;
    }

    public void setIndexTo(int indexTo) {
        this.indexTo = indexTo;
    }

    public Integer getIndexFrom() {
        return indexFrom;
    }

    public void setIndexFrom(Integer indexFrom) {
        this.indexFrom = indexFrom;
    }
}
