package az.example.mapstruct.dto;

import lombok.Data;

import java.util.List;
@Data
public class CallRecordsDto {
    private Long id;
    private String callerNumber;

    private List<CallRecordOperatorsDto> operators;

}
