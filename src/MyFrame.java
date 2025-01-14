import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

//    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(400,350);
//        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE" );
        dateFormat = new SimpleDateFormat("dd:MMMMM:yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(Color.green);
        timeLabel.setBackground(Color.black); //fara "setOpaque(true) background nu se coloreaza "↓↓↓↓
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,30));
        dayLabel.setForeground(Color.green);
        dayLabel.setBackground(Color.black); //fara "setOpaque(true) background nu se coloreaza "↓↓↓↓
        dayLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.PLAIN,30));
        dateLabel.setForeground(Color.green);
        dateLabel.setBackground(Color.black); //fara "setOpaque(true) background nu se coloreaza "↓↓↓↓
        dateLabel.setOpaque(true);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }

    private void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            try {
                Thread.sleep(1000); //
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
