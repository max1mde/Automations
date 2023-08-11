package com.maximfiedler.automations.automations;

import com.maximfiedler.automations.utils.RoboManager;

import java.util.Scanner;

public class SelfModifier {
    private final RoboManager roboManager;
    public SelfModifier(RoboManager roboManager) {
        this.roboManager = roboManager;
    }

    /**
     * This method writes a hello world at the mouse location and executes the program again
     * @throws InterruptedException
     */
    public void writeHelloWorld() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You want to write a hello world? Y/n");
        String yesno = scanner.nextLine();
        if(!yesno.equalsIgnoreCase("y") && !yesno.equalsIgnoreCase("yes")) System.exit(0);
        System.out.println("Move your mouse to the location you want the code! It will be written in 5 seconds");
        roboManager.getRobot().wait(1000 * 5);
        roboManager.copyToClipboard("System.out.println(\"Hello world!\");");
        roboManager.focus();
        roboManager.pasteFromClipboard();
        roboManager.runCurrentProgram();
    }
}
