package imageviewer;

import imageviewer.control.NextImageCommand;
import imageviewer.control.PreviousImageCommand;
import imageviewer.persistence.ImageLoader;
import imageviewer.persistence.files.FileImageLoader;

/**
 *
 * @author Jesus Larez
 */
public class Main {

    public static void main(String[] args) {
        ImageLoader imageLoader = new FileImageLoader("photos");
        MainFrame mainFrame = new MainFrame();
        mainFrame.add(new NextImageCommand(mainFrame.getImageDisplay()));
        mainFrame.add(new PreviousImageCommand(mainFrame.getImageDisplay()));
        mainFrame.getImageDisplay().display(imageLoader.load());
    }

}
