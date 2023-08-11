package com.maximfiedler.automations;



import com.maximfiedler.automations.automations.SelfModifier;
import com.maximfiedler.automations.utils.RoboManager;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        RoboManager robotUtils = new RoboManager(robot);
        SelfModifier selfModifier = new SelfModifier(robotUtils);
        selfModifier.writeHelloWorld();
    }
}