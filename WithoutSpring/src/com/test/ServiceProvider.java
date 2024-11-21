package com.test;

public class ServiceProvider {
	
	//MasterRemote ms = new LgTv();
	MasterRemote ms = new SamsungTv();
	public String getRemoteService(){
		String colorChange = ms.colorChange();
		String channeChange = ms.channeChange();
		String volumeChange = ms.volumeChange();
		return colorChange+"\n"+channeChange+"\n"+volumeChange;
	}
}
