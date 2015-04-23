package swaggerresponses;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dxso-job-response")  
@XmlAccessorType(XmlAccessType.PROPERTY)
public class DxsoJobResponse {
	private List<ProtocolEntry> _protocol = null;

	public List<ProtocolEntry> getProtocol() {
		return _protocol;
	}

	public void setProtocol(List<ProtocolEntry> _protocol) {
		this._protocol = _protocol;
	}
}