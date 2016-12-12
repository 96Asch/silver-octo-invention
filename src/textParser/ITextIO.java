package textParser;
/**
 * Interface for the TextIO class.
 * @author Andrew Huang
 *
 */

public interface ITextIO {
	
	/**
	 * Method which reads a string of text and ordens the text by
	 * putting each verse on a new line.
	 * @param text string to input
	 */
	public void parseText(String text);
	
	/**
	 * Method which copies a String to the clipboard of a computer.
	 * @param text to copy
	 */
	public void copyToClipboard(String text);
}
