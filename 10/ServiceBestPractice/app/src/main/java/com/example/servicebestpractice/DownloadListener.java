package com.example.servicebestpractice;

/**
 * The interface
 * @author : Wei
 * @date : March 11, 2020
 */
public interface DownloadListener {

    /**
     * Set the progress status
     *
     * @param progress
     */
    void onProgress(int progress);

    /**
     * Callback method, Set the success status
     */
    void onSuccess();

    /**
     * Callback method, Set the fail status
     */
    void onFailed();

    /**
     * Callback method, Set the pause status
     */
    void onPaused();

    /**
     * Callback method, Set the cancel status
     */
    void onCanceled();
}
