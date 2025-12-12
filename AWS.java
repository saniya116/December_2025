1. What is AWS?
AWS = Amazon Web Services
It is a cloud platform that provides services like:
Computing (EC2, Lambda)
Storage (S3)
Databases (RDS, DynamoDB)
Networking
Security
You use these services over the internet instead of maintaining your own servers.
2. Why use AWS with Java?
AWS provides an official AWS SDK for Java
Java apps can easily connect to S3, EC2, DynamoDB, Lambda, SNS, SQS, etc.
Used heavily in backend, microservices, enterprise apps.
3. AWS SDK for Java
There are two versions:
AWS SDK for Java v1 – older
AWS SDK for Java v2 – modern & recommended
Faster, lightweight, built for cloud apps.
To use it, add dependency (example: Maven):
<dependency>
    <groupId>software.amazon.awssdk</groupId>
    <artifactId>s3</artifactId>
    <version>2.21.0</version>
</dependency>
4. Common AWS Services Used in Java
A. Amazon S3 (Storage)
Used for:
Uploading files
Downloading files
Hosting images/videos
Example: Upload File to S3
S3Client s3 = S3Client.builder().region(Region.AP_SOUTH_1).build();
PutObjectRequest request = PutObjectRequest.builder()
        .bucket("mybucket")
        .key("test.txt")
        .build();
s3.putObject(request, RequestBody.fromString("Hello AWS"));


