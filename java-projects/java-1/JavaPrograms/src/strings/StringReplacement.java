package strings;

public class StringReplacement {
    public static void main(String[] args) {
        String message = "The diner would be open all night";

        System.out.println(message);

        message = message.replace("a", "@");
        message = message.replace("e", "&");
        message = message.replace("i", "!");
        message = message.replace("u", "~");
        message = message.replace("o", "*");

        System.out.println(message);

    }
}
