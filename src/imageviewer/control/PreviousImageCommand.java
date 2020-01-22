package imageviewer.control;

import imageviewer.ui.ImageDisplay;

/**
 *
 * @author Jesus Larez
 */
public class PreviousImageCommand implements Command {

    private final ImageDisplay imageDisplay;

    public PreviousImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }

    @Override
    public String name() {
        return "prev";
    }

    @Override
    public void execute() {
        imageDisplay.display(imageDisplay.currentImage().next());

    }

}
