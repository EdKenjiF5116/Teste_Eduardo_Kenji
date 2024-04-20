package com.example;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;

/**
 * Create an implementation of a Rest API client.
 * Prints out how many records exists for each gender and save this file to s3
 * bucket
 * API endpoint=>
 * https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda
 * AWS s3 bucket => interview-digiage
 *
 */
public class TASK4 {

    public static void main(String[] args) {
        try {
            String apiUrl = "https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda";
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            String responseData = response.toString();
            int maleCount = 0;
            int femaleCount = 0;

            AmazonS3 s3Client = AmazonS3ClientBuilder.standard().build();
            String bucketName = "interview-digiage";
            String fileName = "gender_records.txt";
            ByteArrayInputStream inputStream = new ByteArrayInputStream(responseData.getBytes());
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(responseData.getBytes().length);
            s3Client.putObject(bucketName, fileName, inputStream, metadata);

            System.out.println("Arquivo salvo com sucesso no Amazon S3.");

        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}