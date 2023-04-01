package az.example.mapstruct.service;

import az.example.mapstruct.dto.CallRecordsDto;

import java.util.List;

public interface CallRecordsService {
    CallRecordsDto createCallRecords(CallRecordsDto callRecordsDto);
    List<CallRecordsDto> getAll();
}
