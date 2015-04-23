
package swaggerresponses;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "protocol")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ProtocolEntry {

	private String _text = null;
	private String _type = null;
	private String _context = null;
	private String _filename = null;
	private Date _time = null;

	/**
	 * Getter for text.
	 * 
	 * @return the text
	 */
	public String getText() {
		return _text;
	}

	/**
	 * Setter for text.
	 * 
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		_text = text;
	}

	/**
	 * Getter for type.
	 * 
	 * @return the type
	 */
	public String getType() {
		return _type;
	}

	/**
	 * Setter for type.
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		_type = type;
	}

	/**
	 * Getter for context.
	 * 
	 * @return the context
	 */
	public String getContext() {
		return _context;
	}

	/**
	 * Setter for context.
	 * 
	 * @param context
	 *            the context to set
	 */
	public void setContext(String context) {
		_context = context;
	}

	/**
	 * Getter for filename.
	 * 
	 * @return the filename
	 */
	public String getFilename() {
		return _filename;
	}

	/**
	 * Setter for filename.
	 * 
	 * @param filename
	 *            the filename to set
	 */
	public void setFilename(String filename) {
		_filename = filename;
	}

	/**
	 * Getter for time.
	 * 
	 * @return the time
	 */
	public Date getTime() {
		return _time;
	}

	/**
	 * Setter for time.
	 * 
	 * @param time
	 *            the time to set
	 */
	public void setTime(Date time) {
		_time = time;
	}
}