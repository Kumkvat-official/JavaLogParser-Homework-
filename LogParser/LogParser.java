package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LogParser{
    private final BufferedReader reader;
    public LogParser(String way) throws FileNotFoundException {
        this.reader = new BufferedReader(new FileReader(way));
    }
    public ArrayList<Log> parse() throws IOException {
        var logs = new ArrayList<Log>();
        var list = new ArrayList<String>();
        while (this.reader.ready()){
            list.add(this.reader.readLine());
        }
        for (String string : list) {
            Log log = new Log();
            String tmp;
            tmp = string;
            log.setIp(tmp.substring(0, tmp.indexOf("\t")));
            int indexOfTab = tmp.indexOf("\t");
            tmp = tmp.substring(indexOfTab+1);
            log.setName(tmp.substring(0,tmp.indexOf("\t")));
            indexOfTab = tmp.indexOf("\t");
            tmp = tmp.substring(indexOfTab+1);
            log.setDate(tmp.substring(0, tmp.indexOf("\t")));
            indexOfTab = tmp.indexOf("\t");
            tmp = tmp.substring(indexOfTab+1);
            log.setEvent(tmp.substring(0, tmp.indexOf("\t")));
            indexOfTab = tmp.indexOf("\t");
            tmp = tmp.substring(indexOfTab+1);
            log.setStatus(tmp.substring(0));
            logs.add(log);
        }
        return logs;
    }
}
