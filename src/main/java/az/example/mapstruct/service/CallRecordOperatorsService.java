package az.example.mapstruct.service;

import az.example.mapstruct.dto.CallRecordOperatorsDto;

import java.util.List;

public interface CallRecordOperatorsService {
    CallRecordOperatorsDto create(CallRecordOperatorsDto callRecordOperatorsDto);
    List<CallRecordOperatorsDto> getAll();
}
