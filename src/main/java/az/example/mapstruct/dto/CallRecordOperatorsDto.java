package az.example.mapstruct.dto;

import lombok.Data;

@Data
public class CallRecordOperatorsDto {
    private Long callRecordsId;
    private Long operatorId;
    private String operatorName;
    private String currentTime;
    private String dialStatus;
}
