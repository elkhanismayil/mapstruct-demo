package az.example.mapstruct.service;

import az.example.mapstruct.dto.OperatorDto;

import java.util.List;

public interface OperatorService {
    OperatorDto createOperator(OperatorDto operatorDto);
    List<OperatorDto> getAll();
}
