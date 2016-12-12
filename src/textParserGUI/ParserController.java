package textParserGUI;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import textParser.TextIO;

/**
 * Controller for the Parser GUI.
 * @author Andrew Huang
 *
 */

public class ParserController {
	
	@FXML private TextArea textIn;
	@FXML private TextArea textOut;
	@FXML private TextField chapterIn;
	@FXML private Label errorLabel;
	
	private TextIO parser = new TextIO();
	
	/**
	 * Method for the convert button.
	 */
	public void convertText(){
		if(textIn != null && chapterIn!=null){
			resetOut(textOut,errorLabel);
			String chapter = chapterIn.getText();
			String rawBible = textIn.getText();
			
			if(rawBible.isEmpty() || chapter.isEmpty()){errorLabel.setText("Please enter a text and a chapter");}
			
			textOut.setText("");
			parser.setChapter("");
			
			parser.setChapter(chapter);
			parser.parseText(rawBible);
			String newBible = parser.getVerses();
			
			textOut.setText(newBible);
		}
		
	}
	
	public void clip() {
		String clip = textOut.getText();
		parser.copyToClipboard(clip);
	}
	
	public void resetOut(TextArea out, Label error) {
		parser.setVerses("");
		out.setText("");
		error.setText("");
	}
}
