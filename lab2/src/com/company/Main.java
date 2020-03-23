package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Main extends JPanel implements ActionListener {
    private static int maxWidth;
    private static int maxHeight;
    double points[][] = {
            { 120,450 }, { 230,564 }, { 230,564 }, { 520,564 },{623,414},/*5 точка*/{500,480}/*5 точка*/,{227,480}

    };
    double points2[][] = {
            { 265, 325 }, { 280,396},{450,410},{420, 350},{430,275},{295,255}

    };

    double points3[][] = {
            { 320, 285 }, { 320,345},{355,375},{390, 345},{390,285}

    };
    Timer timer;

    private double angle = 0;
    private double scale = 1;
    private double delta = 0.01;
    private double dx = 1;
    private double tx = 0;
    private double dy = 1;
    private double ty = 6;

    public Main(){
        timer = new Timer(10,this);
        timer.start();
    }
    public void paint (Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh =  new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);
        g2d.setBackground(new Color(255, 255, 128));
        g2d.clearRect(0,0,maxWidth,maxHeight);
        //
        BasicStroke bs2 = new BasicStroke(4, BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER);
        g2d.setStroke(bs2);
        g2d.drawRect(50, 25, 1000, 800);
        //


        //ship


        GeneralPath ship = new GeneralPath();

        g2d.translate(70, 12);
        ship.moveTo(points[0][0], points[0][1]);

        for (int k = 1; k < points.length; k++)
            ship.lineTo(points[k][0], points[k][1]);

        ship.closePath();

        //
        //sail


        GeneralPath sail = new GeneralPath();

        g2d.translate(70, 12);
        sail.moveTo(points2[0][0], points2[0][1]);

        for (int k = 1; k < points2.length; k++)
            sail.lineTo(points2[k][0], points2[k][1]);

        sail.closePath();

        //
        //shield

        GeneralPath shield = new GeneralPath();

        g2d.translate(70, 12);
        shield.moveTo(points3[0][0], points3[0][1]);

        for (int k = 1; k < points3.length; k++)
            shield.lineTo(points3[k][0], points3[k][1]);

        shield.closePath();

        //

        //
       // g2d.translate(maxWidth/2, maxHeight/2);
        g2d.rotate(angle,350,450);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,(float)scale));
        //draw
        g2d.setColor(new Color(128, 64, 0));
        g2d.fill(ship);
        g2d.setColor(Color.black);
        /*mast*/g2d.fillRect(360,391, 10,90);
        g2d.setColor(new Color(192, 192, 192));
        g2d.fill(sail);
        g2d.setColor(Color.white);
        g2d.fill(shield);
        g2d.setColor(Color.red);
        g2d.drawLine(355,285,355,375);
        g2d.drawLine(320,315,390,315);

    }
    public static void  main(String[] args){
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100,900);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(new Main());
        frame.setVisible(true);
        Dimension size = frame.getSize();
        Insets insets = frame.getInsets();
        maxWidth = size.width - insets.left - insets.right -1;
        maxHeight =  size.height - insets.top - insets.bottom -1;
    }
    public void actionPerformed(ActionEvent e) {

        if ( scale < 0.01 )
        {
            delta = -delta;
        }
        else if (scale > 0.99)
        {
            delta = -delta;
        }
        if ( tx < -maxWidth/3 )
        {
            dx = -dx;
        }
        else if ( tx > maxWidth/3 )
        {
            dx = -dx;
        }
        if ( ty < -maxHeight/3 )
        {
            dy = -dy;
        }
        else if ( ty > maxHeight/3 )
        {
            dy = -dy;
        }

        scale += delta;
        angle += 0.01;
        tx += dx;
        ty += dy;
        repaint();
    }
}
