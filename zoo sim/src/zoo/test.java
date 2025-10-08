package zoo;
import javax.swing.*;
import java.awt.*;

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

        tigerButton.addActionListener(e -> openAnimalWindow(new tiger(new carnivoreEat(), new walkingMove(), new growlSound())));
        giraffeButton.addActionListener(e -> openAnimalWindow(new giraffe(new herbivoreEat(), new walkingMove(), new silentSound())));
        rhinoButton.addActionListener(e -> openAnimalWindow(new rhino(new herbivoreEat(), new walkingMove(), new silentSound())));
        unicornButton.addActionListener(e -> openAnimalWindow(new unicorn(new herbivoreEat(), new flyingMove(), new squeakSound())));
        hareButton.addActionListener(e -> openAnimalWindow(new hare(new herbivoreEat(), new walkingMove(), new squeakSound())));
        snakeButton.addActionListener(e -> openAnimalWindow(new snake(new carnivoreEat(), new slitherMove(), new growlSound())));
        ravenButton.addActionListener(e -> openAnimalWindow(new raven(new omnivoreEat(), new flyingMove(), new squeakSound())));
        pigButton.addActionListener(e -> openAnimalWindow(new pig(new herbivoreEat(), new walkingMove(), new squeakSound())));
        gorillaButton.addActionListener(e -> openAnimalWindow(new gorilla(new omnivoreEat(), new walkingMove(), new growlSound())));
        gatorButton.addActionListener(e -> openAnimalWindow(new gator(new carnivoreEat(), new swimmingMove(), new growlSound())));
    }

    private static void openAnimalWindow(animal animal) 
    {
        String animalName = animal.getClass().getSimpleName();
    
        JFrame newFrame = new JFrame(animalName);
        newFrame.setSize(1400, 800);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setLayout(new BorderLayout());

        JLabel label = new JLabel("This is a " + animalName, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        newFrame.add(label, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 10, 10));

        JButton eatButton = new JButton("Eat");
        JButton soundButton = new JButton("Sound");
        JButton moveButton = new JButton("Move");

        buttonPanel.add(eatButton);
        buttonPanel.add(soundButton);
        buttonPanel.add(moveButton);

        newFrame.add(buttonPanel, BorderLayout.SOUTH);

        eatButton.addActionListener(e -> openInputWindow("Eat", animal.performEat()));
        soundButton.addActionListener(e -> openInputWindow("Sound", animal.performSound()));
        moveButton.addActionListener(e -> openInputWindow("Move", animal.performMove()));

        newFrame.setVisible(true);
    }

    private static void openInputWindow(String action, String message) 
    {
        JFrame inputFrame = new JFrame(action);
        inputFrame.setSize(1400, 800);
        inputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        inputFrame.setLayout(new BorderLayout());

        JLabel label = new JLabel(message, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        inputFrame.add(label, BorderLayout.CENTER);

        inputFrame.setVisible(true);
    }
}