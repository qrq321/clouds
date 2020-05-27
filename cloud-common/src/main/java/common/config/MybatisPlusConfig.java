package common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ruiqiqin
 * @Date: 2020/5/7 16:38
 * @Description: {}
 */
@Configuration
public class MybatisPlusConfig {
    /**
     *     分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
