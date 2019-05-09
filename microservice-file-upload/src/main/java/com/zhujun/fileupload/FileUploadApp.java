package com.zhujun.fileupload;

import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * className: FileUploadAppl
 * create by: zhujun
 * description: TODO
 * create time: 2019/5/9 13:45
 */
@SpringBootApplication
@EnableEurekaClient
public class FileUploadApp {
    public static void main(String[] args) {
        SpringApplication.run(FileUploadApp.class,args);
    }
}
