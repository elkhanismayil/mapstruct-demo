package az.example.mapstruct.service.impl;

import az.example.mapstruct.dto.CallRecordOperatorsDto;
import az.example.mapstruct.entity.CallRecordOperators;
import az.example.mapstruct.mapper.CallRecordsMapper;
import az.example.mapstruct.repository.CallRecordOperatorsRepository;
import az.example.mapstruct.service.CallRecordOperatorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CallRecordsOperatorServiceImpl implements CallRecordOperatorsService {
    private final CallRecordOperatorsRepository repository;
    private final CallRecordsMapper mapper;

    @Override
    public CallRecordOperatorsDto create(CallRecordOperatorsDto callRecordOperatorsDto) {
        CallRecordOperators callRecordOperators = mapper.dtoToEntityCalRecOps(callRecordOperatorsDto);
        CallRecordOperators savedCallRecOps = repository.save(callRecordOperators);
        return mapper.callRecordOperatorsToDto(savedCallRecOps);
    }

    @Override
    public List<CallRecordOperatorsDto> getAll() {
        List<CallRecordOperators> callRecordOperators = repository.findAll();
        return mapper.callRecOpsDtos(callRecordOperators);
    }
}
