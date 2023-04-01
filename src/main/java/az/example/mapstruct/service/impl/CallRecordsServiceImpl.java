package az.example.mapstruct.service.impl;

import az.example.mapstruct.dto.CallRecordsDto;
import az.example.mapstruct.entity.CallRecords;
import az.example.mapstruct.mapper.CallRecordsMapper;
import az.example.mapstruct.repository.CallRecordsRepository;
import az.example.mapstruct.service.CallRecordsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CallRecordsServiceImpl implements CallRecordsService {
    private final CallRecordsRepository callRecordsRepository;
    private final CallRecordsMapper callRecordsMapper;

    @Override
    public CallRecordsDto createCallRecords(CallRecordsDto callRecordsDto) {
        CallRecords callRecords = callRecordsMapper.dtoToEntity(callRecordsDto);
        CallRecords savedCallRecords = callRecordsRepository.save(callRecords);
        return callRecordsMapper.callRecordsToCallRecordsDto(savedCallRecords);
    }

    @Override
    public List<CallRecordsDto> getAll() {
        List<CallRecords> records = callRecordsRepository.findAll();
        return callRecordsMapper.callRecordsToCallRecordsDtos(records);
    }
}
