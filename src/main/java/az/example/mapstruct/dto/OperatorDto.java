package az.example.mapstruct.dto;

import lombok.Data;

import java.util.List;

@Data
public class OperatorDto {
    private Long id;
    private String operatorName;
    private List<CallRecordOperatorsDto> operators;
}
