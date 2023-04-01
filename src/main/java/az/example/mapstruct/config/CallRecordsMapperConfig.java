package az.example.mapstruct.config;

import az.example.mapstruct.mapper.CallRecordsMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CallRecordsMapperConfig {
    @Bean
    public CallRecordsMapper callRecordsMapper() {
        return CallRecordsMapper.INSTANCE;
    }
}
