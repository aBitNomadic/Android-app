package io.radio.android;

import java.util.ArrayList;

public class ApiResponse {
    public M main;
    public ApiMeta meta;
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

    public DJ dj;
    public int current;
    public ArrayList<Queue> queue;
    public ArrayList<LastPlayed> lp;

}
