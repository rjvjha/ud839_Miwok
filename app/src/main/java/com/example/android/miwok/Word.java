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
     * Audio Resource Id for the pronunciation of the word.
     */
    private int mAudioResourceId;

    /**
     * Constructor 1- When no Image Resource Id is provided.
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Constructor 2 - When Image Resource Id is provided.
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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
     * Get the  translated audio resource Id
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Check whether Word object contains image.
     *
     * @return true or false
     */
    public boolean hasImage() {
        return mImageResourceId != N0_IMAGE_PROVIDED;
    }

    /**
     * @return string representation of {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
