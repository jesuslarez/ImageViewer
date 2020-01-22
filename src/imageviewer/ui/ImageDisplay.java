package imageviewer.ui;

import imageviewer.model.Image;

/**
 *
 * @author Jesus Larez
 */
public interface ImageDisplay {

    void display(Image image);

    public Image currentImage();

}
