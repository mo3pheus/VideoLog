package video;

import com.github.sarxos.webcam.Webcam;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

@Ignore
public class WebcamTest {
    private Logger logger = LoggerFactory.getLogger(WebcamTest.class);

    @Test
    public void testWebcamImageCapture() {
        try {
            System.out.println("This tests image capture from the webcam available.");
            Webcam webcam = Webcam.getDefault();
            webcam.open();
            ImageIO.write(webcam.getImage(), "PNG", new File("hello-world.png"));
        } catch (IOException io) {
            logger.error("IOException " + io.getMessage(), io);
        }
    }
}
