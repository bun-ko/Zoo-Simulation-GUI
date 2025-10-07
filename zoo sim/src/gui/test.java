package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Zoo");
        frame.setSize(1400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 4, 10, 10));

        JButton tigerButton = new JButton("Tiger");
        JButton giraffeButton = new JButton("Giraffe");
        JButton rhinoButton = new JButton("Rhino");
        JButton unicornButton = new JButton("Unicorn");
        JButton hareButton = new JButton("Hare");
        JButton snakeButton = new JButton("Snake");
        JButton ravenButton = new JButton("Raven");
        JButton pigButton = new JButton("Pig");
        JButton gorillaButton = new JButton("Gorilla");
        JButton gatorButton = new JButton("Gator");

        panel.add(tigerButton);
        panel.add(giraffeButton);
        panel.add(rhinoButton);
        panel.add(unicornButton);
        panel.add(hareButton);
        panel.add(snakeButton);
        panel.add(ravenButton);
        panel.add(pigButton);
        panel.add(gorillaButton);
        panel.add(gatorButton);

        frame.add(panel);

        frame.setVisible(true);

        tigerButton.addActionListener(e -> openAnimalWindow("Tiger", "Tigers are large carnivorous cats found in Asia."));
        giraffeButton.addActionListener(e -> openAnimalWindow("Giraffe", "Giraffes have long necks and eat leaves from tall trees."));
        rhinoButton.addActionListener(e -> openAnimalWindow("Rhino", "Rhinos are known for their horns and thick skin."));
        unicornButton.addActionListener(e -> openAnimalWindow("Unicorn", "A mythical horse with a single horn!"));
        hareButton.addActionListener(e -> openAnimalWindow("Hare", "A mythical horse with a single horn!"));
    }

    private static void openAnimalWindow(String title, String description) 
    {
        JFrame newFrame = new JFrame(title);
        newFrame.setSize(1400, 800);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel(description, SwingConstants.CENTER);
        newFrame.add(label);

        newFrame.setVisible(true);
    }
}
