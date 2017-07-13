package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建接口，通过DiscoveryClient对象，在日志中打印出服务实例的相关内容
 */

@RestController
public class DcController {

  private final DiscoveryClient discoveryClient;

  @GetMapping("/dc")
  public String dc(){
    String services = "Services: " + discoveryClient.getServices();
    System.out.println(services);
    return services;
  }

  @Autowired
  public DcController(DiscoveryClient discoveryClient) {
    this.discoveryClient = discoveryClient;
  }


}
