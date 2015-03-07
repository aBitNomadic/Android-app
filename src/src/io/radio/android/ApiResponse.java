package io.radio.android;

import android.text.format.Time;

import java.util.ArrayList;
import java.util.Date;

public class ApiResponse {
    public M main;
    public Metadata metadata;
}

class M {
    public int id;
    public String np;
    public int listeners;
    public int bitrate;
    public int isafkstream;
    public int isstreamdesk;
    public int start_time;
    public int end_time;
    public String lastset;
    public int trackid;
    public String thread;
    public int requesting;
    public String djname;

    public D dj;
    public int current;
    public ArrayList<Q> queue;
    public ArrayList<LP> lp;

}

class D {
    public int id;
    public String djname;
    public String djtext;
    public String djimage;
    public int visible;
    public int priority;
    public String css;
    public String djcolor;
    public String role;
    public int theme_id;

}

class Q {
    public String meta;
    public String time;
    public int type;
    public int timestamp;
}

class LP {
    public String time;
    public String meta;
    public int timestamp;
}

class Metadata {
    public int length;
    public int offset;
    public int limit;
    public ArrayList<String> routes;
    public String stream;
}
