/**
 * Provides a typing effect by printing text character-by-character with a delay.
 */
public class TextEffect {

    /**
     * Prints the given text to the console one character at a time, with a short delay between each character
     * to simulate a typing effect.
     *
     * @param text the text to display with the typing effect
     */
    public void textwords(String text) {

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(10); // delay for typing effect
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
