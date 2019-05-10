package com.zhujun.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * className: FileUploadFallback
 * create by: zhujun
 * description:
 * Edgware 中接口为 FallbackProvider
 * https://www.jianshu.com/p/632f26892c44
 * create time: 2019/5/9 15:51
 */
@Component
public class FileUploadFallback  implements FallbackProvider {
    @Override
    public String getRoute() {
        return "microservice-file-upload";
        //为哪一个服务设置的回退
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
       //返回一个ClientHttpResponse
        return new ClientHttpResponse(){
            //匿名内部类
            @Override
            public HttpHeaders getHeaders() {
                // headers设定
                HttpHeaders headers = new HttpHeaders();
                MediaType mt = new MediaType("application", "json", Charset.forName("UTF-8"));
                headers.setContentType(mt);
                return headers;
            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream(("文件上传微服务不可用，请稍后再试。"+"cause"+cause.getMessage()).getBytes());
            }

            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.GATEWAY_TIMEOUT;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.GATEWAY_TIMEOUT.value();
            }

            @Override
            public String getStatusText() throws IOException {
                return HttpStatus.GATEWAY_TIMEOUT.getReasonPhrase();
            }

            @Override
            public void close() {

            }
        };
    }
}
