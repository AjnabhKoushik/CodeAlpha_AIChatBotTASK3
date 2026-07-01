import java.util.HashMap;

public class BotLogic {

    HashMap<String, String> responses = new HashMap<>();

    public BotLogic() {

        responses.put("hello", "Hello! How can I help you?");
        responses.put("hi", "Hi! Nice to meet you.");
        responses.put("how are you", "I am doing great!");
        responses.put("java", "Java is an Object-Oriented Programming language.");
        responses.put("oop", "OOP stands for Object-Oriented Programming.");
        responses.put("ai", "Artificial Intelligence enables machines to simulate human intelligence.");
        responses.put("bye", "Goodbye! Have a nice day.");
    }

    public String getResponse(String input) {

        input = input.toLowerCase();

        for (String key : responses.keySet()) {

            if (input.contains(key)) {

                return responses.get(key);

            }

        }

        return "Sorry, I don't understand. Please ask another question.";
    }
}
