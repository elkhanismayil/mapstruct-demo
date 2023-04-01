package az.example.mapstruct.service.impl;

import az.example.mapstruct.dto.OperatorDto;
import az.example.mapstruct.entity.Operator;
import az.example.mapstruct.mapper.CallRecordsMapper;
import az.example.mapstruct.repository.OperatorRepository;
import az.example.mapstruct.service.OperatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatorServiceImpl implements OperatorService {
    private final OperatorRepository operatorRepository;
    private final CallRecordsMapper callRecordsMapper;

    @Override
    public OperatorDto createOperator(OperatorDto operatorDto) {
        Operator operator = callRecordsMapper.dtoToOperatorEntity(operatorDto);
        Operator savedOperator = operatorRepository.save(operator);
        return callRecordsMapper.operatorToDto(savedOperator);
    }

    @Override
    public List<OperatorDto> getAll() {
        List<Operator> all = operatorRepository.findAll();
        return callRecordsMapper.mapToDtoList(all);
    }
}
