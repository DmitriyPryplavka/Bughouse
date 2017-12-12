package main.java.graphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PicBGbig extends JPanel {
    public void paintComponent(Graphics g) {
        Image im = null;
        try {
            im = ImageIO.read(new File("src\\main\\java\\graphics\\images\\chess-1 background.jpg"));
        } catch (IOException e) {
        }
        g.drawImage(im, 0, 0, 1105, 800, null);
    }
}
