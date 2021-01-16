package br.com.scr.telas;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Newdate implements Runnable {
    JFrame f;
    Thread t1 = null;
    int hours = 0, minutes = 0, seconds = 0;
    String timeString = "";
    JButton b;

    public void DigitalWatch() {
        f = new JFrame();

        t1 = new Thread(this);
        t1.start();

        b = new JButton();
        b.setBounds(150, 220, 300, 150);

        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void run() {
        try {
            while (true) {

                LocalDateTime currentTime = LocalDateTime.now();
                Month month = currentTime.getMonth();
                int day = currentTime.getDayOfMonth();
                int year = currentTime.getYear();
                DayOfWeek dayOfWeek = currentTime.getDayOfWeek();

                Calendar cal = Calendar.getInstance();
                hours = cal.get(Calendar.HOUR_OF_DAY);
                if (hours > 12)
                    hours -= 12;
                minutes = cal.get(Calendar.MINUTE);
                seconds = cal.get(Calendar.SECOND);

                SimpleDateFormat formatter = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss");
                Date date = cal.getTime();
                timeString = formatter.format(date);

                printTime();

                t1.sleep(10); // interval given in milliseconds
            }
        } catch (Exception e) {
        }
    }

    public void printTime() {
        b.setText(timeString.toUpperCase());
    }

    public static void main(String[] args) {
        Newdate dt = new Newdate();
        dt.DigitalWatch();

    }
}