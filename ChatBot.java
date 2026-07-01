import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatBot extends JFrame {

    JTextArea chatArea;
    JTextField inputField;
    JButton sendButton;

    BotLogic bot = new BotLogic();

    public ChatBot() {

        setTitle("AI ChatBot");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        chatArea = new JTextArea();
        chatArea.setEditable(false);

        JScrollPane scroll = new JScrollPane(chatArea);

        inputField = new JTextField();

        sendButton = new JButton("Send");

        JPanel panel = new JPanel(new BorderLayout());

        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        add(scroll, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String user = inputField.getText();

                chatArea.append("You : " + user + "\n");

                String reply = bot.getResponse(user);

                chatArea.append("Bot : " + reply + "\n\n");

                inputField.setText("");

            }

        });

        setVisible(true);
    }

}

// SAMPLE CONVERSATION

// You : Hello
// Bot : Hello! How can I help you?

// You : What is Java?

// Bot : Java is an Object-Oriented Programming language.

// You : Explain AI

// Bot : Artificial Intelligence enables machines to simulate human intelligence.

// You : Bye

// Bot : Goodbye! Have a nice day.
