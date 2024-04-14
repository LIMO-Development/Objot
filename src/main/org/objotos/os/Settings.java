package org.objotos.os;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Settings {

    public String DEFAULT_BG_URL = "https://ferderplays.github.io/files/pics/bg.png";

    public BufferedImage background_image;

    public Settings(String bgUrl) {
        try {
            if (bgUrl == null) {
                background_image = ImageIO.read(new URL(DEFAULT_BG_URL));
            } else {
                background_image = ImageIO.read(new URL(bgUrl));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
