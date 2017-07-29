package com.example.android.miwok;

/**
 * Custom class containing english and miwok word and providing translation method for that word.
 */

public class Word {

    /**
     * Constant when no image provided.
     */
    private static final int N0_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word.
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation for the word.
     */
    private String mMiwokTranslation;
    /**
     * Image Resource Id for the word.
     */
    private int mImageResourceId = N0_IMAGE_PROVIDED;

    /**
     * Constructor 1- When no Image Resource Id is provided.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Constructor 2 - When Image Resource Id is provided.
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image resource id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Check whether Word object contains image.
     *
     * @return true or false
     */
    public boolean hasImage() {
        return mImageResourceId != N0_IMAGE_PROVIDED;
    }

}
