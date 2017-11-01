package es.paradigmadigital.consulrequest.pruebas;

import com.google.gson.annotations.SerializedName;

public class CustomDebugConfig {

	@SerializedName("ClientAddr")
	private String clientAddress;

	@SerializedName("BindAddr")
	private String bindAddress;

	@SerializedName("AdvertiseAddr")
	private String advertiseAddress;
	
	@SerializedName("Datacenter")
	private String datacenter;

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getBindAddress() {
		return bindAddress;
	}

	public void setBindAddress(String bindAddress) {
		this.bindAddress = bindAddress;
	}

	public String getAdvertiseAddress() {
		return advertiseAddress;
	}

	public void setAdvertiseAddress(String advertiseAddress) {
		this.advertiseAddress = advertiseAddress;
	}

	public String getDatacenter() {
		return datacenter;
	}

	public void setDatacenter(String datacenter) {
		this.datacenter = datacenter;
	}

}
