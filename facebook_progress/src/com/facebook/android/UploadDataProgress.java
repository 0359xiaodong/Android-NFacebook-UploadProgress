package com.facebook.android;

public interface UploadDataProgress {
	public void progress(int position, int totalBytes, int transferedBytes);
}
