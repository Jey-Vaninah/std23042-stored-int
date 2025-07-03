package com.my.stored.conf;

import com.my.stored.PojaGenerated;
import org.springframework.test.context.DynamicPropertyRegistry;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
