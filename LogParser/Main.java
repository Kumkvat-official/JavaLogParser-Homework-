package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        LogParser parser = new LogParser("C:\\Users\\Nikita\\IdeaProjects\\Code\\src\\com\\company\\logs.txt");
        var logs = new ArrayList<Log>();
        logs = parser.parse();
        PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\Nikita\\IdeaProjects\\Code\\src\\com\\company\\out.txt"));
        for(Log log : logs){
            if (log.getEvent().startsWith("DONE_TASK") && log.getStatus().equals("OK")){
                out.println(log);
            }
        }
    }
}
