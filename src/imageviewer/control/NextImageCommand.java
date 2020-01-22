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
public class NextImageCommand implements Command{ 
    private final ImageDisplay imageDisplay;

    public NextImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }
    
    

    @Override
    public String name() {
        return "next";
    }

    @Override
    public void execute() {
        imageDisplay.display(imageDisplay.currentImage().next());
    }
    
}
