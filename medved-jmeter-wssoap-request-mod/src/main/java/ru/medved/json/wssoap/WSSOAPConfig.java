package ru.medved.json.wssoap;

public class WSSOAPConfig {

	private String section;

	private String protocol;

	private String server;

	private String port;

	private String prefix;

	private String path;

	private String soapAction;

	private String wsdlUrl;

	public WSSOAPConfig() {
		super();
	}

	public String getPath() {
		return path;
	}

	public String getPort() {
		return port;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getProtocol() {
		return protocol;
	}

	public String getSection() {
		return section;
	}

	public String getServer() {
		return server;
	}

	public String getSoapAction() {
		return soapAction;
	}

	public String getWsdlUrl() {
		return wsdlUrl;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public void setSoapAction(String soapAction) {
		this.soapAction = soapAction;
	}

	public void setWsdlUrl(String wsdlUrl) {
		this.wsdlUrl = wsdlUrl;
	}
}
