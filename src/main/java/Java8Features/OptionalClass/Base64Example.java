package Java8Features.OptionalClass;

import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        // Example input string
        String originalInput = "Hello, world!";

        // Encode the input string using Base64
        String encodedString = encodeBase64(originalInput);
        System.out.println("Encoded string: " + encodedString);

        // Decode the encoded string back to the original string
        String decodedString = decodeBase64(encodedString);
        System.out.println("Decoded string: " + decodedString);

        // Output:
        // Encoded string: SGVsbG8sIHdvcmxkIQ==
        //Decoded string: Hello, world!
    }

    // Method to encode a string using Base64
    public static String encodeBase64(String input) {
        // Get an encoder instance
        Base64.Encoder encoder = Base64.getEncoder();
        // Encode the input string
        return encoder.encodeToString(input.getBytes());
    }

    // Method to decode a Base64 encoded string
    public static String decodeBase64(String encodedInput) {
        // Get a decoder instance
        Base64.Decoder decoder = Base64.getDecoder();
        // Decode the encoded string
        byte[] decodedBytes = decoder.decode(encodedInput);
        // Convert the decoded bytes back to a string
        return new String(decodedBytes);

    }
}