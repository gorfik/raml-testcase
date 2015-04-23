package swaggerresponses;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dxso-job-number-request")  
@XmlAccessorType(XmlAccessType.PROPERTY)
public class DxsoJobNumberRequest {
	
	private String _jobId;
	
	private Integer _accountLength = null;

	private List<String> _cashLedgerNames = null;
	private List<String> _ledgerFolderNames = null;
	
	/**
	 * Getter for jobId.
	 * @return the jobId
	 */
	public String getJobId() {
		return _jobId;
	}

	/**
	 * Setter for jobId.
	 * @param jobId the jobId to set
	 */
	public void setJobId(String jobId) {
		_jobId = jobId;
	}

	/**
	 * Getter for accountLength.
	 * @return the accountLength
	 */
	public Integer getAccountLength() {
		return _accountLength;
	}

	/**
	 * Setter for accountLength.
	 * @param accountLength the accountLength to set
	 */
	public void setAccountLength(Integer accountLength) {
		_accountLength = accountLength;
	}

	/**
	 * Getter for cashLedgerNames.
	 * @return the cashLedgerNames
	 */
	public List<String> getCashLedgerNames() {
		return _cashLedgerNames;
	}

	/**
	 * Setter for cashLedgerNames.
	 * @param cashLedgerNames the cashLedgerNames to set
	 */
	public void setCashLedgerNames(List<String> cashLedgerNames) {
		_cashLedgerNames = cashLedgerNames;
	}

	/**
	 * Getter for ledgerFolderNames.
	 * @return the ledgerFolderNames
	 */
	public List<String> getLedgerFolderNames() {
		return _ledgerFolderNames;
	}

	/**
	 * Setter for ledgerFolderNames.
	 * @param ledgerFolderNames the ledgerFolderNames to set
	 */
	public void setLedgerFolderNames(List<String> ledgerFolderNames) {
		_ledgerFolderNames = ledgerFolderNames;
	}
}
