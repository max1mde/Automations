package com.maximfiedler.automations;


import com.maximfiedler.automations.automations.SelfModifier;
import com.maximfiedler.automations.utils.RobotManager;

import java.awt.*;

public class Automations {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        RobotManager robotUtils = new RobotManager(robot);
        SelfModifier selfModifier = new SelfModifier(robotUtils);
        executeSelfWrittenCode();
        selfModifier.writeInfinityCode();
    }

    private static void executeSelfWrittenCode() {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
    }


}