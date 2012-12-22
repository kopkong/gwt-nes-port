package com.gochromium.nes.client.html5;



public abstract class ProgressCallback {

	/**
	 * When the read starts.
	 */
	public void onLoadStart(ProgressEvent e) {
		
	}
	
	/**
	 * While reading (and decoding) file or fileBlob data,
	 * and reporting partial file data (progess.loaded/progress.total)
	 * @param e
	 */
	public void onProgress(ProgressEvent e) {
		
	}

	/**
	 * When the read has been aborted. For instance, by invoking the abort() method.
	 */
	public void onAbort(ProgressEvent e) {
		
	}

	/**
	 * When the read has failed (see errors).
	 */
	public abstract void onError(ProgressEvent e);
	
	/**
	 * When the read has successfully completed.
	 */
	public abstract void onLoad(ProgressEvent e);
	
	/**
	 * When the request has completed (either in success or failure).
	 */
	public void onLoadEnd(ProgressEvent e) {
		
	}
	
}
