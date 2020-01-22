/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.control;

import imageviewer.ui.ImageDisplay;

/**
 *
 * @author Familia
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
