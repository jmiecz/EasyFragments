package com.futurethought.easyfragments.supportedFragments;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

/**
 * Created by Josh Mieczkowski on 8/29/2015.
 */
public class SupportedFragmentContainer {
    private Fragment fragment;
    private String tag;
    private int holderID = -1;

    public SupportedFragmentContainer(Fragment fragment, String tag, int holderID) {
        this.fragment = fragment;
        this.tag = tag;
        this.holderID = holderID;
    }

    public SupportedFragmentContainer(Fragment fragment, int holderID) {
        this.fragment = fragment;
        this.holderID = holderID;
    }

    public SupportedFragmentContainer(DialogFragment fragment, String tag) {
        this.fragment = fragment;
        this.tag = tag;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public String getTag() {
        return tag;
    }

    public int getHolderID() {
        return holderID;
    }
}
