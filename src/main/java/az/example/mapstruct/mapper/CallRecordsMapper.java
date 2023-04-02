package az.example.mapstruct.mapper;

import az.example.mapstruct.dto.CallRecordOperatorsDto;
import az.example.mapstruct.dto.CallRecordsDto;
import az.example.mapstruct.dto.OperatorDto;
import az.example.mapstruct.entity.CallRecordOperators;
import az.example.mapstruct.entity.CallRecords;
import az.example.mapstruct.entity.Operator;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface CallRecordsMapper {
    CallRecordsMapper INSTANCE = Mappers.getMapper(CallRecordsMapper.class);

    @Mapping(target = "operators", source = "callRecordOperators")
    CallRecordsDto callRecordsToCallRecordsDto(CallRecords callRecords);

    @Mapping(target = "callRecordOperators", source = "operators")
    CallRecords dtoToEntity(CallRecordsDto callRecordsDto);

    @Mapping(target = "operatorName", source = "name")
    OperatorDto operatorToDto(Operator operator);

    @Mapping(target = "name", source = "operatorName")
    Operator dtoToOperatorEntity(OperatorDto operatorDto);

    List<CallRecordsDto> callRecordsToCallRecordsDtos(List<CallRecords> callRecords);

    List<OperatorDto> mapToDtoList(List<Operator> operators);

    @Mapping(target = "callRecordsId", source = "callRecords.id")
    @Mapping(target = "operatorId", source = "operator.id")
    @Mapping(target = "operatorName", source = "operator.name")
    @Mapping(target = "currentTime", source = "startTime")
    CallRecordOperatorsDto callRecordOperatorsToDto(CallRecordOperators callRecordOperators);

    @Mapping(target = "startTime", source = "currentTime")
    @Mapping(target = "operator", source = "operatorId")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "callRecords", source = "callRecordsId")
    CallRecordOperators dtoToEntityCalRecOps(CallRecordOperatorsDto callRecordOperatorsDto);

    List<CallRecordOperatorsDto> callRecOpsDtos(List<CallRecordOperators> operatorsList);

    default CallRecords mapToCallRecords(Long id){
        CallRecords callRecords = new CallRecords();
        callRecords.setId(id);
        return callRecords;
    }

    default Operator mapToOperator(Long value){
        Operator operator = new Operator();
        operator.setId(value);
        return operator;
    }
}
