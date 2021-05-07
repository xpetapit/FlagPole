/* Based on the ecs 100 template
 * Code for ??
 * Name: Peta Symons
 * Date: 08/04/21
 */

import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 */
public class FlagPole{
    public FlagPole(){
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }
    
    public void doDrawFlag() {
        this.drawFlag(200, 100, 15, 15);
    }
    
    private void drawFlag(double x, double y, double stripeWidth, double stripeHeight) {
        double bottom = y+stripeHeight;
        
        UI.setColor(Color.black);
        UI.setLineWidth(stripeWidth);   
        UI.drawLine(x, y, x, bottom);    
        
        UI.setColor(Color.red);
        UI.setLineWidth(stripeWidth);                           
        UI.drawLine(x+stripeWidth, y, x+stripeWidth, bottom);   
        
        UI.setColor(Color.yellow);
        UI.setLineWidth(stripeWidth);                                                   
        UI.drawLine(x+stripeWidth+stripeWidth, y, x+stripeWidth+stripeWidth, bottom);
    }

    public static void main(String[] args){
        FlagPole flag = new FlagPole();
        flag.doDrawFlag();
    }
}