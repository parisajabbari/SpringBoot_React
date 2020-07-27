package com.ImageProject.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("parisaproject-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }

}
