package textParser;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.util.Scanner;


/**
 * TextIO class which parses a string of text and puts each verse 
 * unto a new line.
 * @author TUDelft SID
 *
 */

public class TextIO implements ITextIO{
	
	/**
	 * String that outputs a number of verses.
	 */
	public String verses;
	public String chapter;
	private CharSequence s = "-";
	
	
	/**
	 * TextIO constructor.
	 */
	public TextIO(){
		verses = "";
	}
	
	/**
	 * Parses a string and puts each verse unto a new line.
	 */
	@Override
	public void parseText(String text) {
		Scanner scan = new Scanner(text);
		String current;
			while(scan.hasNext()){
				current = scan.next();
				if(isInt(current) || current.contains(s)) {
					current = "\n"+ chapter + ":" + current + "=";
				}
				else{
					current += " ";
				}
			verses += current;
			}		
		scan.close();
		}
	
	/**
	 * Checks whether given string is an integer.
	 * @param s String to check.
	 * @return true or false.
	 */
	private boolean isInt(String s){
		if(s == null){return false;}
		if(s.isEmpty()){return false;}
		try{
			Integer.parseInt(s);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	/**
	 * Method which copies a string to the computer clipboard.
	 */
	@Override
	public void copyToClipboard(String text) {
		Toolkit tool = Toolkit.getDefaultToolkit();
		Clipboard clip = tool.getSystemClipboard();
		StringSelection stringSel = new StringSelection(text);
		clip.setContents(stringSel, null);
	}

	/**
	 * Gets the string of verses.
	 * @return a String of verses.
	 */
	public String getVerses() {
		return verses;
	}
	
	public void setVerses(String verse) {
		this.verses = verse;
	}
	
	/**
	 * Gets the string of the current chapter.
	 * @return a String of the current chapter.
	 */
	public String getChapter() {
		return chapter;
	}
	
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}


}
