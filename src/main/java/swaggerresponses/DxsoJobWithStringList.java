package swaggerresponses;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dxso-job-string-list-response")  
@XmlAccessorType(XmlAccessType.PROPERTY)
public class DxsoJobWithStringList {
	private List<String> _protocol = null;

	public List<String> getProtocol() {
		return _protocol;
	}

	public void setProtocol(List<String> _protocol) {
		this._protocol = _protocol;
	}
}