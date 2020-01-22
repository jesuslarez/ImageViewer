package imageviewer.model;
/**
 *
 * @author Jesus Larez
 */
public interface Image {

    byte[] bitmap();

    Image next();

    Image prev();
}
