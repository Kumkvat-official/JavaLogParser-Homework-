package com.company;

public class Log {
    private String ip, name, date, event, status;
    public void setIp(String ip){this.ip = ip;}
    public void setName(String name){this.name = name;}
    public void setDate(String date){this.date = date;}
    public void setEvent(String event){this.event = event;}
    public void setStatus(String status){this.status = status;}
    public String getIp(){return this.ip;}
    public String getName(){return this.name;}
    public String getDate(){return this.date;}
    public String getEvent(){return this.event;}
    public String getStatus(){return this.status;}

    @Override
    public String toString() {
        return ip + "\t" + name + "\t" + date + "\t" + event + "\t" + status;
    }
}
