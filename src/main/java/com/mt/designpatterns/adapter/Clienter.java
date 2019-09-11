package com.mt.designpatterns.adapter;

/**
 * Created by MT on 2019/6/18 0018 9:44
 */
public class Clienter {


    public static void main(String[] args) {

        AdapterFace a = new ShiXian();
        ((ShiXian) a).a();
        ((ShiXian) a).b();


    }
}
