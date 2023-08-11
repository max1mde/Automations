package com.maximfiedler.automations.automations;

import com.maximfiedler.automations.utils.RoboManager;

import java.awt.event.KeyEvent;
import java.util.Scanner;

public class SelfModifier {
    private final RoboManager roboManager;
    public SelfModifier(RoboManager roboManager) {
        this.roboManager = roboManager;
    }

    public void writeInfinityCode() throws InterruptedException {
        (new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000 * 2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                roboManager.copyToClipboard("System.out.println(\"Hello world!\");");
                roboManager.focus();
                roboManager.getRobot().keyPress(KeyEvent.VK_ENTER);
                roboManager.pasteFromClipboard();
                roboManager.runCurrentProgram();
            }
        }).start();
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
        (new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000 * 5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                roboManager.copyToClipboard("System.out.println(\"Hello world!\");");
                roboManager.focus();
                roboManager.pasteFromClipboard();
                roboManager.runCurrentProgram();
            }
        }).start();
    }
}
