package com.ewan.sc.consumer.ms;

import com.ewan.sc.consumer.ms.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ewan on 08/01/2018.
 */

@FeignClient(name = "${ms.provider.app_key}")
public interface ProviderClient {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    UserDTO findById(@PathVariable("id") long id);
}
