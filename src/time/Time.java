package time;

import java.awt.Color;
import javax.swing.*;
import java.time.OffsetDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class Time extends JFrame {
    
    JPanel panel = new JPanel();
    
    JLabel timeLabel1 = new JLabel("Time:");
    JLabel timeLabel2 = new JLabel();
    
    OffsetDateTime offset = OffsetDateTime.now();
    
    Timer timer = new Timer();
    
    int h = offset.getHour();
    int m = offset.getMinute();
    int s = offset.getSecond();
    
    int date = offset.getDayOfMonth();
    
    String day = String.format("%s", offset.getDayOfWeek());
    String month = String.format("%s", offset.getMonth());
    
    String dayName, monthName;
    int year = offset.getYear();
    
    JLabel dateLabel1 = new JLabel("Date:");
    JLabel dateLabel2 = new JLabel();
    
    JButton hourButton = new JButton("12-hour");
    boolean hour24=true;
    
    private void findDayMonth() {
        switch(day) {
            case "MONDAY" -> dayName="Monday";
            case "TUESDAY" -> dayName="Tuesday";
            case "WEDNESDAY" -> dayName="Wednesday";
            case "THURSDAY" -> dayName="Thursday";
            case "FRIDAY" -> dayName="Friday";
            case "SATURDAY" -> dayName="Saturday";
            case "SUNDAY" -> dayName="Sunday";
            default -> dayName="";
        }
        
        switch(month) {
            case "JANUARY" -> monthName="January";
            case "FEBRUARY" -> monthName="February";
            case "MARCH" -> monthName="March";
            case "APRIL" -> monthName="April";
            case "MAY" -> monthName="May";
            case "JUNE" -> monthName="June";
            case "JULY" -> monthName="July";
            case "AUGUST" -> monthName="August";
            case "SEPTEMBER" -> monthName="September";
            case "OCTOBER" -> monthName="October";
            case "NOVEMBER" -> monthName="November";
            case "DECEMBER" -> monthName="December";
            default -> monthName="";
        }
    }
    
    private void displayTime() {
        if(hour24) {
            if(s<10) {
                if(m<10) {
                    if(h<10) {
                        timeLabel2.setText("0" + h + ":0" + m + ":0" + s);
                    }
                    else {
                        timeLabel2.setText(h + ":0" + m + ":0" + s);
                    }
                }
                else {
                    if(h<10) {
                        timeLabel2.setText("0" + h + ":" + m + ":0" + s);
                    }
                    else {
                        timeLabel2.setText(h + ":" + m + ":0" + s);
                    }
                }
            }
        
            else {
                if(m<10) {
                    if(h<10) {
                        timeLabel2.setText("0" + h + ":0" + m + ":" + s);
                    }
                    else {
                        timeLabel2.setText(h + ":0" + m + ":" + s);
                    }
                }
                else {
                    if(h<10) {
                        timeLabel2.setText("0" + h + ":" + m + ":" + s);
                    }
                    else {
                        timeLabel2.setText(h + ":" + m + ":" + s);
                    }
                }
            }
        }
        else {
            if(h==0) {
                if(m<10) {
                    if(s<10) {
                        timeLabel2.setText(12 + ":0" + m + ":0" + s + " AM");
                    }
                    else {
                        timeLabel2.setText(12 + ":0" + m + ":" + s + " AM");
                    }
                }
                else {
                    if(s<10) {
                        timeLabel2.setText(12 + ":" + m + ":0" + s + " AM");
                    }
                    else {
                        timeLabel2.setText(12 + ":" + m + ":" + s + " AM");
                    }
                }
            }
            else if(h>=1 && h<=9) {
                if(m<10) {
                    if(s<10) {
                        timeLabel2.setText("0" + h + ":0" + m + ":0" + s + " AM");
                    }
                    else {
                        timeLabel2.setText("0" + h + ":0" + m + ":" + s + " AM");
                    }
                }
                else {
                    if(s<10) {
                        timeLabel2.setText("0" + h + ":" + m + ":0" + s + " AM");
                    }
                    else {
                        timeLabel2.setText("0" + h + ":" + m + ":" + s + " AM");
                    }
                }
            }
            
            else if(h==10 || h==11) {
                if(m<10) {
                    if(s<10) {
                        timeLabel2.setText(h + ":0" + m + ":0" + s + " AM");
                    }
                    else {
                        timeLabel2.setText(h + ":0" + m + ":" + s + " AM");
                    }
                }
                else {
                    if(s<10) {
                        timeLabel2.setText(h + ":" + m + ":0" + s + " AM");
                    }
                    else {
                        timeLabel2.setText(h + ":" + m + ":" + s + " AM");
                    }
                }
            }
            
            else if(h==12) {
                if(m<10) {
                    if(s<10) {
                        timeLabel2.setText(h + ":0" + m + ":0" + s + " PM");
                    }
                    else {
                        timeLabel2.setText(h + ":0" + m + ":" + s + " PM");
                    }
                }
                else {
                    if(s<10) {
                        timeLabel2.setText(h + ":" + m + ":0" + s + " PM");
                    }
                    else {
                        timeLabel2.setText(h + ":" + m + ":" + s + " PM");
                    }
                }
            }
            else if(h>=13 && h<=21) {
                if(m<10) {
                    if(s<10) {
                        timeLabel2.setText("0" + (h-12) + ":0" + m + ":0" + s + " PM");
                    }
                    else {
                        timeLabel2.setText("0" + (h-12) + ":0" + m + ":" + s + " PM");
                    }
                }
                else {
                    if(s<10) {
                        timeLabel2.setText("0" + (h-12) + ":" + m + ":0" + s + " PM");
                    }
                    else {
                        timeLabel2.setText("0" + (h-12) + ":" + m + ":" + s + " PM");
                    }
                }
            }
            
            else if(h==22 || h==23) {
                if(m<10) {
                    if(s<10) {
                        timeLabel2.setText((h-12) + ":0" + m + ":0" + s + " PM");
                    }
                    else {
                        timeLabel2.setText((h-12) + ":0" + m + ":" + s + " PM");
                    }
                }
                else {
                    if(s<10) {
                        timeLabel2.setText((h-12) + ":" + m + ":0" + s + " PM");
                    }
                    else {
                        timeLabel2.setText((h-12) + ":" + m + ":" + s + " PM");
                    }
                }
            }
        }
    }
    
    private void calculateTime() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                s++;
                
                if(s>=60) {
                    s-=60;
                    m++;
                    
                    if(m>=60) {
                        m-=60;
                        h++;
                        
                        if(h>=24) {
                            h-=24;
                            date++;
                            
                            switch (dayName) {
                                case "Monday" -> dayName="Tuesday";
                                case "Tuesday" -> dayName="Wednesday";
                                case "Wednesday" -> dayName="Thursday";
                                case "Thursday" -> dayName="Friday";
                                case "Friday" -> dayName="Saturday";
                                case "Saturday" -> dayName="Sunday";
                                case "Sunday" -> dayName="Monday";
                                default -> {
                                }
                            }
                            
                            if(date>=32) {
                                switch (monthName) {
                                    case "January" -> {
                                        date-=31;
                                        monthName="February";
                                    }
                                    case "March" -> {
                                        date-=31;
                                        monthName="April";
                                    }
                                    case "May" -> {
                                        date-=31;
                                        monthName="June";
                                    }
                                    case "July" -> {
                                        date-=31;
                                        monthName="August";
                                    }
                                    case "August" -> {
                                        date-=31;
                                        monthName="September";
                                    }
                                    case "October" -> {
                                        date-=31;
                                        monthName="November";
                                    }
                                    case "December" -> {
                                        date-=31;
                                        monthName="January";
                                        year++;
                                    }
                                    default -> {
                                    }
                                }
                            }
                            
                            else if(date>=31) {
                                switch (monthName) {
                                    case "April" -> {
                                        date-=30;
                                        monthName="May";
                                    }
                                    case "June" -> {
                                        date-=30;
                                        monthName="July";
                                    }
                                    case "September" -> {
                                        date-=30;
                                        monthName="October";
                                    }
                                    case "November" -> {
                                        date-=30;
                                        monthName="December";
                                    }
                                }
                            }
                            
                            else if(date>=30 && year%4==0 && monthName.equals("February")) {
                                date-=29;
                                monthName="March";
                            }
                            
                            else if(date>=29 && year%4!=0 && monthName.equals("February")) {
                                date-=28;
                                monthName="March";
                            }
                        }
                    }
                }
                displayTime();
                dateLabel2.setText(dayName + ", " + date + " " + monthName + " " + year);
            }
        };
        timer.schedule(task, 0,1000);
    }
    
    public Time() {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Time & Date");
        
        panel.setLayout(null);
        panel.setBackground(Color.white);
        
        calculateTime();
        findDayMonth();
        
        timeLabel1.setBounds(150,150,50,20);
        timeLabel2.setBounds(200,150,100,20);
        timeLabel2.setForeground(Color.blue);
        displayTime();
        
        dateLabel1.setBounds(150,180,50,20);
        dateLabel2.setBounds(200,180,250,20);
        dateLabel2.setForeground(Color.blue);
        dateLabel2.setText(dayName + ", " + date + " " + monthName + " " + year);
        
        hourButton.setBounds(350,150,78,20);
        hourButton.addActionListener(e -> {
            if(hour24) {
                hourButton.setText("24-hour");
                hour24=false;
            }
            else {
                hourButton.setText("12-hour");
                hour24=true;
            }
        });
        
        panel.add(timeLabel1); panel.add(dateLabel1);
        panel.add(timeLabel2); panel.add(dateLabel2);
        panel.add(hourButton);
        add(panel);
    }
    
    public static void main(String[] args) {
        Time time = new Time();
        time.setVisible(true);
    }
}