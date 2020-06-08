package com.reacttube.backend.config;

import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {
@Bean
    public AmazonDynamoDB amazonDynamoDB(){
       return AmazonDynamoDBClientBuilder
               .standard()
               .withRegion(Regions.AP_SOUTH_1)
               .withCredentials(new ClasspathPropertiesFileCredentialsProvider())
               .build();
    }

}
