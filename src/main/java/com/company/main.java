package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main.init();

        Menu.menu();

        Main.shutdown();
    }

    private static void init() {
        //
    }

    private static void shutdown() {
        //
    }
}
