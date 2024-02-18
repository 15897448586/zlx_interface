package com.zlx.zlx_interface;

import com.zlx.zlxclientsdk.client.ZLXApiClient;
import com.zlx.zlxclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ZlxInterfaceApplicationTests {

    @Resource
    private ZLXApiClient zlxApiClient;

    @Test
    void contextLoads() {
        String zlx = zlxApiClient.getNameByGet("zlx");
        User user = new User();
        user.setUsername("zlx1");
        String usernameByPost = zlxApiClient.getUsernameByPost(user);
        System.out.println(zlx);
        System.out.println(usernameByPost);
    }

}
